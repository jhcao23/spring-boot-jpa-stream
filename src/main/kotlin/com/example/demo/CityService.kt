package com.example.demo

import reactor.core.publisher.Flux

interface CityService {
    fun findAll(): Flux<City>
}