package com.rr.cointoss.Database

import android.content.Context
import androidx.room.Database
import com.rr.cointoss.Database.FlipHistoryEntity
import androidx.room.RoomDatabase
import com.rr.cointoss.Database.FlipHistoryDao
import com.rr.cointoss.Database.AppDatabase
import androidx.room.Room

@Database(entities = [FlipHistoryEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun get_FlipHistory_doa(): FlipHistoryDao?

    companion object {
        private var INSTANCE: AppDatabase? = null
        @JvmStatic
        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                INSTANCE = buildDatabase(context)
            }
            return INSTANCE
        }

        private fun buildDatabase(context: Context): AppDatabase {
            val dbname = "db"
            return Room.databaseBuilder(context, AppDatabase::class.java, dbname).build()
        }
    }
}