package com.rr.cointoss;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.rr.cointoss.Database.FlipHistoryEntity;
import com.rr.cointoss.Database.Repository;

public class FlipFragmentViewModel extends AndroidViewModel {

    private Repository mRepository;

    public FlipFragmentViewModel(@NonNull Application application) {
        super(application);

        mRepository = new Repository(application);
    }

    // Insert History into History_tbl.
    public void insert(FlipHistoryEntity flipHistoryEntity) {
        Log.i("FlipFragmentViewModel", "insert call");
        mRepository.insert(flipHistoryEntity);
    }
}
