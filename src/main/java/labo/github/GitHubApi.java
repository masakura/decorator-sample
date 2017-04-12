package labo.github;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("WeakerAccess")
public interface GitHubApi {
    public RepositoriesResult searchRepositories(String keyword);
}
