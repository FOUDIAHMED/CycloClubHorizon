package ahmed.foudi.controller;

import ahmed.foudi.entities.Team;
import ahmed.foudi.service.TeamService;
import ahmed.foudi.service.interfaces.TeamServiceI;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {

    private final TeamServiceI service; // Use interface type

    public TeamController(TeamServiceI service) {
        this.service = service;
    }


    @GetMapping(value = "/all", produces = "application/json")
    public List<Team> findAll() {
        List<Team> teams = service.findAll();

        return teams;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Team findById(@PathVariable("id") Long id) {
        return service.findById(id);
        //return RestPreconditions.checkFound(service.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody Team resource) {
        if (resource == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        service.save(resource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Team resource) {
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
