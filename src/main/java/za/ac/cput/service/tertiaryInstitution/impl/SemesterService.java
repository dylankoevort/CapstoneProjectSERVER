package za.ac.cput.service.tertiaryInstitution.impl;

/**
 *
 * SemesterService.java
 * Implementation of Semester Service
 * @author Tisetso Kotoana
 * 30 July 2021
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.tertiaryInstitution.Semester;
import za.ac.cput.entity.tertiaryInstitution.Semester;
import za.ac.cput.repository.tertiaryInstitution.ISemesterRepository;
import za.ac.cput.repository.tertiaryInstitution.impl.EnrollRepository;
import za.ac.cput.repository.tertiaryInstitution.impl.SemesterRepository;
import za.ac.cput.service.tertiaryInstitution.IEnrollService;
import za.ac.cput.service.tertiaryInstitution.ISemesterService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SemesterService implements ISemesterService {
    private static SemesterService service = null;

    @Autowired
    private SemesterRepository repository;

    @Override
    public Semester create(Semester enroll){
        return this.repository.save(enroll);
    }

    @Override
    public Semester read(String ab){
        return this.repository.findById(ab).orElse(null);
    }

    @Override
    public Semester update(Semester semester) {
        if(this.repository.existsById(semester.getSemesterID()))
            return this.repository.save(semester);
        return null;
    }

    @Override
    public boolean delete(String semesterID) {
        this.repository.deleteById(semesterID);
        if (this.repository.existsById(semesterID))
            return false;
        else
            return true;
    }

    @Override
    public Set<Semester> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    public Semester getSemesterID(String semesterID) {
        Semester ab = null;
        Set<Semester> enrolls = getAll();
        for(Semester enroll : enrolls){
            if(enroll.getSemesterID().equals(semesterID)){
                ab = enroll;
                break;
            }
        }
        return ab;
    }
}