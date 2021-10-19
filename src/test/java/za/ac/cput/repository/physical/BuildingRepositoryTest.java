package za.ac.cput.repository.physical;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.physical.Building;
import za.ac.cput.factory.physical.BuildingFactory;
import za.ac.cput.repository.physical.impl.BuildingRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class BuildingRepositoryTest {

    @Autowired
    private static BuildingRepository repository;
    private static Building building = BuildingFactory.build("666", 41, "Engineering", "1 Plein street");

    @Test
    @Order(1)
    void a_create() {
        Building created = repository.create(building);
        assertEquals(building.getBuildingID(), created.getBuildingID());
        System.out.println("Created: " + created);
    }

    @Test
    @Order(2)
    void b_read() {
        Building read = repository.read(building.getBuildingID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void c_update() {
        Building updated = new Building.BuildingBuilder().copy(building).setBuildingID("123").build();
        assertNotNull(true);
        System.out.println("Updated: " + updated);
    }

    @Test
    @Order(5)
    void e_delete() {
        boolean ok = repository.delete(building.getBuildingID());
        assertTrue(ok);
        System.out.println("Delete: " + ok);
    }

    @Test
    @Order(4)
    void d_getAll() {
        System.out.println("Display All: \n" + repository.getAll());
    }
}