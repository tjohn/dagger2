package tj.trevorjohn.dagger2;

import dagger.Component;

@Component(modules = AppModule.class)
interface AppComponent {
  void inject(MainActivity activity);
  void inject(OtherActivity activity);
}
