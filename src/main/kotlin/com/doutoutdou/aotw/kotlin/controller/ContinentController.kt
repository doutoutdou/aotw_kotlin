package com.doutoutdou.aotw.kotlin.controller

import com.doutoutdou.aotw.kotlin.model.Continent
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/continents")
class ContinentController {

    @GetMapping
    fun getContinents() : ResponseEntity<List<Continent>> {
        var c1 = Continent("continent1")
        var c2 = Continent("continent2")
        return ResponseEntity.ok(listOf(c1, c2));
    }
    @GetMapping("/{id}")
    fun getContinent(@PathVariable id:String) : ResponseEntity<Continent> {

        return ResponseEntity.ok(Continent("name$id"));

    }
}