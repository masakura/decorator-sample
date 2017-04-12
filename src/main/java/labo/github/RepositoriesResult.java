package labo.github;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@SuppressWarnings("ALL")
@lombok.Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class RepositoriesResult {
    private int total_count;
    private boolean incomplete_results;
    private List<Repository> items;
}
