/*
package com.jwt.chat.service

import com.jwt.chat.entity.User
import com.jwt.chat.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    fun createUser(user: User): User {
        return userRepository.save(user)
    }

    fun getUserById(id: Long): User? {
        return userRepository.findById(id).orElse(null)
    }

    fun getUserByUserName(userName: String): User? = userRepository.findByUserName(userName)

}
*/
