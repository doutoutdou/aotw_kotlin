package com.doutoutdou.aotw.kotlin.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Country (
    var name:String,
    @Id @GeneratedValue var id: Long? = null
)