package com.example.demo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/city")
class CityController(val cityService: CityService) {

    @GetMapping("/all", produces = [MediaType.APPLICATION_STREAM_JSON_VALUE])
    fun findAll(): Flux<City> = cityService.findAll()

}