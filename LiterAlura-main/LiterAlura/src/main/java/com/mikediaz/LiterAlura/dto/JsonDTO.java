package com.mikediaz.LiterAlura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record JsonDTO(
        @JsonAlias("results")
        List<BookDTO> bookResults
) {
}
