package tj.trevorjohn.dagger2;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public class AppModule {
  @Provides Api provideApi() {
    RestAdapter adapter = new RestAdapter.Builder()
      .setEndpoint("https://api.github.com")
      .build();

    return adapter.create(Api.class);
  }
}
