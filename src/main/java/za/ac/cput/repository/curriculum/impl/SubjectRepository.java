package za.ac.cput.repository.curriculum.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.curriculum.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, String> {}
