package com.webflux.config

import com.webflux.handlers.MainHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse


@Configuration
class MainRouter {
    @Bean
    fun route(mainHandler: MainHandler): RouterFunction<ServerResponse> {
        return RouterFunctions
            .route(
                RequestPredicates.GET("/").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                mainHandler::index
            )
    }
}