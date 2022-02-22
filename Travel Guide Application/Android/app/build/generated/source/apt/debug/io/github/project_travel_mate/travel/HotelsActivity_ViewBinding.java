// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.travel;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HotelsActivity_ViewBinding implements Unbinder {
  private HotelsActivity target;

  @UiThread
  public HotelsActivity_ViewBinding(HotelsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HotelsActivity_ViewBinding(HotelsActivity target, View source) {
    this.target = target;

    target.gridView = Utils.findRequiredViewAsType(source, R.id.hotel_list, "field 'gridView'", GridView.class);
    target.selectCity = Utils.findRequiredViewAsType(source, R.id.select_city, "field 'selectCity'", TextView.class);
    target.animationView = Utils.findRequiredViewAsType(source, R.id.animation_view, "field 'animationView'", LottieAnimationView.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.text_view, "field 'textView'", TextView.class);
    target.layout = Utils.findRequiredViewAsType(source, R.id.layout, "field 'layout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HotelsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.gridView = null;
    target.selectCity = null;
    target.animationView = null;
    target.textView = null;
    target.layout = null;
  }
}
