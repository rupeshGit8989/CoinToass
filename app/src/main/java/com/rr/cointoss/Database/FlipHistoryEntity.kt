package com.rr.cointoss.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "History_tbl")
class FlipHistoryEntity(
        @field:ColumnInfo(name = "Results")
        var results: String,
        @field:ColumnInfo(name = "Date")
        var date: String,
        @field:ColumnInfo(name = "Time")
        var time: String
) {
    @ColumnInfo(name = "Id")
    @PrimaryKey(autoGenerate = true)
    var id = 0

}