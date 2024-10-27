package ahmed.foudi.controller;

import ahmed.foudi.entities.Competition;
import ahmed.foudi.entities.Team;
import ahmed.foudi.service.interfaces.CompetitionServiceI;
import ahmed.foudi.service.interfaces.TeamServiceI;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CompetitionController {


    private final CompetitionServiceI service; // Use interface type

    public CompetitionController(CompetitionServiceI service) {
        this.service = service;
    }


    @GetMapping(value = "/all", produces = "application/json")
    public List<Competition> findAll() {
        List<Competition> competitions = service.findAll();

        return competitions;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Competition findById(@PathVariable("id") Long id) {
        return service.findById(id);
        //return RestPreconditions.checkFound(service.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody Competition resource) {
        if (resource == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        service.save(resource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Competition resource) {
        Preconditions.checkNotNull(resource,"");
        resource.setId(id);
        service.update(resource);
    }

    @DeleteMapping(value = "delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}