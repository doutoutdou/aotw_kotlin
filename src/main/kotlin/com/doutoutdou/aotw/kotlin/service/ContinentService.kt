package com.doutoutdou.aotw.kotlin.service

import com.doutoutdou.aotw.kotlin.dto.ContinentDto
import com.doutoutdou.aotw.kotlin.dto.ContinentMapper
import com.doutoutdou.aotw.kotlin.entity.ContinentEntity
import com.doutoutdou.aotw.kotlin.repository.ContinentRepository
import org.springframework.stereotype.Service

@Service
class ContinentService(val repository: ContinentRepository, val mapper: ContinentMapper) {
    fun listContinents() : List<ContinentDto> {
        return repository.findAll().map { continentEntity -> mapper.toDto(continentEntity) }
    }
}