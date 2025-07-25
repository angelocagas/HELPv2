package com.angelodev.help.repositories

import com.angelodev.help.database.AppDatabase
import com.angelodev.help.database.entities.SampleTable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val appDatabase: AppDatabase
) {

    suspend fun insertSample() {
        withContext(Dispatchers.IO) {
            appDatabase.sampleDao().insert(SampleTable(name = "Sample"))
        }
    }
}