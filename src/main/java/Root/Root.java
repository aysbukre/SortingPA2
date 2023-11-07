/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Root;


import Model.*;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

public class Root{
	
    @JsonProperty("resultsPerPage") 
    public int getResultsPerPage() { 
		 return this.resultsPerPage; } 
    public void setResultsPerPage(int resultsPerPage) { 
		 this.resultsPerPage = resultsPerPage; } 
    int resultsPerPage;
    @JsonProperty("startIndex") 
    public int getStartIndex() { 
		 return this.startIndex; } 
    public void setStartIndex(int startIndex) { 
		 this.startIndex = startIndex; } 
    int startIndex;
    @JsonProperty("totalResults") 
    public int getTotalResults() { 
		 return this.totalResults; } 
    public void setTotalResults(int totalResults) { 
		 this.totalResults = totalResults; } 
    int totalResults;
    @JsonProperty("format") 
    public String getFormat() { 
		 return this.format; } 
    public void setFormat(String format) { 
		 this.format = format; } 
    String format;
    @JsonProperty("version") 
    public String getVersion() { 
		 return this.version; } 
    public void setVersion(String version) { 
		 this.version = version; } 
    String version;
    @JsonProperty("timestamp") 
    public Date getTimestamp() { 
		 return this.timestamp; } 
    public void setTimestamp(Date timestamp) { 
		 this.timestamp = timestamp; } 
    Date timestamp;
    @JsonProperty("vulnerabilities") 
    public Vulnerability[] getVulnerabilities() { 
		 return this.vulnerabilities; } 
    public void setVulnerabilities(Vulnerability[] vulnerabilities) { 
		 this.vulnerabilities = vulnerabilities; } 
    public Vulnerability[] vulnerabilities;
}
