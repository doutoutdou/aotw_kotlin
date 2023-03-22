package com.doutoutdou.aotw.kotlin.controller

import com.doutoutdou.aotw.kotlin.model.Country
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/countries")
class CountryController{

    @GetMapping
    fun getCountries() : ResponseEntity<List<Country>> {
        val country1 = Country("country1")
        val country2 = Country("country2")

        return ResponseEntity.ok(listOf(country1, country2));
    }


}