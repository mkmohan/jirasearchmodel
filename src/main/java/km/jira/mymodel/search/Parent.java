
package km.jira.mymodel.search;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Parent {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("fields")
    @Expose
    private Fields__2 fields;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Fields__2 getFields() {
        return fields;
    }

    public void setFields(Fields__2 fields) {
        this.fields = fields;
    }

}
