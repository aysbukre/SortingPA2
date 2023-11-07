package Model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Node{
    @JsonProperty("operator") 
    public String getOperator() { 
		 return this.operator; } 
    public void setOperator(String operator) { 
		 this.operator = operator; } 
    String operator;
    @JsonProperty("negate") 
    public boolean getNegate() { 
		 return this.negate; } 
    public void setNegate(boolean negate) { 
		 this.negate = negate; } 
    boolean negate;
    @JsonProperty("cpeMatch") 
    public ArrayList<CpeMatch> getCpeMatch() { 
		 return this.cpeMatch; } 
    public void setCpeMatch(ArrayList<CpeMatch> cpeMatch) { 
		 this.cpeMatch = cpeMatch; } 
    ArrayList<CpeMatch> cpeMatch;
}