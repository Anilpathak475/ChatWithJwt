package com.jwt.chat.service

import com.jwt.chat.entity.Message
import com.jwt.chat.repositories.MessageRepository
import com.jwt.chat.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class MessageService(private val messageRepository: MessageRepository, private val userRepository: UserRepository) {

    fun getAllMessages(): List<Message> {
        return messageRepository.findAll()
    }

    fun getMessageById(userId:String, messageId:Long): Message? {
        return messageRepository.findById(messageId).orElse(null)
    }

    fun sendMessage(from: String, to: String, content: String): Message {
        val message = Message()
        return messageRepository.save(message)
    }
}


