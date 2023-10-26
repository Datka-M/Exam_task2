package com.company.taskForPractice;

public class Main {
    /**
     * Movie:
     * private String name;
     * private int year;
     * private String description;
     * private Director director;
     * private Cast[] casts;
     *
     * Cast:
     * private String actorFullName;
     * private String role;
     *
     * Director:
     * private String name;
     * private String lastName;
     *
     * Findable деген Interface тузунуз методдору:
     *
     * void getAllMovies(Movie[] movies);
     * void findMovieByName(Movie[] movies);
     * void findMovieByActorName(Movie[] movies);
     * void findMovieByYear(Movie[] movies);
     * void findMovieByDirector(Movie[] movies);
     * void findMovieByDescription(Movie[] movies);
     * void findMovieByRole(Movie[] movies);
     *
     * DataBase деген класс болот ошол класс FindAble классын implements кылып методдорун ишке ашырат
     *
     * * Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
     *       Бардык маалыматтар туура жана так болуп консольго чыксын.
     */
    public static void main(String[] args) {

        Cast cast = new Cast("KD", "Main hero1");
        Cast cast1 = new Cast("MD", "Main hero");
        Cast cast2 = new Cast("DD", "Hero");
        Movie movie = new Movie(
                "Harry Potter",
                1990,
                "Description",
                new Director("Datka", "M"),
                new Cast[]{cast2});

        Movie movie1 = new Movie(
                "sddf",
                2010,
                "ksdfk",
                new Director("dfn", "disnf"),
                new Cast[]{cast, cast1});


        Movie[] movieArray = new Movie[]{movie, movie1};
        DataBase dataBase = new DataBase();
        dataBase.findMovieByRole(movieArray);
    }
}
