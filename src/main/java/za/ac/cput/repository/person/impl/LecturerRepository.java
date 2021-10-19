package za.ac.cput.repository.person.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.person.Lecturer;
@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, String> {}
