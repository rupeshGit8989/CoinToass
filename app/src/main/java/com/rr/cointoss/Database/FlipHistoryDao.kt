package com.rr.cointoss.Database

import androidx.room.Dao
import androidx.room.OnConflictStrategy
import com.rr.cointoss.Database.FlipHistoryEntity
import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FlipHistoryDao {
    // Insert History into History_tbl.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(flipHistoryEntity: FlipHistoryEntity?)

    // Get all record from History_tbl.
    @get:Query("Select * From History_tbl")
    val allHistory: LiveData<List<FlipHistoryEntity?>?>?

    // Delete All record from History_tbl.
    @Query("Delete From History_tbl")
    fun delete()
}