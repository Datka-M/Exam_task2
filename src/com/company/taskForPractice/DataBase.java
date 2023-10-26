package com.company.taskForPractice;

import java.util.Scanner;

public class DataBase implements FindAble {

    private Movie[] movies;


    @Override
    public void getAllMovies(Movie[] movies) {

    }

    @Override
    public void findMovieByName(Movie[] movies) {

    }

    @Override
    public void findMovieByActorName(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getCasts()) {
                if (c.getActorFullName().equals(actorName)) {
                    System.out.println(m.toString());
                }
            }
        }
    }

    @Override
    public void findMovieByYear(Movie[] movies) {

    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getDirector().getFirstName().equals(name)) {
                System.out.println(m.toString());
            }
        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {

    }

    @Override
    public void findMovieByRole(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();
        for (Movie me : movies) {
            for (Cast cast : me.getCasts()) {
                if (cast.getRole().toUpperCase().contains(role.toUpperCase())) {
                    System.out.println(me);
                }
            }
        }
    }

//    @Override
//    public void sortByMovieName(Movie[] movies) {
//
//    }
//
//    @Override
//    public void sortByDirector(Movie[] movies) {
//
//    }
}
