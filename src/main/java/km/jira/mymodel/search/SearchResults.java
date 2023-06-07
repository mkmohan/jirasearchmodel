
package km.jira.mymodel.search;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SearchResults {

    @SerializedName("expand")
    @Expose
    private String expand;
    @SerializedName("issues")
    @Expose
    private List<Issue> issues;
    @SerializedName("maxResults")
    @Expose
    private Integer maxResults;
    @SerializedName("startAt")
    @Expose
    private Integer startAt;
    @SerializedName("total")
    @Expose
    private Integer total;

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
