# Quick Sort

Quick Sort is a divide-and-conquer sorting algorithm that selects a 'pivot' element, partitions the array around the pivot, and recursively sorts the subarrays.

## How It Works
1. Pick a pivot element (e.g., first, last, or median element).
2. Partition the array so that elements smaller than the pivot go to the left and larger elements go to the right.
3. Recursively apply Quick Sort to the left and right subarrays.
4. The array becomes sorted when all partitions reach a single element.

## Example
### Input:
```
[10, 7, 8, 9, 1, 5]
```
### Steps:
1. Pick `5` as pivot, partition into `[1]`, `5`, `[10, 7, 8, 9]`
2. Pick `9` as pivot for right part, partition into `[7, 8]`, `9`, `[10]`
3. Continue partitioning until sorted.

Final sorted array: `[1, 5, 7, 8, 9, 10]`

## Time Complexity
- **Best Case:** O(n log n)
- **Worst Case:** O(n²) (when pivot is poorly chosen)
- **Average Case:** O(n log n)

## Space Complexity
- O(log n) (recursive call stack)

## Java Implementation
```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
```

## When to Use
✅ Efficient for large datasets with good pivot selection.  
❌ Worst-case performance occurs when a poor pivot is chosen.  

Quick Sort is widely used due to its efficiency and in-place sorting, making it suitable for many real-world applications.

