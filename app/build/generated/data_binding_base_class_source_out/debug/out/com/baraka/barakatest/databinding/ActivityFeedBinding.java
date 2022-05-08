// Generated by view binder compiler. Do not edit!
package com.baraka.barakatest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.baraka.barakatest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFeedBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SwipeRefreshLayout refreshView;

  private ActivityFeedBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView recyclerView,
      @NonNull SwipeRefreshLayout refreshView) {
    this.rootView = rootView;
    this.recyclerView = recyclerView;
    this.refreshView = refreshView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_feed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFeedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recyclerView;
      RecyclerView recyclerView = rootView.findViewById(id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.refreshView;
      SwipeRefreshLayout refreshView = rootView.findViewById(id);
      if (refreshView == null) {
        break missingId;
      }

      return new ActivityFeedBinding((LinearLayout) rootView, recyclerView, refreshView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
