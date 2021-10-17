package za.ac.cput.service.tertiaryInstitution;
/**
 *
 * ISemesterService.java
 * Implementation of Semester Service
 * @author Tisetso Kotoana
 * 30 July 2021
 *
 */

import za.ac.cput.entity.tertiaryInstitution.Semester;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ISemesterService extends IService<Semester, String> {
    Set<Semester> getAll();
}