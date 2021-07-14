package com.kodilla.webflux;

import reactor.core.publisher.Flux;

public class FirstFluxCheck {

    public static void main(String[] args) {
/*        Book b1 = new Book("Title1", "Author1", 2000);
        Book b2 = new Book("Title2", "Author2", 2001);          */

        BookDto bookDto1 = new BookDto("TitleDto1", "AuthorDto1", 1995);
        BookDto bookDto2 = new BookDto("TitleDto2", "AuthorDto2", 1997);
        Flux<BookDto> bookFlux = Flux.just(bookDto1, bookDto2);
        bookFlux = bookFlux.concatWith(Flux.error(new Exception("Test exception")));
        bookFlux.subscribe(System.out::println, FirstFluxCheck::handleException);
    }

    private static void handleException(Throwable e) {
        System.out.println("There was an error: " + e);
    }

}