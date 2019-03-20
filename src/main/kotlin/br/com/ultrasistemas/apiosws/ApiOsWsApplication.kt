package br.com.ultrasistemas.apiosws

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("br.com.ultrasistemas.apiosws")
@EntityScan("br.com.ultrasistemas.apiosws")
class ApiOsWsApplication

fun main(args: Array<String>) {
	runApplication<ApiOsWsApplication>(*args)
}
