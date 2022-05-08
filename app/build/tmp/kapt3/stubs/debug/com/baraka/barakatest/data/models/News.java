package com.baraka.barakatest.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/baraka/barakatest/data/models/News;", "", "status", "", "totalResults", "", "articles", "", "Lcom/baraka/barakatest/data/models/Article;", "(Ljava/lang/String;ILjava/util/List;)V", "getArticles", "()Ljava/util/List;", "setArticles", "(Ljava/util/List;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getTotalResults", "()I", "setTotalResults", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class News {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    private int totalResults;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.baraka.barakatest.data.models.Article> articles;
    
    @org.jetbrains.annotations.NotNull()
    public final com.baraka.barakatest.data.models.News copy(@org.jetbrains.annotations.NotNull()
    java.lang.String status, int totalResults, @org.jetbrains.annotations.NotNull()
    java.util.List<com.baraka.barakatest.data.models.Article> articles) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public News(@org.jetbrains.annotations.NotNull()
    java.lang.String status, int totalResults, @org.jetbrains.annotations.NotNull()
    java.util.List<com.baraka.barakatest.data.models.Article> articles) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.baraka.barakatest.data.models.Article> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.baraka.barakatest.data.models.Article> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.baraka.barakatest.data.models.Article> p0) {
    }
}