package tj.trevorjohn.dagger2;

public class Application extends android.app.Application {

  private AppComponent component;

  @Override public void onCreate() {
    super.onCreate();
    component = DaggerAppComponent.builder()
      .appModule(new AppModule())
      .build();
  }

  public AppComponent getAppComponent() {
    return component;
  }
}
