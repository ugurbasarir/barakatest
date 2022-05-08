package com.baraka.barakatest.ui.components.feed.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/baraka/barakatest/ui/components/feed/adapter/StockListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/baraka/barakatest/ui/components/feed/adapter/viewholders/StockViewHolder;", "stockList", "Lcom/baraka/barakatest/data/models/StockList;", "(Lcom/baraka/barakatest/data/models/StockList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateStock", "app_debug"})
public final class StockListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.baraka.barakatest.ui.components.feed.adapter.viewholders.StockViewHolder> {
    private final com.baraka.barakatest.data.models.StockList stockList = null;
    
    public StockListAdapter(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.data.models.StockList stockList) {
        super();
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.baraka.barakatest.ui.components.feed.adapter.viewholders.StockViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.ui.components.feed.adapter.viewholders.StockViewHolder holder, int position) {
    }
    
    public final void updateStock(int position) {
    }
}