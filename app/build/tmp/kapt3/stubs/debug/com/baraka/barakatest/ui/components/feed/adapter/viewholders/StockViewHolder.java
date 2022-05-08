package com.baraka.barakatest.ui.components.feed.adapter.viewholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/baraka/barakatest/ui/components/feed/adapter/viewholders/StockViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/baraka/barakatest/databinding/ItemStockBinding;", "(Lcom/baraka/barakatest/databinding/ItemStockBinding;)V", "bind", "", "data", "Lcom/baraka/barakatest/data/models/Stock;", "getColorDueToPriceAmount", "", "price", "", "app_debug"})
public final class StockViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.baraka.barakatest.databinding.ItemStockBinding itemBinding = null;
    
    public StockViewHolder(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.databinding.ItemStockBinding itemBinding) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.baraka.barakatest.data.models.Stock data) {
    }
    
    private final int getColorDueToPriceAmount(float price) {
        return 0;
    }
}