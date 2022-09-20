package com.salles.apimarvel.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class MarvelCharacter {

    private BigDecimal id;
    private String name;
    private String description;
    private List<MarvelComics> comics;
    private List<MarvelEvents> events;
}
