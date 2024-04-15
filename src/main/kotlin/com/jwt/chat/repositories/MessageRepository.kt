package com.jwt.chat.repositories

import com.jwt.chat.entity.Message
import org.springframework.data.jpa.repository.JpaRepository

interface MessageRepository : JpaRepository<Message, Long>
