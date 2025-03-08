package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo1")
class DemoController {
    @GetMapping
    fun hello() = "demo1"

    @GetMapping("/query")
    fun getQueryParam(@RequestParam name: String): String {
        return "Received query parameter: $name"
    }

    @GetMapping("/path/{id}")
    fun getPathParam(@PathVariable id: Int): String {
        return "Received path parameter: $id"
    }

    @GetMapping("/header")
    fun getHeader(@RequestHeader("User-Agent") userAgent: String): String {
        return "Received header User-Agent: $userAgent"
    }
}