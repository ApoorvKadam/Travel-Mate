// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.dd.processbutton.iml.ActionProcessButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingsFragment_ViewBinding implements Unbinder {
  private SettingsFragment target;

  @UiThread
  public SettingsFragment_ViewBinding(SettingsFragment target, View source) {
    this.target = target;

    target.notificationSwitch = Utils.findRequiredViewAsType(source, R.id.switch_notification, "field 'notificationSwitch'", Switch.class);
    target.oldPasswordText = Utils.findRequiredViewAsType(source, R.id.old_password, "field 'oldPasswordText'", EditText.class);
    target.newPasswordText = Utils.findRequiredViewAsType(source, R.id.new_password, "field 'newPasswordText'", EditText.class);
    target.confirmPasswordText = Utils.findRequiredViewAsType(source, R.id.connfirm_password, "field 'confirmPasswordText'", EditText.class);
    target.doneButton = Utils.findRequiredViewAsType(source, R.id.done_button, "field 'doneButton'", ActionProcessButton.class);
    target.layout = Utils.findRequiredViewAsType(source, R.id.layout, "field 'layout'", LinearLayout.class);
    target.animationView = Utils.findRequiredViewAsType(source, R.id.animation_view, "field 'animationView'", LottieAnimationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.notificationSwitch = null;
    target.oldPasswordText = null;
    target.newPasswordText = null;
    target.confirmPasswordText = null;
    target.doneButton = null;
    target.layout = null;
    target.animationView = null;
  }
}
