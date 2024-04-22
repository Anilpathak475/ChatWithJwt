package com.jwt.chat.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.jwt.chat.entity.User
import com.jwt.chat.service.UserService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.*
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.beans.factory.annotation.Autowired

@RestController
class UserController(private val userService: UserService) {

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @GetMapping("/user")
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @PostMapping("/user")
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }

    @GetMapping("/user/{userName}")
    fun getUserById(@PathVariable userName: String): User? {
        return userService.getUserByUserName(userName)
    }
}

@Configuration
class JacksonConfiguration {

    @Bean
    fun objectMapper(): ObjectMapper {
        return ObjectMapper().registerModule(KotlinModule())
    }
}