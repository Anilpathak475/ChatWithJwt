package com.jwt.chat.repositories

import com.jwt.chat.entity.Message
import com.jwt.chat.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MessageRepository : JpaRepository<Message, UUID> {
    fun findMessagesByFromUserAndToUser(fromUser: String, toUser:String): List<Message>?

}
