
package km.jira.mymodel.search;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fields__1 {

    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("priority")
    @Expose
    private Priority priority;
    @SerializedName("issuetype")
    @Expose
    private Issuetype__1 issuetype;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Issuetype__1 getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype__1 issuetype) {
        this.issuetype = issuetype;
    }

}
