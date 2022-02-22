// Generated code from Butter Knife. Do not modify!
package io.github.project_travel_mate.destinations.description;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import io.github.project_travel_mate.R;
import java.lang.IllegalStateException;
import java.lang.Override;
import utils.ExpandableTextView;

public class FinalCityInfoActivity_ViewBinding implements Unbinder {
  private FinalCityInfoActivity target;

  @UiThread
  public FinalCityInfoActivity_ViewBinding(FinalCityInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FinalCityInfoActivity_ViewBinding(FinalCityInfoActivity target, View source) {
    this.target = target;

    target.content = Utils.findRequiredViewAsType(source, R.id.layout_content, "field 'content'", LinearLayout.class);
    target.animationView = Utils.findRequiredViewAsType(source, R.id.animation_view, "field 'animationView'", LottieAnimationView.class);
    target.temperature = Utils.findRequiredViewAsType(source, R.id.temp, "field 'temperature'", TextView.class);
    target.humidity = Utils.findRequiredViewAsType(source, R.id.humidit, "field 'humidity'", TextView.class);
    target.weatherInfo = Utils.findRequiredViewAsType(source, R.id.weatherinfo, "field 'weatherInfo'", TextView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.head, "field 'title'", TextView.class);
    target.imagesSliderView = Utils.findRequiredViewAsType(source, R.id.image_slider, "field 'imagesSliderView'", ViewPager.class);
    target.icon = Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
    target.expandCollapseImage = Utils.findRequiredViewAsType(source, R.id.expand_collapse, "field 'expandCollapseImage'", ImageButton.class);
    target.cityDescription = Utils.findRequiredViewAsType(source, R.id.expand_text_view, "field 'cityDescription'", ExpandableTextView.class);
    target.funfact = Utils.findRequiredViewAsType(source, R.id.funfact, "field 'funfact'", LinearLayout.class);
    target.restaurant = Utils.findRequiredViewAsType(source, R.id.restau, "field 'restaurant'", LinearLayout.class);
    target.hangout = Utils.findRequiredViewAsType(source, R.id.hangout, "field 'hangout'", LinearLayout.class);
    target.monument = Utils.findRequiredViewAsType(source, R.id.monu, "field 'monument'", LinearLayout.class);
    target.shopping = Utils.findRequiredViewAsType(source, R.id.shoppp, "field 'shopping'", LinearLayout.class);
    target.trend = Utils.findRequiredViewAsType(source, R.id.trends, "field 'trend'", LinearLayout.class);
    target.weather = Utils.findRequiredViewAsType(source, R.id.weather, "field 'weather'", LinearLayout.class);
    target.cityHistory = Utils.findRequiredViewAsType(source, R.id.city_history, "field 'cityHistory'", LinearLayout.class);
    target.sliderDotsPanel = Utils.findRequiredViewAsType(source, R.id.SliderDots, "field 'sliderDotsPanel'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FinalCityInfoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.content = null;
    target.animationView = null;
    target.temperature = null;
    target.humidity = null;
    target.weatherInfo = null;
    target.title = null;
    target.imagesSliderView = null;
    target.icon = null;
    target.expandCollapseImage = null;
    target.cityDescription = null;
    target.funfact = null;
    target.restaurant = null;
    target.hangout = null;
    target.monument = null;
    target.shopping = null;
    target.trend = null;
    target.weather = null;
    target.cityHistory = null;
    target.sliderDotsPanel = null;
  }
}
