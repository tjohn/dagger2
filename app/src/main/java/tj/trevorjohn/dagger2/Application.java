package tj.trevorjohn.dagger2;

public class Application extends android.app.Application {
  protected AppComponent component;

  @Override public void onCreate() {
    super.onCreate();
    buildComponent();
  }

  protected void buildComponent() {
    component = DaggerAppComponent.builder()
      .appModule(new AppModule())
      .build();
  }

  public AppComponent getAppComponent() {
    return component;
  }
}
