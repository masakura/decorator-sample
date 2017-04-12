package labo.github;

import java.util.HashMap;
import java.util.Map;

public class CacheGitHubApi implements GitHubApi {
    private final Map<String, RepositoriesResult> cache;
    private final GitHubApi source;

    public CacheGitHubApi(GitHubApi source) {
        cache = new HashMap<>();
        this.source = source;
    }

    public RepositoriesResult searchRepositories(String keyword) {
        RepositoriesResult result = cache.getOrDefault(keyword, null);

        if (result == null) {
            result = source.searchRepositories(keyword);
            cache.put(keyword, result);
        }

        return result;
    }
}
