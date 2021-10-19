package za.ac.cput.factory.physical;
/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.physical.Room;

import static org.junit.jupiter.api.Assertions.*;

class RoomFactoryTest {

    @Autowired
    @Test
    void build(){
        Room build = RoomFactory.build("Theatre", "101",100, 1, 001);
        System.out.println(build);
        assertNotNull(build);
        assertEquals(build, build);
    }

}