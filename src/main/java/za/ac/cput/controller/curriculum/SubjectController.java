package za.ac.cput.controller.curriculum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.curriculum.Subject;

import za.ac.cput.factory.curriculum.SubjectFactory;

import za.ac.cput.service.curriculum.impl.SubjectService;


import java.util.Set;

/**
 *
 * Created SubjectController class.
 * Author: Shane Knoll (218279124)
 * Date:13 August 2021
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/create")
    public Subject  create(@RequestBody Subject s){
        Subject  su = SubjectFactory.build(s.getSubjectName(),s.getLecturerID(),s.getCourseCode(),s.getSemesterID());
        return  subjectService.create(su);
    }
    @GetMapping("/read/{id}")
    public Subject read(@PathVariable String id) {
        return subjectService.read(id);
    }

    @PostMapping("/update")
    public Subject update(@RequestBody Subject subject) {
        return subjectService.update(subject);
    }

    @PostMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return subjectService.delete(id);
    }


    @GetMapping("/getall")
    public Set<Subject> getAll() {
        return subjectService.getAll();
    }


}
