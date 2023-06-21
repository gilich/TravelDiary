package com.ghilly.controller;

import com.ghilly.classes.Country;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface Controller {
    @PostMapping("/")
    void create(@RequestBody String countryName);

    @GetMapping("/")
    List<Country> getList();

    @GetMapping("/{countryId}")
    String getName(@PathVariable int countryId);

    @PutMapping("/{countryId}")
    void update(@PathVariable int countryId, @RequestBody String newName);

    @DeleteMapping("/{countryId}")
    void delete(@PathVariable int countryId);
}
