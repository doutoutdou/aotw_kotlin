package com.doutoutdou.aotw.kotlin.dto

import com.doutoutdou.aotw.kotlin.entity.CountryEntity
import org.mapstruct.Mapper

class CountryDto(var name: String, var id: Long? = null)

@Mapper(componentModel = "spring")
interface CountryMapper {

    fun toDto(countryEntity: CountryEntity): CountryDto
    fun toEntity(countryDto: CountryDto): CountryEntity

}