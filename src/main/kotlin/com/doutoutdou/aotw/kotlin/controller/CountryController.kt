package com.doutoutdou.aotw.kotlin.controller

import com.doutoutdou.aotw.kotlin.dto.CountryDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/countries")
class CountryController {

    @GetMapping
    fun getCountries(): ResponseEntity<List<CountryDto>> {
        val countryDto1 = CountryDto("country1")
        val countryDto2 = CountryDto("country2")

        return ResponseEntity.ok(listOf(countryDto1, countryDto2));
    }


}