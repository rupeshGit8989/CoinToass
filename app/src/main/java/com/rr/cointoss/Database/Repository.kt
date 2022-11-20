package com.rr.cointoss.Database

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.rr.cointoss.AppExecutor
import com.rr.cointoss.Database.AppDatabase.Companion.getInstance

class Repository(context: Context?) {
    private val mAppExecutor: AppExecutor
    private val mAppDatabase: AppDatabase?
    val allHistoryList: LiveData<List<FlipHistoryEntity?>?>?

    init {
        mAppExecutor = AppExecutor()
        mAppDatabase = getInstance(context!!)
        allHistoryList = mAppDatabase!!.get_FlipHistory_doa()!!.allHistory
    }

    fun insert(flipHistoryEntity: FlipHistoryEntity?) {
        Log.i("Repository", "insert call")
        mAppExecutor.diskIO().execute { mAppDatabase!!.get_FlipHistory_doa()!!.insert(flipHistoryEntity) }
    }

    fun delete() {
        mAppExecutor.diskIO().execute { mAppDatabase!!.get_FlipHistory_doa()!!.delete() }
    }
}