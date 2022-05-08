package com.baraka.barakatest.ui.components.feed;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/baraka/barakatest/ui/components/feed/FeedViewModel;", "Lcom/baraka/barakatest/ui/base/BaseViewModel;", "retrofit", "Lcom/baraka/barakatest/data/network/RetrofitBuilder;", "csvUtils", "Lcom/baraka/barakatest/utils/CSVUtils;", "(Lcom/baraka/barakatest/data/network/RetrofitBuilder;Lcom/baraka/barakatest/utils/CSVUtils;)V", "changedStockItemLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getChangedStockItemLiveData", "()Landroidx/lifecycle/MutableLiveData;", "feedLiveData", "", "Lcom/baraka/barakatest/data/models/interfaces/Feed;", "getFeedLiveData", "news", "Lcom/baraka/barakatest/data/models/News;", "stockList", "Lcom/baraka/barakatest/data/models/StockList;", "timerToUpdateStock", "Ljava/util/Timer;", "createFeedList", "getFeed", "", "showErrorToastMessage", "errorMessage", "", "startTimerToChangeStockPriceRandomly", "uniqueStockList", "Lcom/baraka/barakatest/data/models/Stock;", "app_debug"})
public final class FeedViewModel extends com.baraka.barakatest.ui.base.BaseViewModel {
    private final com.baraka.barakatest.data.network.RetrofitBuilder retrofit = null;
    private final com.baraka.barakatest.utils.CSVUtils csvUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.baraka.barakatest.data.models.interfaces.Feed>> feedLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> changedStockItemLiveData = null;
    private com.baraka.barakatest.data.models.News news;
    private com.baraka.barakatest.data.models.StockList stockList;
    private java.util.Timer timerToUpdateStock;
    
    @javax.inject.Inject()
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.data.network.RetrofitBuilder retrofit, @org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.utils.CSVUtils csvUtils) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.baraka.barakatest.data.models.interfaces.Feed>> getFeedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getChangedStockItemLiveData() {
        return null;
    }
    
    public final void getFeed() {
    }
    
    private final java.util.List<com.baraka.barakatest.data.models.interfaces.Feed> createFeedList() {
        return null;
    }
    
    private final void startTimerToChangeStockPriceRandomly(java.util.List<com.baraka.barakatest.data.models.Stock> uniqueStockList) {
    }
    
    public final void showErrorToastMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
}