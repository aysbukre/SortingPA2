package Model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Configuration{
    @JsonProperty("nodes") 
    public ArrayList<Node> getNodes() { 
		 return this.nodes; } 
    public void setNodes(ArrayList<Node> nodes) { 
		 this.nodes = nodes; } 
    ArrayList<Node> nodes;
}
