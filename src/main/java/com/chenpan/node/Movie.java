package com.chenpan.node;

import com.chenpan.node.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;


@NodeEntity
public class Movie extends BaseEntity {

    private double rating;
   private int mid;
    private String releasedate;
   private String title;
   private String introduction;

   @Relationship(type = "IS")
   @JsonProperty("属于")
   private List<Genre> genres;

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Movie() {
    }

    public Movie(double rating, int mid, String releasedate, String title, String introduction) {
        this.rating = rating;
        this.mid = mid;
        this.releasedate = releasedate;
        this.title = title;
        this.introduction = introduction;
    }

    public double getRating() {
        return rating;
    }

    public int getMid() {
        return mid;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public String getTitle() {
        return title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
