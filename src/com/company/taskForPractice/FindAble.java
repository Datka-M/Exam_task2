package com.company.taskForPractice;

public interface FindAble {

    void getAllMovies(Movie[] movies);

    void findMovieByName(Movie[] movies);

    void findMovieByActorName(Movie[] movies);

    void findMovieByYear(Movie[] movies);

    void findMovieByDirector(Movie[] movies);

    void findMovieByDescription(Movie[] movies);

    void findMovieByRole(Movie[] movies);
//
////    Sortable:
//
//    void sortByMovieName(Movie[] movies);
//
////    -from A to Z
////    -from Z to A
//
//    void sortByDirector(Movie[] movies);
}
