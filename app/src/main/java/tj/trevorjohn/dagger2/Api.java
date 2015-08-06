package tj.trevorjohn.dagger2;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface Api {
  @GET("/users/{user}/repos") List<Repo> listRepos(@Path("user") String user);
}
