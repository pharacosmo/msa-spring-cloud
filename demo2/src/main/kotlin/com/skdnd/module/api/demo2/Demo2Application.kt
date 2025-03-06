package com.skdnd.module.api.demo2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class Demo2Application

fun main(args: Array<String>) {
    runApplication<Demo2Application>(*args)
}
