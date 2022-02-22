// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.mytrips;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyTripsFragment_ViewBinding implements Unbinder {
  private MyTripsFragment target;

  private View view2131296308;

  @UiThread
  public MyTripsFragment_ViewBinding(final MyTripsFragment target, View source) {
    this.target = target;

    View view;
    target.gridView = Utils.findRequiredViewAsType(source, R.id.gv, "field 'gridView'", GridView.class);
    target.animationView = Utils.findRequiredViewAsType(source, R.id.animation_view, "field 'animationView'", LottieAnimationView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_refresh, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.add_trip, "method 'addTrip'");
    view2131296308 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.addTrip();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MyTripsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.gridView = null;
    target.animationView = null;
    target.swipeRefreshLayout = null;

    view2131296308.setOnClickListener(null);
    view2131296308 = null;
  }
}
