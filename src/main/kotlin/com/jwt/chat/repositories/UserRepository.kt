package com.jwt.chat.repositories

import com.jwt.chat.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
