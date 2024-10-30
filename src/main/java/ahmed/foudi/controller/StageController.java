package ahmed.foudi.controller;

import ahmed.foudi.dto.stagedto.StageDTO;
import ahmed.foudi.entities.Stage;
import ahmed.foudi.entities.Team;
import ahmed.foudi.service.interfaces.StageServiceI;
import ahmed.foudi.service.interfaces.TeamServiceI;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stages")
public class StageController {
    private final StageServiceI service; // Use interface type

    public StageController(StageServiceI service) {
        this.service = service;
    }


    @GetMapping(value = "/all", produces = "application/json")
    public List<StageDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public StageDTO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody Stage resource) {
        if (resource == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        service.save(resource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Stage resource) {
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
