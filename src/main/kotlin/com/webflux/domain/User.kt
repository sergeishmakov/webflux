package com.webflux.domain

import lombok.Data
import lombok.Generated
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Data
@NoArgsConstructor
@Table(value="users")
class User(
    @Id
    @Generated()
    var id: Long,
    var name: String) {
}