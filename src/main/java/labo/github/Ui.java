package labo.github;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ui {
    private final GitHubApi _api;

    public Ui() {
        _api = new GitHubApi();
    }

    public void searchRepositories() {
        while (true) {
            String input = this.getInput();

            if (input.equals("")) break;

            this.searchAndShow(input);
        }
    }

    private String getInput() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("GitHub Repository の検索キーワードを入力してください: ");

        try {
            return br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void searchAndShow(String keyword) {
        RepositoriesResult result = _api.searchRepositories(keyword);

        for (Repository repo : result.getItems()) {
            System.out.println(repo.getFull_name() + " => " + repo.getHtml_url());
        }
    }
}
