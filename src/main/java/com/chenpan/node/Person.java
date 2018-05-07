package com.chenpan.node;


import com.chenpan.node.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;


@NodeEntity
public class Person extends BaseEntity {
    private int pid;
    private String birthday;
    private String deathday;
    private String name;
    private String biography;
    private String birthplace;

    @Relationship(type = "ACTED_IN")
    @JsonProperty("出演")
    public List<Movie> movies;

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Person() {
    }

    public int getPid() { return pid; }

    public String getBirthday() { return birthday; }

    public String getDeathday() { return deathday; }

    public String getName() { return name; }

    public String getBiography() { return biography; }

    public String getBirthplace() { return birthplace; }

    public void setPid(int pid) { this.pid = pid; }

    public void setBirthday(String birthday) { this.birthday = birthday; }

    public void setDeathday(String deathday) { this.deathday = deathday; }

    public void setName(String name) { this.name = name; }

    public void setBiography(String biography) { this.biography = biography; }

    public void setBirthplace(String birthplace) { this.birthplace = birthplace; }
}
