package com.doutoutdou.aotw.kotlin.service

import com.doutoutdou.aotw.kotlin.dto.ContinentDto
import com.doutoutdou.aotw.kotlin.dto.ContinentMapper
import com.doutoutdou.aotw.kotlin.repository.ContinentRepository
import org.springframework.stereotype.Service

@Service
class ContinentService(val repository: ContinentRepository, val mapper: ContinentMapper) {
    fun listContinents(): List<ContinentDto> {
        return repository.findAll().map { continentEntity -> mapper.toDto(continentEntity) }
    }

    fun getContinent(id: Long): ContinentDto? {
        // un peu moche mais oblige de transformer loptional pour tenter dutiliser lapi kotlin
        val continentDto = repository.findById(id).orElse(null)
        return continentDto?.let { continentEntity -> mapper.toDto(continentEntity) }
    }

    fun createContinent(continentDto: ContinentDto): ContinentDto{
       return repository.save(mapper.toEntity(continentDto)).let { continentEntity -> mapper.toDto(continentEntity)  }
    }

    fun deleteContinent(id: Long) {
        return repository.deleteById(id)
    }
}