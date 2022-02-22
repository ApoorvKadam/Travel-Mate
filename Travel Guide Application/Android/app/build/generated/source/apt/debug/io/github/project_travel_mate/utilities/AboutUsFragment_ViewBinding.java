// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.utilities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutUsFragment_ViewBinding implements Unbinder {
  private AboutUsFragment target;

  private View view2131296371;

  private View view2131296372;

  private View view2131296377;

  private View view2131296370;

  private View view2131296374;

  private View view2131296373;

  private View view2131296375;

  private View view2131296369;

  @UiThread
  public AboutUsFragment_ViewBinding(final AboutUsFragment target, View source) {
    this.target = target;

    View view;
    target.mVersionCode = Utils.findRequiredViewAsType(source, R.id.tv_version_code, "field 'mVersionCode'", TextView.class);
    view = Utils.findRequiredView(source, R.id.cv_fork, "method 'onForkClicked'");
    view2131296371 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onForkClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cv_privacy_policy, "method 'onPrivacyPolicyClicked'");
    view2131296372 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPrivacyPolicyClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cv_website, "method 'onWebsiteClicked'");
    view2131296377 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWebsiteClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cv_contact_us, "method 'onContactUsClicked'");
    view2131296370 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onContactUsClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cv_share, "method 'onShareClicked'");
    view2131296374 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onShareClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cv_report_bug, "method 'onReportBugClicked'");
    view2131296373 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onReportBugClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cv_slack, "method 'onSlackClicked'");
    view2131296375 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSlackClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.cv_bmc, "method 'onBuyMeACoffeeClicked'");
    view2131296369 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBuyMeACoffeeClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutUsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mVersionCode = null;

    view2131296371.setOnClickListener(null);
    view2131296371 = null;
    view2131296372.setOnClickListener(null);
    view2131296372 = null;
    view2131296377.setOnClickListener(null);
    view2131296377 = null;
    view2131296370.setOnClickListener(null);
    view2131296370 = null;
    view2131296374.setOnClickListener(null);
    view2131296374 = null;
    view2131296373.setOnClickListener(null);
    view2131296373 = null;
    view2131296375.setOnClickListener(null);
    view2131296375 = null;
    view2131296369.setOnClickListener(null);
    view2131296369 = null;
  }
}
