package com.university.oguzhan.lastfirebase;

public class Profile {
    private String name;
    private String description;
    private String year;
    private String moviepic;
    private String director;

    public Profile() {
    }

    public Profile(String name, String description, String year, String moviepic, String director) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.moviepic = moviepic;
        this.director=director;
    }

    public String getName() {
        return name;
    }

    public String getMoviepic() {
        return moviepic;
    }

    public void setMoviepic(String moviepic) {
        this.moviepic = moviepic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
