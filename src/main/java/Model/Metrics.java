package Model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Metrics{
    @JsonProperty("cvssMetricV2") 
    public ArrayList<CvssMetricV2> getCvssMetricV2() { 
		 return this.cvssMetricV2; } 
    public void setCvssMetricV2(ArrayList<CvssMetricV2> cvssMetricV2) { 
		 this.cvssMetricV2 = cvssMetricV2; } 
    public ArrayList<CvssMetricV2> cvssMetricV2;
}