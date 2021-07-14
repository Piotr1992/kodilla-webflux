package com.kodilla.webflux;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@AllArgsConstructor
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDto {

    @JsonProperty("title")
    private final String title;

    @JsonProperty("author")
    private final String author;

    @JsonProperty("year")
    private final int year;

}