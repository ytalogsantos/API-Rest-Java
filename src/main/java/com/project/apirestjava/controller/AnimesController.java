package com.project.apirestjava.controller;

import com.project.apirestjava.entity.Animes;
import com.project.apirestjava.service.AnimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimesController {
    @Autowired
    AnimesService animesService;

    @GetMapping
    public ResponseEntity<List<Animes>> getAll() {
        List<Animes> animes = animesService.getAll();
        if (!animes.isEmpty()) {
            return new ResponseEntity<>(animes, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
