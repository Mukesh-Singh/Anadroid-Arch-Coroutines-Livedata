package com.sample.app.data.datasource.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sample.app.data.entites.Character

@Dao
interface CharacterDao {

    @Query("SELECT * FROM temp_characters")
    fun getAllCharacters() : LiveData<List<Character>>

    @Query("SELECT * FROM temp_characters WHERE id = :id")
    fun getCharacter(id: Int) : LiveData<Character>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characters: List<Character>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: Character)

}