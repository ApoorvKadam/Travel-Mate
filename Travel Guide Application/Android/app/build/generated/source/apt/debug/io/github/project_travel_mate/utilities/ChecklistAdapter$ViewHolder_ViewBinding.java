// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.utilities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChecklistAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ChecklistAdapter.ViewHolder target;

  @UiThread
  public ChecklistAdapter$ViewHolder_ViewBinding(ChecklistAdapter.ViewHolder target, View source) {
    this.target = target;

    target.checkBox = Utils.findRequiredViewAsType(source, R.id.cb1, "field 'checkBox'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChecklistAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.checkBox = null;
  }
}
