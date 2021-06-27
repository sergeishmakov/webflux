package com.webflux.repositories

import com.webflux.domain.User
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface UserRepository: ReactiveCrudRepository<User, Long> {
}