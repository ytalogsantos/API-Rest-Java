package com.project.apirestjava.controller;

import com.project.apirestjava.entity.Animes;
import com.project.apirestjava.service.AnimesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimesController {
    @Autowired
    AnimesService animesService;

    @GetMapping
    @Operation(summary = "Anime List", description = "Show a list with id, title and number of episodes of each anime")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Requisition completed sucessfully."),
            @ApiResponse(responseCode = "400", description = "Invalid requisiton."),
            @ApiResponse(responseCode = "403", description = "You're not allowed to access this content."),
            @ApiResponse(responseCode = "404", description = "Content not founded.")
    })
    public ResponseEntity<List<Animes>> getAll() {
        List<Animes> animes = animesService.getAll();
        if (!animes.isEmpty()) {
            return new ResponseEntity<>(animes, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animes> getById(@PathVariable Integer id) {
        Animes anime = animesService.getById(id);
        if(anime != null)
            return new ResponseEntity<>(anime, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Animes> saveAnime(@RequestBody Animes anime) {
        return new ResponseEntity<>(animesService.saveAnime(anime), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteAnime(@PathVariable Integer id) {
        if(animesService.deleteAnime(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(false, HttpStatus.OK);
        }

    }
}
