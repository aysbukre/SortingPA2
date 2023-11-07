package Model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weakness{
    @JsonProperty("source") 
    public String getSource() { 
		 return this.source; } 
    public void setSource(String source) { 
		 this.source = source; } 
    String source;
    @JsonProperty("type") 
    public String getType() { 
		 return this.type; } 
    public void setType(String type) { 
		 this.type = type; } 
    String type;
    @JsonProperty("description") 
    public ArrayList<Description> getDescription() { 
		 return this.description; } 
    public void setDescription(ArrayList<Description> description) { 
		 this.description = description; } 
    ArrayList<Description> description;
}
