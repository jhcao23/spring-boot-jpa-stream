package com.example.demo

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
open class City (
        @Id var id: Long = 0L,
        @Column var name: String = ""
)