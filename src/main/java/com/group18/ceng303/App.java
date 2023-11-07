package com.group18.ceng303;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import Model.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import Root.Root;
import Root.SortAlgorithms;


public class App 
{
	 public static void main(String[] args) {
		 try {
		   String json = "["+ fetchNISTData()+"]";
		   System.out.println(json);
	        try{
	            ObjectMapper om = new ObjectMapper();
	            om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	            System.out.println(json);
	            Root[] roots = om.readValue(json, Root[].class);
	            // INSERTION SORT
	            LocalTime test1aTime = LocalTime.now();
	            for(Root root : roots) {
	                Vulnerability[] insertionSortedVulnerabilities = root.vulnerabilities;
	                SortAlgorithms.insertionSort(insertionSortedVulnerabilities);
	                root.setVulnerabilities(insertionSortedVulnerabilities);
	            }
	            
	             LocalTime test1bTime = LocalTime.now();
	                System.out.println("Insetion Sort Time: "
	                + test1aTime.until(test1bTime, ChronoUnit.MILLIS) + " milliseconds.");
	            // MERGE SORT
	            LocalTime test2aTime = LocalTime.now();
	            
	            for(Root root : roots){
	                Vulnerability[] mergeSortedVulnerabilities = root.vulnerabilities;
	                SortAlgorithms.mergeSort(mergeSortedVulnerabilities, mergeSortedVulnerabilities.length);
	                root.setVulnerabilities(mergeSortedVulnerabilities);
	            }
	            
	            LocalTime test2bTime = LocalTime.now();
	                System.out.println("Merge Sort Time: "
	                    + test2aTime.until(test2bTime, ChronoUnit.MILLIS) + " milliseconds.");
	                		// QUICK SORT
	           LocalTime test3aTime = LocalTime.now();
	            for(Root root: roots) {    
	                Vulnerability[] quickSortedVulnerabilities = root.vulnerabilities;
	                SortAlgorithms.quickSort(quickSortedVulnerabilities, 0, quickSortedVulnerabilities.length - 1);
	                root.setVulnerabilities(quickSortedVulnerabilities);
	            }
	            
	            
	            LocalTime test3bTime = LocalTime.now();
	                System.out.println("Quick Sort Time: "
	                    + test3aTime.until(test3bTime, ChronoUnit.MILLIS) + " milliseconds.");
	                          // HEAP SORT
	            LocalTime test4aTime = LocalTime.now();
	            for (Root root : roots) {
	                Vulnerability[] heapSortedVulnerabilities = root.vulnerabilities;
	                SortAlgorithms.heapSort(heapSortedVulnerabilities);
	                root.setVulnerabilities(heapSortedVulnerabilities);   
	            }
	            
	            
	            LocalTime test4bTime = LocalTime.now();
	                System.out.println("Heap Sort Time: "
	                    + test4aTime.until(test4bTime, ChronoUnit.MILLIS) + " milliseconds.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 }
		 
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
	    }
		 
	 public static String fetchNISTData() {
	        String baseUrl = "https://services.nvd.nist.gov/rest/json/cves/2.0/";
	        
	        HttpClient httpClient = HttpClient.newHttpClient();

	            String requestUrl = baseUrl;

	            HttpRequest httpRequest = HttpRequest.newBuilder()
	                    .uri(URI.create(requestUrl))
	                    .build();

	            try {
	                
	                HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

	                
	                if (response.statusCode() == 200) {
	                    String responseBody = response.body();
	                    
	                    System.out.println(responseBody);
	                    System.out.println(((Object) responseBody).getClass().getSimpleName());

	              	                   
	                    return responseBody;
	                } else {
	                    System.out.println("Hata kodu: " + response.statusCode());
	                    return "error!";
	                }
	                
	            } catch (Exception e) {
	                e.printStackTrace();
	                return "error!";
	            }
	        }
	    } 
	 

