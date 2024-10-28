package ahmed.foudi.controller;

import ahmed.foudi.entities.GeneralResult;
import ahmed.foudi.service.interfaces.GeneralResultServiceI;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class GeneralResultController {
    private final GeneralResultServiceI service;
    public GeneralResultController(GeneralResultServiceI service) {
        this.service = service;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<GeneralResult> findAll() {
        List<GeneralResult> results = service.findAll();

        return results;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public GeneralResult findById(@PathVariable("id") Long id) {
        return service.findById(id);
        //return RestPreconditions.checkFound(service.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody GeneralResult resource) {
        if (resource == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        service.save(resource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody GeneralResult resource) {
        Preconditions.checkNotNull(resource,"");
        service.update(resource);
    }

    @DeleteMapping(value = "delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }


}
