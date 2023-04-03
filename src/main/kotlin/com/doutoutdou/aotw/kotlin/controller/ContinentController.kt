package com.doutoutdou.aotw.kotlin.controller

import com.doutoutdou.aotw.kotlin.dto.ContinentDto
import com.doutoutdou.aotw.kotlin.service.ContinentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
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
    fun getContinent(@PathVariable id: Long): ResponseEntity<ContinentDto> {
        val dto = service.getContinent(id)
        return dto?.let {c -> ResponseEntity.ok(c)  } ?: ResponseEntity.notFound().build()
    }

    @PostMapping
    fun createContinent(@RequestBody continentDto: ContinentDto) : ResponseEntity<ContinentDto> {
        // TODO : gerer lerreur si jamais le continent existe deja avec le meme nom
        return ResponseEntity.ok(service.createContinent(continentDto))
    }

    @DeleteMapping("/{id}")
    fun deleteContinent(@PathVariable id: Long) {
        // TODO : gerer le fait de vouloir supprimer un id qui nexiste pas
        service.deleteContinent(id)
    }


}
