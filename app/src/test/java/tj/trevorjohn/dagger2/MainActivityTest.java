package tj.trevorjohn.dagger2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.util.MockUtil;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(sdk = 18, constants = BuildConfig.class, packageName = "tj.trevorjohn.dagger2")
public class MainActivityTest {

  @Inject Api api;

  private MainActivity subject;

  @Test
  public void apiInjection() {
    subject = Robolectric.setupActivity(MainActivity.class);
    assertThat(subject.api).isNotNull();
    assertThat(new MockUtil().isMock(subject.api)).isTrue();
    assertThat(subject.api).isSameAs(api);
  }
}
