package ahmed.foudi.controller;

import ahmed.foudi.entities.Team;
import ahmed.foudi.service.TeamService;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping
    public List<Team> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Team findById(@PathVariable("id") Long id) {
        return service.findById(id);
        //return RestPreconditions.checkFound(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Team resource) {
        Preconditions.checkNotNull(resource,"");
        service.save(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Team resource) {
        Preconditions.checkNotNull(resource,"");
        //RestPreconditions.checkNotNull(service.findById(resource.getId()));
        service.update(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

}
