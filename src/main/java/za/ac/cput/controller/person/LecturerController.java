package za.ac.cput.controller.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.person.Lecturer;
import za.ac.cput.factory.person.LecturerFactory;
import za.ac.cput.service.person.impl.LecturerService;

import java.util.Set;

/**
 *
 * Created LecturerController class.
 * Author: Shane Knoll (218279124)
 * Date:13 August 2021
 */
@RestController
@RequestMapping("/lecturer")
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    @PostMapping("/create")
    public  Lecturer create(@RequestBody Lecturer lec){
        Lecturer l = LecturerFactory.build(lec.getFirstName(),lec.getLastName(),lec.getAge(), lec.getEmailAddress(), lec.getContactNo());
        return  lecturerService.create(l);
    }
    @GetMapping("/read/{id}")
    public Lecturer read(@PathVariable String id) {
        return lecturerService.read(id);
    }

    @PostMapping("/update")
    public Lecturer update(@RequestBody Lecturer lecturer) {
        return lecturerService.update(lecturer);
    }

    @PostMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return lecturerService.delete(id);
    }


    @GetMapping("/getall")
    public Set<Lecturer> getAll() {
        return lecturerService.getAll();
    }



}
