package com.angelodev.help.utilities.di

import android.content.Context
import androidx.room.Room
import com.angelodev.help.database.AppDatabase
import com.angelodev.help.database.dao.SampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideSampleDao(database: AppDatabase): SampleDao =
        database.sampleDao()

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "help_database"
        ).fallbackToDestructiveMigration().build()
    }
}