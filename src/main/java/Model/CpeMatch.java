package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CpeMatch{
    @JsonProperty("vulnerable") 
    public boolean getVulnerable() { 
		 return this.vulnerable; } 
    public void setVulnerable(boolean vulnerable) { 
		 this.vulnerable = vulnerable; } 
    boolean vulnerable;
    @JsonProperty("criteria") 
    public String getCriteria() { 
		 return this.criteria; } 
    public void setCriteria(String criteria) { 
		 this.criteria = criteria; } 
    String criteria;
    @JsonProperty("matchCriteriaId") 
    public String getMatchCriteriaId() { 
		 return this.matchCriteriaId; } 
    public void setMatchCriteriaId(String matchCriteriaId) { 
		 this.matchCriteriaId = matchCriteriaId; } 
    String matchCriteriaId;
    @JsonProperty("versionEndIncluding") 
    public String getVersionEndIncluding() { 
		 return this.versionEndIncluding; } 
    public void setVersionEndIncluding(String versionEndIncluding) { 
		 this.versionEndIncluding = versionEndIncluding; } 
    String versionEndIncluding;
}