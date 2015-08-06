package tj.trevorjohn.dagger2;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public class TestAppModule {
  @Provides @Singleton Api provideApi() {
    return Mockito.mock(Api.class);
  }
}
