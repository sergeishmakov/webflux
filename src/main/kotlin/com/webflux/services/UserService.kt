package com.webflux.services

import com.webflux.domain.User
import com.webflux.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserService(@Autowired var userRepository: UserRepository) {
    fun getUsers(): Flux<User> {
        return userRepository.findAll()
    }

    fun create(user: User): Mono<User> {
        return userRepository.save(user)
    }
}