/*
package com.jwt.chat.controller

import com.jwt.chat.service.LoginService
import com.jwt.chat.util.ApiResponse
import com.jwt.chat.security.JwtUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController(private val loginService: LoginService) {

    @Autowired
    private lateinit var jwtUtil: JwtUtil


    @PostMapping("/login")
    fun login(@RequestBody loginRequest: LoginRequest): ResponseEntity<ApiResponse<LoginResponse>> {
        val isAuthenticated = loginService.login(loginRequest.userName, loginRequest.password)
        return if (isAuthenticated)
            ResponseEntity.ok(
                ApiResponse(
                    status = 200,
                    message = "Login successful", data = LoginResponse(jwtUtil.generateToken(loginRequest.userName))
                )
            )
        else
            ResponseEntity.badRequest().body(
                ApiResponse(
                    status = 400,
                    message = "Authentication failed",
                    data = null
                )
            )
    }
}

data class LoginRequest(val userName: String, val password: String)


data class LoginResponse(val token: String)*/
