package za.ac.cput.service.tertiaryInstitution;
/**
 *
 * EnrollServiceTest.java
 * Test of Enroll Service
 * @author Tisetso Kotoana
 * 30 July 2021
 *
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.tertiaryInstitution.Enroll;
import za.ac.cput.factory.tertiaryInstitution.EnrollFactory;
import za.ac.cput.service.tertiaryInstitution.impl.EnrollService;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class EnrollServiceTest {
    @Autowired
    static Date d1 = new Date(2021, 02, 10);
    private EnrollService service;
    private static Enroll enroll = EnrollFactory.build("202178456", "ADP2021", d1, true);

    @Test
    void a_create() {
        Enroll created = service.create(enroll);
        assertEquals(enroll.getStudentID(), created.getStudentID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Enroll read = service.read(enroll.getStudentID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Enroll updated = new Enroll.EnrollBuilder().copy(enroll).setCourseCode("ADP676").build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean accept = service.delete(enroll.getStudentID());
        assertTrue(accept);
        System.out.println("Delete: " + accept);
    }

    @Test
    void d_getAll() {
        System.out.println("Display All: \n" + service.getAll());
    }

}