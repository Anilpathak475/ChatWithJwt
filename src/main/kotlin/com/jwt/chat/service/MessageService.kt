/*
package com.jwt.chat.service

import com.jwt.chat.entity.Message
import com.jwt.chat.repositories.MessageRepository
import com.jwt.chat.repositories.UserRepository
import org.springframework.stereotype.Service
import java.util.Date

@Service
class MessageService(private val messageRepository: MessageRepository, private val userRepository: UserRepository) {

    fun getAllMessages(): List<Message> {
        return messageRepository.findAll()
    }

    fun getMessageBySenderAndReceiver(sender: String, receiver: String): List<Message>? {
        return messageRepository.findMessagesByFromUserAndToUser(fromUser = sender, toUser = receiver)
    }

    fun sendMessage(from: String, to: String, content: String): Message {
        val message = Message(fromUser = from, toUser = to, messageText = content, creationTime = Date())
        return messageRepository.save(message)
    }
}


*/
