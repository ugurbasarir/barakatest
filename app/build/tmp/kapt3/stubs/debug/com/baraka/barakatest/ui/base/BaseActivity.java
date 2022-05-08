package com.baraka.barakatest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/baraka/barakatest/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "observeViewModel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseActivity() {
        super();
    }
    
    public abstract void observeViewModel();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}