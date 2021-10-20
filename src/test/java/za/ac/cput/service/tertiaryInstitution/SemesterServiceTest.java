package za.ac.cput.service.tertiaryInstitution;
/**
 *
 * SemesterServiceTest.java
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
import za.ac.cput.entity.tertiaryInstitution.Semester;
import za.ac.cput.entity.tertiaryInstitution.Semester;
import za.ac.cput.factory.tertiaryInstitution.EnrollFactory;
import za.ac.cput.factory.tertiaryInstitution.SemesterFactory;
import za.ac.cput.service.tertiaryInstitution.impl.EnrollService;
import za.ac.cput.service.tertiaryInstitution.impl.SemesterService;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class SemesterServiceTest {
    @Autowired
    static Date d1 = new Date(2021, 02, 10);
    static Date d2 = new Date(2021, 06, 10);

    private SemesterService service;
    private static Semester semester = SemesterFactory.build("202178456", "14/03/2021", "23/06/2021");

    @Test
    void a_create() {
        Semester created = service.create(semester);
        assertEquals(semester.getSemesterID(), created.getSemesterID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Semester read = service.read(semester.getSemesterID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
         Date d1 = new Date(2021, 06, 10);
        Semester updated = new Semester.SemesterBuilder().copy(semester).setSemesterStart("21/02/2021").build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean accept = service.delete(semester.getSemesterID());
        assertTrue(accept);
        System.out.println("Delete: " + accept);
    }

    @Test
    void d_getAll() {
        System.out.println("Display All: \n" + service.getAll());
    }

}