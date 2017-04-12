package labo;

import labo.github.*;

public class Main {
    public static void main(String args[]) {
        GitHubApiFactory.set(new CacheGitHubApi(new RawGitHubApi()));

        Ui ui = new Ui();
        ui.searchRepositories();
    }
}
