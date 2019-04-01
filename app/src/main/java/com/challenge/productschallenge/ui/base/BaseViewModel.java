package com.challenge.productschallenge.ui.base;

import com.challenge.productschallenge.data.remote.base.Repository;

import androidx.lifecycle.ViewModel;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BaseViewModel extends ViewModel {

    protected CompositeDisposable compositeDisposable;
    protected Repository repository;

    public BaseViewModel(CompositeDisposable compositeDisposable, Repository repository) {
        this.compositeDisposable = new CompositeDisposable();
        this.repository = repository;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null) {
            compositeDisposable.clear();
            compositeDisposable = null;
        }
    }

    protected void addDisposable(Disposable disposable) {
        compositeDisposable.add(disposable);
    }
}
