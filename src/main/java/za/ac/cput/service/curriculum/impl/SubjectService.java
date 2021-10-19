package za.ac.cput.service.curriculum.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.curriculum.Subject;


import za.ac.cput.repository.curriculum.impl.SubjectRepository;

import za.ac.cput.service.curriculum.ISubjectService;

import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * Created SubjectService
 * Author: Shane Knoll (218279124)
 * 29 July2021
 */
@Service
public class SubjectService implements ISubjectService {
    @Autowired
    private SubjectRepository repository;

    @Override
    public Subject create(Subject subject) {
        return this.repository.save(subject);
    }

    @Override
    public Subject read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public Subject update(Subject subject) {
        if (this.repository.existsById(subject.getSubjectCode()))
            return this.repository.save(subject);
        return null;
    }

    @Override
    public boolean delete(String subjectCode) {
        this.repository.deleteById(subjectCode);
        if (this.repository.existsById(subjectCode))
            return false;
        else
            return true;
    }


    @Override
    public Set<Subject> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
    public Subject getSubjectGivenSubjectName(String subjectName) {
        Subject s = null;
        Set<Subject> subjects = getAll();
        for (Subject sub : subjects) {
            if (sub.getSubjectName().equals(subjectName)) {
                s = sub;
                break;
            }
        }
        return s;
    }
}


