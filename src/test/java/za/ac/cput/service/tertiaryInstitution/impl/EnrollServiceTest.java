package za.ac.cput.service.tertiaryInstitution.impl;
/**
 *
 * EnrollServiceTest.java
 * Test of Enroll Service
 * @author Tisetso Kotoana
 * 30 July 2021
 *
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.tertiaryInstitution.Enroll;
import za.ac.cput.factory.tertiaryInstitution.EnrollFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EnrollServiceTest {
    private static EnrollService service;
    static Date d1 = new Date(2021,02,10);

    //I need to find a way to pass date is depracated
    private static Enroll enroll = EnrollFactory.build("202178456","ADP2021",d1,true);

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
        Enroll updated = new Enroll.EnrollBuilder().copy(enroll).setCourseCode("ADP7070").build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean deleted = service.delete(enroll.getStudentID());
        assertTrue(deleted);
        System.out.println("Delete: " + deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Details: \n" + service.getAll());
    }
}