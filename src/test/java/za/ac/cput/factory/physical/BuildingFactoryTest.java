package za.ac.cput.factory.physical;
/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.physical.Building;

import static org.junit.jupiter.api.Assertions.*;

class BuildingFactoryTest {

    @Autowired
    @Test
    void build() {
        Building build = BuildingFactory.build("001", 100, "Administration Building", "01 Sesame street, Sesame Town, ABC123");
        System.out.println(build);
        assertNotNull(build);
        assertEquals(build, build);
    }

}