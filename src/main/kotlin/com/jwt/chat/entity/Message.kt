package com.jwt.chat.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "message_chat")
class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    lateinit var id: UUID

    var fromUser: String? = null

    var toUser: String? = null

    var messageText: String? = null

    val creationTime: Date? = null

}