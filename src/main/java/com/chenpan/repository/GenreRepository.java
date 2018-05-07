package com.chenpan.repository;

import com.chenpan.node.Genre;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends GraphRepository<Genre> {
    Genre findByGname(@Param("gname")String gname);
}
