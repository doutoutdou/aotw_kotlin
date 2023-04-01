package com.doutoutdou.aotw.kotlin.entity

import jakarta.persistence.*

@Entity
class Country(
    var name: String,
    @Id
    @SequenceGenerator(name = "COUNTRY_SEQ", sequenceName = "COUNTRY_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COUNTRY_SEQ") var id: Long? = null
)