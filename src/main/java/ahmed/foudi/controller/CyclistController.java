package ahmed.foudi.controller;

import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import ahmed.foudi.dto.cyclistdto.cyclistResponseDTO;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.entities.Team;
import ahmed.foudi.service.interfaces.CyclistServiceI;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/cyclists")
public class CyclistController {
    private final CyclistServiceI service;


    public CyclistController(CyclistServiceI service) {
        this.service = service;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<cyclistDTO> findAll() {

        return service.findAll();
    }

    @GetMapping("/test/cyclist")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public cyclistResponseDTO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody Cyclist resource) {
        if (resource == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        service.save(resource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Cyclist resource) {
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
