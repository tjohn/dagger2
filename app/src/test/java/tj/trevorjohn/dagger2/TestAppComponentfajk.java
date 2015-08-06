package tj.trevorjohn.dagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = TestAppModule.class)
public interface TestAppComponentfajk extends AppComponent {
  void inject(MainActivityTest test);
}
