package com.angelodev.help.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sample_table")
data class SampleTable(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
)
