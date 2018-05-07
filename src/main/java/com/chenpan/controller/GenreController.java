package com.chenpan.controller;


import com.chenpan.node.Genre;
import com.chenpan.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    GenreRepository genreRepository;
    @RequestMapping("/get")

    //通过类型名查询类型信息
    public Genre GetGenreByGname(@RequestParam(value = "gname")String gname){
        return genreRepository.findByGname(gname);
    }
}
