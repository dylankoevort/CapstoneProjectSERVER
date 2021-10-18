package za.ac.cput.repository.tertiaryInstitution.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.tertiaryInstitution.Enroll;

/**
 * EnrollRepository.java
 * DDD for Enroll Repository
 * Author: Tisetso Kotoana
 * Date: 15 September 2021
 */
@Repository
public interface EnrollRepository extends JpaRepository<Enroll, String> {
}