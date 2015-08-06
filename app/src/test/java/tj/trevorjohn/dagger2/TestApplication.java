package tj.trevorjohn.dagger2;

import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Method;

public class TestApplication extends Application implements TestLifecycleApplication{
  @Override public void onCreate() {
    super.onCreate();
  }

  @Override protected void buildComponent() {

  }

  @Override public void beforeTest(Method method) {

  }

  @Override public void prepareTest(Object test) {

  }

  @Override public void afterTest(Method method) {

  }
}
