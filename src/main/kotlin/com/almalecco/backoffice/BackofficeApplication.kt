package com.almalecco.backoffice

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration(exclude = [DataSourceAutoConfiguration::class])
class BackofficeApplication

fun main(args: Array<String>) {
	runApplication<BackofficeApplication>(*args)
}
