package za.ac.cput.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.person.Lecturer;


import za.ac.cput.repository.person.impl.LecturerRepository;

import za.ac.cput.service.person.ILecturerService;

import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * Created LecturerService
 * Author: Shane Knoll (218279124)
 * 29 July2021
 */
@Service
public class LecturerService implements ILecturerService {

    @Autowired
    private LecturerRepository repository;


    @Override
    public Lecturer create(Lecturer lecturer) {
        return this.repository.save(lecturer);
    }

    @Override
    public Lecturer read(String s) {return this.repository.findById(s).orElse(null);
    }

    @Override
    public Lecturer update(Lecturer lecturer) {
        if (this.repository.existsById(lecturer.getLecturerID()))
            return this.repository.save(lecturer);
        return null;
    }

    @Override
    public boolean delete(String lecturerId) {
        this.repository.deleteById(lecturerId);
        if (this.repository.existsById(lecturerId))
            return false;
        else
            return true;
    }


    @Override
    public Set<Lecturer> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    public Lecturer getLecturerGivenFirstName(String firstName) {
        Lecturer l = null;
        Set<Lecturer> lecturers = getAll();
        for (Lecturer lect : lecturers) {
            if (lect.getFirstName().equals(firstName)) {
                l = lect;
                break;
            }
        }
        return l;
    }

}
