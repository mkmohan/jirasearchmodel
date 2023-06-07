
package km.jira.mymodel.search;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fields__2 {

    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("status")
    @Expose
    private Status__2 status;
    @SerializedName("priority")
    @Expose
    private Priority__1 priority;
    @SerializedName("issuetype")
    @Expose
    private Issuetype__2 issuetype;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Status__2 getStatus() {
        return status;
    }

    public void setStatus(Status__2 status) {
        this.status = status;
    }

    public Priority__1 getPriority() {
        return priority;
    }

    public void setPriority(Priority__1 priority) {
        this.priority = priority;
    }

    public Issuetype__2 getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype__2 issuetype) {
        this.issuetype = issuetype;
    }

}
