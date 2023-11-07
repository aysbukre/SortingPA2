/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Root;

import Model.Vulnerability;

public class SortAlgorithms {
  public static void insertionSort(Vulnerability[] arr)
    {
        int n = arr.length;
        int i = 1;
        int j = 0;
        while(i < n && j != arr.length) {
            Vulnerability key = arr[i];
            try {
                if(arr[i].cve.metrics.cvssMetricV2.get(0) != null && arr[j].cve.metrics.cvssMetricV2.get(0) != null)
            {
                double score1 = arr[j].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore;
                double score2 = arr[i].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore;
                while (j >= 0 && score1 > score2) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
                i++;
            } catch (Exception e) {
                j++;
            }
        }
    }
  public static void mergeSort(Vulnerability[] arr, int size) {
    if (size < 2) {
        return;
    }
    int mid = size / 2;
    Vulnerability[] l = new Vulnerability[mid];
    Vulnerability[] r = new Vulnerability[size - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = arr[i];
    }
    for (int i = mid; i < size; i++) {
        r[i - mid] = arr[i];
    }
    mergeSort(l, mid);
    mergeSort(r, size - mid);

    merge(arr, l, r, mid, size - mid);
  }
             
  public static void quickSort(Vulnerability[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
 public static void heapSort(Vulnerability[] arr)
    {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
 
        for (int i = N - 1; i > 0; i--) {
            Vulnerability temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
     
    private static void heapify(Vulnerability[] arr, int N, int i)
        {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2;
            try {
                if (l < N && arr[l].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore > arr[largest].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore)
            largest = l;
        if (r < N && arr[r].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore > arr[largest].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore)
            largest = r;
        if (largest != i) {
            Vulnerability swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            
            heapify(arr, N, largest);
        }
            } catch (Exception e) {
            }
    }
  private static void merge(Vulnerability[] arr, Vulnerability[] l, Vulnerability[] r, int left, int right) {
    int i = 0, j = 0, k = 0;
        try {
          while (i < left && j < right) {
            if (l[i].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore <= r[j].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
      } catch (Exception e) {
      }
    }
   private static void swap(Vulnerability[] arr, int i, int j)
        {
           Vulnerability temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
    private static int partition(Vulnerability[] arr, int low, int high)
        {
            Vulnerability pivot = arr[high];
            int i = (low - 1);
            try {
                for (int j = low; j <= high - 1; j++) {
                if (arr[j].cve.metrics.cvssMetricV2.get(0).cvssData.baseScore < pivot.cve.metrics.cvssMetricV2.get(0).cvssData.baseScore) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return (i + 1);
            } catch (Exception e) {
                return i + 1;
            }
        }
}
