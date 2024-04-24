package com.jwt.chat.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "message_chat")
class Message() {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    lateinit var id: UUID

    lateinit var fromUser: String

    lateinit var toUser: String

    lateinit var messageText: String

    lateinit var creationTime: Date

    constructor(
        fromUser: String,
        toUser: String,
        messageText: String,
        creationTime: Date
    ) : this() {
        this.fromUser = fromUser
        this.toUser = toUser
        this.messageText = messageText
        this.creationTime = creationTime
    }
}
