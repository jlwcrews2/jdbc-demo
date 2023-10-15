package no.jlwcrews.jdbcdemo.controller;

import no.jlwcrews.jdbcdemo.model.Part;
import no.jlwcrews.jdbcdemo.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/part")
public class PartsController {

    private final PartsService partsService;

    @Autowired
    public PartsController(PartsService partsService) {
        this.partsService = partsService;
    }

    @GetMapping("/parts")
    public ResponseEntity<List<Part>> getParts() {
        return ResponseEntity.ok(partsService.getParts());
    }

    @PostMapping
    public ResponseEntity<Part> createPart(@RequestBody Part part) {
        return ResponseEntity.ok(partsService.addPart(part));
    }

    @DeleteMapping
    public ResponseEntity<String> deletePart(@RequestBody Part part) {
        partsService.deletePart(part);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Part> updatePart(@RequestBody Part part) {
        return ResponseEntity.ok(partsService.updatePart(part));
    }


}
