
package km.jira.mymodel.search;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Content__2 {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("content")
    @Expose
    private List<Content__3> content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Content__3> getContent() {
        return content;
    }

    public void setContent(List<Content__3> content) {
        this.content = content;
    }

}
