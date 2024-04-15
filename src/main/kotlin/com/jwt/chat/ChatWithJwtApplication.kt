package com.jwt.chat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatWithJwtApplication

fun main(args: Array<String>) {
    runApplication<ChatWithJwtApplication>(*args)
}
