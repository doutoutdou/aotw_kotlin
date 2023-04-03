package com.doutoutdou.aotw.kotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = "CONTINENT")
class ContinentEntity(
    @Column(unique = true, nullable = false)
    var name: String,
    @Id
    @SequenceGenerator(name = "CONTINENT_SEQ", sequenceName = "CONTINENT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTINENT_SEQ")
    var id: Long? = null

)