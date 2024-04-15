package com.jwt.chat.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "user_chat") // Specify the table name here
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    lateinit var id: UUID

    @Column
    var userName: String? = null

    @Column
    var password: String? = null
}
