package com.sample.app.data.entites


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "temp_characters")
data class Character(
    val created: String,
    val gender: String,
    @PrimaryKey
    val id: Int,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

