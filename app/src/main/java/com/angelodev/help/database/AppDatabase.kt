package com.angelodev.help.database

import androidx.room.*
import com.angelodev.help.database.dao.SampleDao
import com.angelodev.help.database.entities.SampleTable

@Database(
    entities = [
        SampleTable::class

               ],
    version = 1,
//    autoMigrations = [AutoMigration(from = 0, to = 1)],
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun sampleDao(): SampleDao

}