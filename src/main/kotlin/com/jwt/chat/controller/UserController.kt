package com.jwt.chat.controller

import com.jwt.chat.entity.User
import com.jwt.chat.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @PostMapping("/users")
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }

    @GetMapping("/users/{id}")
    fun getUserById(@PathVariable id: Long): User? {
        return userService.getUserById(id)
    }
}
