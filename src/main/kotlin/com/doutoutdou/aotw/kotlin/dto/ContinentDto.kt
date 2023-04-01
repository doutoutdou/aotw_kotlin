package com.doutoutdou.aotw.kotlin.dto

import com.doutoutdou.aotw.kotlin.entity.ContinentEntity
import org.mapstruct.Mapper

class ContinentDto(var name: String, val id: Long? = null)

@Mapper(componentModel = "spring")
interface ContinentMapper {
    fun toDto(continentEntity: ContinentEntity): ContinentDto
    fun toEntity(continentDto: ContinentDto): ContinentEntity
}