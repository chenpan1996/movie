package com.chenpan.controller;

import com.chenpan.node.Movie;
import com.chenpan.node.Person;
import com.chenpan.repository.MovieReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieReopsitory movieReopsitory;

    //通过电影名称查询电影信息
    @RequestMapping("/get")
    public List<Movie> queryByMovieTitle(String title){
        return movieReopsitory.queryByMovieTitle(title);
    }

}
