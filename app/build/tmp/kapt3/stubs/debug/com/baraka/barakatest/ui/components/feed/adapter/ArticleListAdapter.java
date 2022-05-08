package com.baraka.barakatest.ui.components.feed.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/baraka/barakatest/ui/components/feed/adapter/ArticleListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/baraka/barakatest/ui/components/feed/adapter/viewholders/ArticleMiniViewHolder;", "articleList", "Lcom/baraka/barakatest/data/models/ArticleList;", "listener", "Lcom/baraka/barakatest/ui/components/feed/adapter/listeners/FeedAdapterListener;", "(Lcom/baraka/barakatest/data/models/ArticleList;Lcom/baraka/barakatest/ui/components/feed/adapter/listeners/FeedAdapterListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class ArticleListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.baraka.barakatest.ui.components.feed.adapter.viewholders.ArticleMiniViewHolder> {
    private final com.baraka.barakatest.data.models.ArticleList articleList = null;
    private final com.baraka.barakatest.ui.components.feed.adapter.listeners.FeedAdapterListener listener = null;
    
    public ArticleListAdapter(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.data.models.ArticleList articleList, @org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.ui.components.feed.adapter.listeners.FeedAdapterListener listener) {
        super();
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.baraka.barakatest.ui.components.feed.adapter.viewholders.ArticleMiniViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.ui.components.feed.adapter.viewholders.ArticleMiniViewHolder holder, int position) {
    }
}