package com.salles.apimarvel.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MarvelComics {

    private String title;
    private BigDecimal issueNumber;
}
