package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CvssData{
    @JsonProperty("version") 
    public String getVersion() { 
		 return this.version; } 
    public void setVersion(String version) { 
		 this.version = version; } 
    String version;
    @JsonProperty("vectorString") 
    public String getVectorString() { 
		 return this.vectorString; } 
    public void setVectorString(String vectorString) { 
		 this.vectorString = vectorString; } 
    String vectorString;
    @JsonProperty("accessVector") 
    public String getAccessVector() { 
		 return this.accessVector; } 
    public void setAccessVector(String accessVector) { 
		 this.accessVector = accessVector; } 
    String accessVector;
    @JsonProperty("accessComplexity") 
    public String getAccessComplexity() { 
		 return this.accessComplexity; } 
    public void setAccessComplexity(String accessComplexity) { 
		 this.accessComplexity = accessComplexity; } 
    String accessComplexity;
    @JsonProperty("authentication") 
    public String getAuthentication() { 
		 return this.authentication; } 
    public void setAuthentication(String authentication) { 
		 this.authentication = authentication; } 
    String authentication;
    @JsonProperty("confidentialityImpact") 
    public String getConfidentialityImpact() { 
		 return this.confidentialityImpact; } 
    public void setConfidentialityImpact(String confidentialityImpact) { 
		 this.confidentialityImpact = confidentialityImpact; } 
    String confidentialityImpact;
    @JsonProperty("integrityImpact") 
    public String getIntegrityImpact() { 
		 return this.integrityImpact; } 
    public void setIntegrityImpact(String integrityImpact) { 
		 this.integrityImpact = integrityImpact; } 
    String integrityImpact;
    @JsonProperty("availabilityImpact") 
    public String getAvailabilityImpact() { 
		 return this.availabilityImpact; } 
    public void setAvailabilityImpact(String availabilityImpact) { 
		 this.availabilityImpact = availabilityImpact; } 
    String availabilityImpact;
    @JsonProperty("baseScore") 
    public double getBaseScore() { 
		 return this.baseScore; } 
    public void setBaseScore(double baseScore) { 
		 this.baseScore = baseScore; } 
    public double baseScore;
    @JsonProperty("baseSeverity") 
    public String getBaseSeverity() { 
		 return this.baseSeverity; } 
    public void setBaseSeverity(String baseSeverity) { 
		 this.baseSeverity = baseSeverity; } 
    String baseSeverity;
}