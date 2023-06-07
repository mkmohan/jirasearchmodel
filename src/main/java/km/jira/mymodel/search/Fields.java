
package km.jira.mymodel.search;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fields {

    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("issuetype")
    @Expose
    private Issuetype issuetype;
    @SerializedName("creator")
    @Expose
    private Creator creator;
    @SerializedName("subtasks")
    @Expose
    private List<Subtask> subtasks;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("reporter")
    @Expose
    private Reporter reporter;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("labels")
    @Expose
    private List<String> labels;
    @SerializedName("status")
    @Expose
    private Status__1 status;
    @SerializedName("parent")
    @Expose
    private Parent parent;
    @SerializedName("assignee")
    @Expose
    private Assignee assignee;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<Subtask> subtasks) {
        this.subtasks = subtasks;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Status__1 getStatus() {
        return status;
    }

    public void setStatus(Status__1 status) {
        this.status = status;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

}
