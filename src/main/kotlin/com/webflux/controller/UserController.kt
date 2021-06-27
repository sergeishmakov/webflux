package com.webflux.controller
import com.webflux.domain.User
import com.webflux.services.UserService

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/users")
class MainController(var userService: UserService) {
    @GetMapping
    fun index(): Flux<User> {
        return userService.getUsers()
    }

    @PostMapping
    fun create(@RequestBody user: User): Mono<User> {
        return userService.create(user)
    }
}
