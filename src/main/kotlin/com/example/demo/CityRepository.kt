package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.stream.Stream

interface CityRepository: JpaRepository<City, Long> {

    @Query("select city from City city")
    fun findAllCities(): Stream<City>
}