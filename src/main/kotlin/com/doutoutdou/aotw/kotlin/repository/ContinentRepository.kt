package com.doutoutdou.aotw.kotlin.repository

import com.doutoutdou.aotw.kotlin.entity.ContinentEntity
import org.springframework.data.repository.CrudRepository

interface ContinentRepository: CrudRepository<ContinentEntity, Long> {

}