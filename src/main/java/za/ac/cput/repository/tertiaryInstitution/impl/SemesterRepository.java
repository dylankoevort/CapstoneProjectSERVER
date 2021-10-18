package za.ac.cput.repository.tertiaryInstitution.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.tertiaryInstitution.Semester;

/**
 * SemesterRepository.java
 * DDD for Semester Repository
 * Author: Tisetso Kotoana
 * Date: 15 Sepetember 2021
 */

@Repository
public interface SemesterRepository extends JpaRepository<Semester, String> {
}