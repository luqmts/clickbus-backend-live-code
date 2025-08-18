package br.com.clickbus.challenge.controller;


import br.com.clickbus.challenge.dto.PlaceDTO;
import br.com.clickbus.challenge.entity.Place;
import br.com.clickbus.challenge.exception.PlaceNotFoundException;
import br.com.clickbus.challenge.service.PlaceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api("places")
@RestController
@RequestMapping("places")
public class PlaceController {
    @Autowired
    private PlaceService service;

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid PlaceDTO dto) {
        return new ResponseEntity(service.save(dto.buildPlace()).convertToDTO(), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return service.findById(id)
          .map(place -> ResponseEntity.ok(place.convertToDTO()))
          .orElseThrow(() -> new PlaceNotFoundException(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity findAll(@RequestParam(required = false) String name) {
        if (name == null) return ResponseEntity.ok(PlaceDTO.convertToList(service.findAll()));

        List<Place> places = service.findByName(name);
        if (places.isEmpty()) throw new PlaceNotFoundException(HttpStatus.NOT_FOUND);

        return ResponseEntity.ok(PlaceDTO.convertToList(places));
    }

    @PutMapping("/{id}")
    public ResponseEntity alter(@PathVariable Long id, @RequestBody @Valid PlaceDTO placeDTO) {
        Place place = service.findById(id).orElseThrow(() -> new PlaceNotFoundException(HttpStatus.NOT_FOUND));
        return new ResponseEntity(service.alter(place, placeDTO).convertToDTO(), HttpStatus.OK);
    }
}
