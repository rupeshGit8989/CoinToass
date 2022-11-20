package com.rr.cointoss;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.rr.cointoss.Database.FlipHistoryEntity;
import com.rr.cointoss.Database.Repository;

import java.util.List;

public class HistoryViewModel extends AndroidViewModel {

    private LiveData<List<FlipHistoryEntity>> mlist;

    private Repository mRepository;

    public HistoryViewModel(@NonNull Application application) {
        super(application);
        Log.i("HistoryViewModel", "HistoryViewModel");

        mRepository = new Repository(application);
        this.mlist = mRepository.getAllHistoryList();
    }

    // Get All Record From History_tbl.
    public LiveData<List<FlipHistoryEntity>> getMlist() {
        Log.i("HistoryViewModel", "getMlist call");
        return mlist;
    }

    // Delete All record from History_tbl.
    public void delete() {
        Log.i("HistoryViewModel", "HistoryViewModel");
        mRepository.delete();
    }
}
