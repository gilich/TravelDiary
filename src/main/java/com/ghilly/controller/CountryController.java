package com.ghilly.controller;



import com.ghilly.service.CountryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {


    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping ("/")
    public String createCountry(){
        return "This is the POST method from controller.";
    }

    @GetMapping("/")
    public String getCountries(){
        return "This is the GET method for all the countries from controller.";
    }

    @GetMapping("/{countryId}")
    public String getCountry(@PathVariable String countryId){
        return "This is the GET method for a country from controller " + countryId;
    }

    @PutMapping("/{countryId}")
    public String updateCountry(@PathVariable String countryId){
        return "This is the PUT method from controller " + countryId;
    }

    @DeleteMapping("/{countryId}")
    public String deleteCountry(@PathVariable String countryId){
        return "This is the DELETE method from controller " + countryId;
    }
}
