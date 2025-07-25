package com.angelodev.help.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.angelodev.help.database.entities.SampleTable

@Dao
interface SampleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: SampleTable)

}