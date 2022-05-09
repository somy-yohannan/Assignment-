package management.system.contact.controller;

import management.system.contact.model.Details;
import management.system.contact.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/details")
public class DetailsController {

    @Autowired
    DetailsService service;

    @PostMapping("/save")
    public ResponseEntity<Details> saveDetails(@RequestBody Details details) {
        try {
            return new ResponseEntity<>(service.save(details), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


   @PostMapping("/saveall")
    public List<Details> saveAllDetails(@RequestBody List<Details> details) {
        List<Details> list = new ArrayList<Details>();
        for (Details d : list) {
            list.add(d);
        }
        service.saveAllDetails(list);
        return details;
    }


    @GetMapping("/findall")
    public ResponseEntity<List<Details>> findAll() {
        try {
            List<Details> list = service.findAll();
            if (list.isEmpty()) {
                return new ResponseEntity<List<Details>>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/find/{id}")
    public Optional<Details> findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        Optional<Details> list = service.findById(id);
        if (list.isEmpty()) {
            return "item not found";
        } else {
            service.deleteById(id);
            return "Deleted Successfully";
        }
    }
}



