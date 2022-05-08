package com.baraka.barakatest.ui.components.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006 "}, d2 = {"Lcom/baraka/barakatest/ui/components/feed/FeedActivity;", "Lcom/baraka/barakatest/ui/base/BaseActivity;", "Lcom/baraka/barakatest/ui/components/feed/adapter/listeners/FeedAdapterListener;", "()V", "binding", "Lcom/baraka/barakatest/databinding/ActivityFeedBinding;", "feedViewModel", "Lcom/baraka/barakatest/ui/components/feed/FeedViewModel;", "getFeedViewModel", "()Lcom/baraka/barakatest/ui/components/feed/FeedViewModel;", "feedViewModel$delegate", "Lkotlin/Lazy;", "handleChangedStockItem", "", "position", "", "handleNews", "feedList", "", "Lcom/baraka/barakatest/data/models/interfaces/Feed;", "observeViewModel", "onArticleItemClicked", "article", "Lcom/baraka/barakatest/data/models/Article;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setLoadingViewVisibility", "isVisible", "", "showFeed", "list", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FeedActivity extends com.baraka.barakatest.ui.base.BaseActivity implements com.baraka.barakatest.ui.components.feed.adapter.listeners.FeedAdapterListener {
    private com.baraka.barakatest.databinding.ActivityFeedBinding binding;
    private final kotlin.Lazy feedViewModel$delegate = null;
    
    public FeedActivity() {
        super();
    }
    
    private final com.baraka.barakatest.ui.components.feed.FeedViewModel getFeedViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void handleNews(java.util.List<? extends com.baraka.barakatest.data.models.interfaces.Feed> feedList) {
    }
    
    private final void handleChangedStockItem(int position) {
    }
    
    private final void setLoadingViewVisibility(boolean isVisible) {
    }
    
    private final void showFeed(java.util.List<? extends com.baraka.barakatest.data.models.interfaces.Feed> list) {
    }
    
    @java.lang.Override()
    public void onArticleItemClicked(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.data.models.Article article) {
    }
}