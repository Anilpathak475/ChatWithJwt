package com.jwt.chat.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.jwt.chat.entity.Message
import com.jwt.chat.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(private val messageService: MessageService) {
    @Autowired
    private lateinit var objectMapper: ObjectMapper


    @GetMapping("{user}/messages")
    fun getAllMessages(@PathVariable user: String): List<Message> {
        return messageService.getAllMessages()
    }

    @GetMapping("{user}/messages/{sender}")
    fun getMessages(@PathVariable user: String, @PathVariable sender: String): List<Message>? {
        return messageService.getMessageBySenderAndReceiver(user, sender)
    }

    @PostMapping("{user}/message/{to}")
    fun sendMessage(
        @PathVariable user: String,
        @PathVariable to: String,
        @RequestBody request: SendMessageRequest
    ): Message {
        return messageService.sendMessage(from = user, to = to, content = request.content)
    }
}

data class SendMessageRequest(val content: String)
