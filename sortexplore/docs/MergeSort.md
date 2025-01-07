# Merge Sort

Merge Sort is a divide-and-conquer sorting algorithm that splits an array into smaller parts, sorts them individually, and then merges them back together.

## How It Works
1. Divide the array into two halves until each subarray contains a single element.
2. Recursively sort both halves.
3. Merge the sorted halves back together in order.
4. Repeat until the entire array is sorted.

## Example
### Input:
```
[38, 27, 43, 3, 9, 82, 10]
```
### Steps:
1. Split into `[38, 27, 43]` and `[3, 9, 82, 10]`
2. Split `[38, 27, 43]` into `[38]` and `[27, 43]`
3. Split `[27, 43]` into `[27]` and `[43]`, then merge into `[27, 43]`
4. Merge `[38]` and `[27, 43]` into `[27, 38, 43]`
5. Repeat similar steps for `[3, 9, 82, 10]`
6. Merge final halves into `[3, 9, 10, 27, 38, 43, 82]`

Final sorted array: `[3, 9, 10, 27, 38, 43, 82]`

## Time Complexity
- **Best Case:** O(n log n)
- **Worst Case:** O(n log n)
- **Average Case:** O(n log n)

## Space Complexity
- O(n) (due to auxiliary space used during merging)

## Java Implementation
```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) arr[k++] = leftArr[i++];
            else arr[k++] = rightArr[j++];
        }
        
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
```

## When to Use
✅ Efficient for large datasets due to O(n log n) complexity.  
❌ Uses extra memory for merging, making it less space-efficient than in-place sorting algorithms.  

Merge Sort is preferred when stability and predictable performance are required, especially for sorting linked lists or external sorting scenarios.

