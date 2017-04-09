package labo.github;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@lombok.Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Information {
    private String current_user_url;
    private String current_user_authorizations_html_url;
    private String authorizations_url;
    private String code_search_url;
    private String commit_search_url;
    private String emails_url;
    private String emojis_url;
    private String events_url;
    private String feeds_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String hub_url;
    private String issue_search_url;
    private String issues_url;
    private String keys_url;
    private String notifications_url;
    private String organization_repositories_url;
    private String organization_url;
    private String public_gists_url;
    private String rate_limit_url;
    private String repository_url;
    private String repository_search_url;
    private String current_user_repositories_url;
    private String starred_url;
    private String starred_gists_url;
    private String team_url;
    private String user_url;
    private String user_organizations_url;
    private String user_repositories_url;
    private String user_search_url;
}
