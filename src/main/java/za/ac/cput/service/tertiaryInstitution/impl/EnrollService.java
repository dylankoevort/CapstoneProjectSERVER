package za.ac.cput.service.tertiaryInstitution.impl;
/**
 *
 * EnrollService.java
 * Implementation of Enroll Service
 * @author Tisetso Kotoana
 * 30 July 2021
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.tertiaryInstitution.Enroll;
import za.ac.cput.repository.tertiaryInstitution.impl.EnrollRepository;
import za.ac.cput.service.tertiaryInstitution.IEnrollService;

import java.util.Set;
import java.util.stream.Collectors;

public class EnrollService implements IEnrollService {
    private static EnrollService service = null;

    @Autowired
    private EnrollRepository repository;

    @Override
    public Enroll create(Enroll enroll){
        return this.repository.save(enroll);
    }

    @Override
    public Enroll read(String x){
        return this.repository.findById(x).orElse(null);
    }

    @Override
    public Enroll update(Enroll enroll) {
        if(this.repository.existsById(enroll.getStudentID()))
            return this.repository.save(enroll);
        return null;
    }

    @Override
    public boolean delete(String studentID) {
        this.repository.deleteById(studentID);
        if (this.repository.existsById(studentID))
            return false;
        else
            return true;
    }

    @Override
    public Set<Enroll> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    public Enroll getStudentID(String studentID) {
        Enroll ab = null;
        Set<Enroll> enrolls = getAll();
        for(Enroll enroll : enrolls){
            if(enroll.getStudentID().equals(studentID)){
                ab = enroll;
                break;
            }
        }
        return ab;
    }
}