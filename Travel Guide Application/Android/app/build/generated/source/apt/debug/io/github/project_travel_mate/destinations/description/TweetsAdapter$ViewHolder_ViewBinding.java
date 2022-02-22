// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.destinations.description;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TweetsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private TweetsAdapter.ViewHolder target;

  @UiThread
  public TweetsAdapter$ViewHolder_ViewBinding(TweetsAdapter.ViewHolder target, View source) {
    this.target = target;

    target.name = Utils.findRequiredViewAsType(source, R.id.tagmain, "field 'name'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TweetsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name = null;
  }
}
