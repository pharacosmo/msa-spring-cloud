package com.skdnd.module.api.demo2


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo2")  // 기본 경로 설정
class Demo2Controller {

    @GetMapping
    fun hello(): String {
        return "demo2"
    }
}