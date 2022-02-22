// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.login;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dd.processbutton.FlatButton;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.signup = Utils.findRequiredViewAsType(source, R.id.signup, "field 'signup'", TextView.class);
    target.login = Utils.findRequiredViewAsType(source, R.id.login, "field 'login'", TextView.class);
    target.sig = Utils.findRequiredViewAsType(source, R.id.signup_layout, "field 'sig'", LinearLayout.class);
    target.log = Utils.findRequiredViewAsType(source, R.id.loginlayout, "field 'log'", LinearLayout.class);
    target.email_login = Utils.findRequiredViewAsType(source, R.id.input_email_login, "field 'email_login'", EditText.class);
    target.pass_login = Utils.findRequiredViewAsType(source, R.id.input_pass_login, "field 'pass_login'", EditText.class);
    target.email_signup = Utils.findRequiredViewAsType(source, R.id.input_email_signup, "field 'email_signup'", EditText.class);
    target.pass_signup = Utils.findRequiredViewAsType(source, R.id.input_pass_signup, "field 'pass_signup'", EditText.class);
    target.confirm_pass_signup = Utils.findRequiredViewAsType(source, R.id.input_confirm_pass_signup, "field 'confirm_pass_signup'", EditText.class);
    target.firstName = Utils.findRequiredViewAsType(source, R.id.input_firstname_signup, "field 'firstName'", EditText.class);
    target.lastName = Utils.findRequiredViewAsType(source, R.id.input_lastname_signup, "field 'lastName'", EditText.class);
    target.ok_login = Utils.findRequiredViewAsType(source, R.id.ok_login, "field 'ok_login'", FlatButton.class);
    target.ok_signup = Utils.findRequiredViewAsType(source, R.id.ok_signup, "field 'ok_signup'", FlatButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.signup = null;
    target.login = null;
    target.sig = null;
    target.log = null;
    target.email_login = null;
    target.pass_login = null;
    target.email_signup = null;
    target.pass_signup = null;
    target.confirm_pass_signup = null;
    target.firstName = null;
    target.lastName = null;
    target.ok_login = null;
    target.ok_signup = null;
  }
}
