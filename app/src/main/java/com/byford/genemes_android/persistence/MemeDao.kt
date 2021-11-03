package com.byford.genemes_android.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.malygos.gnemes.data.entity.MemePost

@Dao
interface MemeDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertMemePostList(posters: List<MemePost>)

        @Query("SELECT * FROM memes WHERE id = :id_")
        fun getMemePost(id_: String): MemePost

        @Query("SELECT * FROM memes")
        fun getAllMemePost(): List<MemePost>

}