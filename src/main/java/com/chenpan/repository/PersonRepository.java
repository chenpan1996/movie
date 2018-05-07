package com.chenpan.repository;

import com.chenpan.node.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends GraphRepository<Person> {
    Person findByName(@Param("name")String name);

    //查询某位演员信息
    @Query("match(n:Person) where n.name = {name} return n")
    List<Person> queryByPersonName(@Param("name")String name);
}
