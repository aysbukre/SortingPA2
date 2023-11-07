package Model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reference{
    @JsonProperty("url") 
    public String getUrl() { 
		 return this.url; } 
    public void setUrl(String url) { 
		 this.url = url; } 
    String url;
    @JsonProperty("source") 
    public String getSource() { 
		 return this.source; } 
    public void setSource(String source) { 
		 this.source = source; } 
    String source;
    @JsonProperty("tags") 
    public ArrayList<String> getTags() { 
		 return this.tags; } 
    public void setTags(ArrayList<String> tags) { 
		 this.tags = tags; } 
    ArrayList<String> tags;
}