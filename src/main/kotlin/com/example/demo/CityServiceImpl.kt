package com.example.demo

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux

@Service
class CityServiceImpl(val cityRepository: CityRepository): CityService {

    @Transactional
    override fun findAll(): Flux<City> {

        //idea 1 FAIL
        return Flux.generate {
            cityRepository.findAllCities().use {
                stream2 -> stream2.forEach {
                    city -> it.next(city)
                }
            }
        }

        //idea 2 & 3 FAIL
//        New Exception:
//        could not advance using next()
//        org.hibernate.exception.GenericJDBCException: could not advance using next()

//        return cityRepository.findAllCities().toFlux()

        //idea 3 FAIL
//        return Flux.fromStream(cityRepository.findAllCities())
    }

}