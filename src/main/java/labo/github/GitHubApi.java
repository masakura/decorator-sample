package labo.github;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("WeakerAccess")
public abstract class GitHubApi {
    public abstract RepositoriesResult searchRepositories(String keyword);
}
