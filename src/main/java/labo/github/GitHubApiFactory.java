package labo.github;

public class GitHubApiFactory {
    private static GitHubApi instance;

    public static GitHubApi get() {
        return instance;
    }

    public static void set(GitHubApi newApi) {
        instance = newApi;
    }
}
