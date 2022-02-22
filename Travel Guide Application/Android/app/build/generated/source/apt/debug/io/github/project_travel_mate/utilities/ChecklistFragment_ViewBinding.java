// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.utilities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChecklistFragment_ViewBinding implements Unbinder {
  private ChecklistFragment target;

  private View view2131296305;

  @UiThread
  public ChecklistFragment_ViewBinding(final ChecklistFragment target, View source) {
    this.target = target;

    View view;
    target.listview = Utils.findRequiredViewAsType(source, R.id.listview, "field 'listview'", ListView.class);
    view = Utils.findRequiredView(source, R.id.add, "method 'onClick'");
    view2131296305 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ChecklistFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listview = null;

    view2131296305.setOnClickListener(null);
    view2131296305 = null;
  }
}
