package labo.github;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("WeakerAccess")
public class GitHubApi {
    private final WebTarget target;

    public GitHubApi() {
        Client client = ClientBuilder.newClient();
        target = client.target("https://api.github.com/search/repositories");
    }

    public RepositoriesResult searchRepositories(String keyword) {
        return target
                .queryParam("q", keyword)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(RepositoriesResult.class);
    }
}
