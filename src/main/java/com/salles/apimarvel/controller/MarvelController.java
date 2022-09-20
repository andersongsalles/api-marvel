package com.salles.apimarvel.controller;

import com.salles.apimarvel.dto.MarvelCharacter;
import com.salles.apimarvel.service.MarvelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MarvelController {

    @Autowired
    private MarvelService service;

    public ResponseEntity<List<MarvelCharacter>> findCharacters(@PathVariable("name") String name){
        return ResponseEntity.ok(service.findCharacters(name));
    }
}
