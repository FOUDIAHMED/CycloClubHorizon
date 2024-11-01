package ahmed.foudi.controller;

import ahmed.foudi.dto.resultdto.ResultDTOResponse;
import ahmed.foudi.entities.Result;
import ahmed.foudi.service.interfaces.ResultServiceI;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/results")
public class ResultController {
    private final ResultServiceI service; // Use interface type

    public ResultController(ResultServiceI service) {
        this.service = service;
    }


    @GetMapping(value = "/all", produces = "application/json")
    public List<Result> findAll() {
        List<Result> results = service.findAll();

        return results;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/{cyclistId}/{stageId}", produces = "application/json")
    public Result findById(@PathVariable("cyclistId") Long cyclistId, @PathVariable("stageId") Long stageId) {
        return service.findById(cyclistId,stageId);
        //return RestPreconditions.checkFound(service.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody Result resource) {
        if (resource == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        service.save(resource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



    @DeleteMapping(value = "delete/{cyclistId}/{stageId}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("cyclistId") Long cyclistId, @PathVariable("stageId") Long stageId) {
        service.delete(cyclistId, stageId);
    }


}
