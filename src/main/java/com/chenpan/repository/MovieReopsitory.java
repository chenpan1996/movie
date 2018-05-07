package com.chenpan.repository;

import com.chenpan.node.Movie;
import com.chenpan.node.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieReopsitory extends GraphRepository<Movie> {

    //通过电影名字查询电影信息
    @Query("match(n:Movie) where n.title = {title} return n")
    List<Movie> queryByMovieTitle(@Param("title") String title);

}
