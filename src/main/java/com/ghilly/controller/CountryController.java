package com.ghilly.controller;



import com.ghilly.classes.Country;
import com.ghilly.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {


    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping ("/")
    public void create( String name){
        countryService.add(name);
    }

    @GetMapping("/")
    public List <Country> getCountries(){
        return countryService.receiveList();
    }

    @GetMapping("/{countryId}")
    public String getCountry(@PathVariable int countryId){
        return countryService.receiveCountry(countryId);
    }

    @PutMapping("/{countryId}")
    public void update(@PathVariable int countryId, String newName){
        countryService.upgrade(countryId, newName);
    }

    @DeleteMapping("/{countryId}")
    public void delete(@PathVariable int countryId){
        countryService.clear(countryId);
    }
}
