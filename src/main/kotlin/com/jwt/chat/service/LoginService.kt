/*
package com.jwt.chat.service

import com.jwt.chat.repositories.UserRepository
import org.springframework.stereotype.Service


@Service
class LoginService(private val userRepository: UserRepository) {

    fun login(userName: String, password: String): Boolean {
        val user = userRepository.findByUserName(userName)
        return user != null && user.password == password
    }
}*/
