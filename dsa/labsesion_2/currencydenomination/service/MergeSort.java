package dsa.labsesion_2.currencydenomination.service;

public class MergeSort {

    public void mergeSort(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e) {
            if(arr[i] >= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int index = 0; index < mix.length; index++) {
            arr[s + index] = mix[index];
        }
    }

}
