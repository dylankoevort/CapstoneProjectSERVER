//package za.ac.cput.repository.physical;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import za.ac.cput.entity.physical.Room;
//import za.ac.cput.factory.physical.RoomFactory;
//import za.ac.cput.repository.physical.impl.RoomRepository;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class RoomRepositoryTest {
//
//    @Autowired
//    private static RoomRepository repository;
//    private static Room room = RoomFactory.build( "A", "123", 100, 2, 1);
//
//    @Test
//    @Order(1)
//    void a_create() {
//        Room created = repository.create(room);
//        assertEquals(room.getRoomCode(), created.getRoomCode());
//        System.out.println("Created: " + created);
//    }
//
//    @Test
//    @Order(2)
//    void b_read() {
//        Room read = repository.read(room.getRoomCode());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//    }
//
//    @Test
//    @Order(3)
//    void c_update() {
//        Room updated = new Room.RoomBuilder().copy(room).setRoomCode("666").build();
//        assertNotNull(true);
//        System.out.println("Updated: " + updated);
//    }
//
//    @Test
//    @Order(5)
//    void e_delete() {
//        boolean ok = repository.delete(room.getRoomCode());
//        assertTrue(ok);
//        System.out.println("Delete: " + ok);
//    }
//
//    @Test
//    @Order(4)
//    void d_getAll() {
//        System.out.println("Display All: \n" + repository.getAll());
//    }
//
//}