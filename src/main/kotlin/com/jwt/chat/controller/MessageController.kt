package com.jwt.chat.controller

import com.jwt.chat.entity.Message
import com.jwt.chat.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(private val messageService: MessageService) {

    @GetMapping("{user}/messages")
    fun getAllMessages(@PathVariable user: String): List<Message> {
        return messageService.getAllMessages()
    }

    @GetMapping("{user}/messages/{sender}")
    fun getMessages(@PathVariable user: String, @PathVariable sender: String): Message? {
        return messageService.getMessageById(user, 1)
    }

    @PostMapping("{from}/messages/{to}")
    fun sendMessage(@RequestBody request: SendMessageRequest): Message {
        return messageService.sendMessage(from = request.from, to = request.to, content = request.content)
    }
}

data class SendMessageRequest(val from: String, val to: String, val content: String)

