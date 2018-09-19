package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] Args){
        MovieStore store = new MovieStore();

        System.out.println(store.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining("!")));
    }
}
