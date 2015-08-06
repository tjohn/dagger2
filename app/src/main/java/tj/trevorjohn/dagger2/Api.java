package tj.trevorjohn.dagger2;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface Api {
  @GET("/users/{user}/repos") Observable<List<Repo>> listRepos(@Path("user") String user);
}
