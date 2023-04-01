package com.doutoutdou.aotw.kotlin.controller

import com.doutoutdou.aotw.kotlin.dto.ContinentDto
import com.doutoutdou.aotw.kotlin.service.ContinentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/continents")
class ContinentController(val service: ContinentService) {

    @GetMapping
    fun getContinents(): ResponseEntity<List<ContinentDto>> {
        return ResponseEntity.ok(service.listContinents())
    }

    @GetMapping("/{id}")
    fun getContinent(@PathVariable id: String): ResponseEntity<ContinentDto> {
//        val continent = continents[id]
//        return if (continent != null) {
//            ResponseEntity.ok(continent)
//        } else {
        return ResponseEntity.notFound().build()
//        }
    }
}
