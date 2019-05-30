package com.stackroute.springJdbc.domain;

public class Movie {

    private int id;
    private String movieName;
    private String actorName;
    private int releaseYear;
    private float ratings;;

    public Movie( int id,String movieName, String actorName, int releaseYear, float ratings) {

        this.id = id;
        this.movieName = movieName;
        this.actorName = actorName;
        this.releaseYear = releaseYear;
        this.ratings = ratings;
    }

    public Movie() {

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", releaseYear=" + releaseYear +
                ", ratings=" + ratings +
                '}';
    }
}

