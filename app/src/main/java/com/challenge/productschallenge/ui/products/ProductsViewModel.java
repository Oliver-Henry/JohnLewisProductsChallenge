package com.challenge.productschallenge.ui.products;

import com.challenge.productschallenge.common.SchedulerProvider;
import com.challenge.productschallenge.data.models.ProductsItem;
import com.challenge.productschallenge.data.remote.base.Repository;
import com.challenge.productschallenge.ui.base.BaseViewModel;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.MutableLiveData;
import io.reactivex.disposables.CompositeDisposable;

public class ProductsViewModel extends BaseViewModel {

    private final SchedulerProvider schedulerProvider;


    private MutableLiveData<List<ProductsItem>> productsItemLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> isLoadingLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> showSnackBarLiveData = new MutableLiveData<>();

    @Inject
    public ProductsViewModel(CompositeDisposable compositeDisposable, Repository repository,
                             SchedulerProvider schedulerProvider) {
        super(compositeDisposable, repository);
        this.schedulerProvider = schedulerProvider;
        getProducts();
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

    private void getProducts() {
        addDisposable(repository.getProducts()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .doOnSubscribe(disposable -> isLoadingLiveData.setValue(true))
                .doFinally(() -> isLoadingLiveData.setValue(false))
                .subscribe(productsItems -> productsItemLiveData.setValue(productsItems),
                        throwable -> showSnackBarLiveData.setValue(true)));
    }

    public MutableLiveData<List<ProductsItem>> getProductsItemLiveData() {
        return productsItemLiveData;
    }

    public MutableLiveData<Boolean> getIsLoadingLiveData() {
        return isLoadingLiveData;
    }

    public MutableLiveData<Boolean> getShowSnackBarLiveData() {
        return showSnackBarLiveData;
    }

}
