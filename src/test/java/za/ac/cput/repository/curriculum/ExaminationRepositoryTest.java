package za.ac.cput.repository.curriculum;

/**
 *
 * ExaminationRepositoryTest.java
 * Test cases for Examination Repository implementation
 * @author Dylan Koevort 218088159
 * 19 July 2021
 *
 * ExaminationRepositoryTest.java
 * Refactored date to localDate by Dinelle Kotze 219089302
 * 31 July 2021
 *
 *//*


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.Examination;
import za.ac.ExaminationFactory;
import za.ac.ExaminationRepository;

//import java.util.Calendar;
//import java.util.Date;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ExaminationRepositoryTest {
    private static ExaminationRepository repository = ExaminationRepository.getRepository();
    //private static Date date = new Date(121, Calendar.NOVEMBER, 15);
    private static Examination examination = ExaminationFactory.build(10077, "Project Management", "2021/10/28");

    @Test
    void a_create() {
        Examination created = repository.create(examination);
        assertEquals(examination.getExamId(), created.getExamId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Examination read = repository.read(examination.getExamId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Examination updated = new Examination.Builder().copy(examination).setSubjectCode(10777).build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean ok = repository.delete(examination.getExamId());
        assertTrue(ok);
        System.out.println("Delete: " + ok);
    }

    @Test
    void d_getAll() {
        System.out.println("Display All: \n" + repository.getAll());
    }
}*/
