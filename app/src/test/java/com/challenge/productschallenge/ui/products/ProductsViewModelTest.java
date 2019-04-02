package com.challenge.productschallenge.ui.products;


import com.challenge.productschallenge.data.models.ProductsItem;
import com.challenge.productschallenge.data.remote.base.Repository;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.plugins.RxJavaPlugins;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ProductsViewModelTest {

    private ProductsViewModel productsViewModel;
    private List<ProductsItem> productsItems;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private Observer<List<ProductsItem>> productsItemObserver;

    @Mock
    public Repository repository;

    @BeforeClass
    public static void setUpRxSchedulers() {
        Scheduler scheduler = new Scheduler() {
            @Override
            public Worker createWorker() {
                return new ExecutorScheduler.ExecutorWorker(Runnable::run, false);
            }
        };
        RxJavaPlugins.setInitIoSchedulerHandler(schedulerCallable -> scheduler);
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(schedulerCallable -> scheduler);
    }

    @Before
    public void setUpProductsViewModel() {
        // Mockito has a very convenient way to inject mocks by using the @Mock annotation. To
        // inject the mocks in the test the initMocks method needs to be called.
        MockitoAnnotations.initMocks(this);

        // Get a reference to the class under test
        productsViewModel = new ProductsViewModel(new CompositeDisposable(), repository);

        productsItems = new ArrayList<>();
        productsItems.add(getProductItem());
        productsItems.add(getProductItem());
    }

    @Test
    public void givenProductsApiCallIsMadeUpdateLiveData() {
        when(repository.getProducts()).thenReturn(Single.just(productsItems));

        productsViewModel.getProductsItemLiveData().observeForever(productsItemObserver);
        productsViewModel.getProducts();

        verify(productsItemObserver).onChanged(productsItems);
    }

    static ProductsItem getProductItem() {
        ProductsItem productsItem = new ProductsItem();
        productsItem.setWas("20");
        productsItem.setImageUrl("www.test.com");
        productsItem.setPriceReduction(2.00);
        productsItem.setColorSwatches(new ArrayList<>());
        productsItem.setNowPrice("20");
        productsItem.setTitle("John Lewis");
        productsItem.setId("123456");

        return productsItem;
    }

}