package za.ac.cput.factory.tertiaryInstitution;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.tertiaryInstitution.Semester;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * SemesterFactoryTest.java
 * TTD for SemesterFactoryTest
 * Author: Tisetso Kotoana
 * Date:10 June 2021
 */

class SemesterFactoryTest {
    Date d1 = new Date(2021,02,10);
    Date d2 = new Date(2021,05,01);

    @Test
    void Semester() {

        Semester build = SemesterFactory.build("2021ICT","14/03/2021", "23/06/2021");
        System.out.print(build);
        assertNotNull(build);
        assertEquals(build,build);


    }
}