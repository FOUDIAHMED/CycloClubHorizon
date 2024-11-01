package ahmed.foudi.controller;

import ahmed.foudi.dto.generalresultdto.GeneraResultDTO;
import ahmed.foudi.entities.GeneralResult;
import ahmed.foudi.service.interfaces.GeneralResultServiceI;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/generalresults")
public class GeneralResultController {
    private final GeneralResultServiceI service;
    public GeneralResultController(GeneralResultServiceI service) {
        this.service = service;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<GeneraResultDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/{cyclistId}/{competitionId}", produces = "application/json")
    public GeneraResultDTO findById(@PathVariable("cyclistId") Long cyclistId, @PathVariable("competitionId") Long stageId) {
        return service.findById(cyclistId, stageId);
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

    @DeleteMapping(value = "delete/{cyclistId}/{competitionId}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("cyclistId") Long cyclistId, @PathVariable("competitionId") Long stageId) {
        service.delete(cyclistId,stageId);
    }


}
