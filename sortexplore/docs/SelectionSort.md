# Selection Sort

Selection Sort is a simple comparison-based sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted part of the array and swapping it with the first unsorted element.

## How It Works
1. Divide the array into a sorted and an unsorted part.
2. Repeatedly find the smallest element in the unsorted part.
3. Swap it with the leftmost unsorted element, moving the boundary between sorted and unsorted.
4. Repeat until the entire array is sorted.

## Example
### Input:
```
[64, 25, 12, 22, 11]
```
### Steps:
1. Find the smallest element (11) and swap with the first element.
   - `[11, 25, 12, 22, 64]`
2. Find the next smallest (12) and swap with the second element.
   - `[11, 12, 25, 22, 64]`
3. Find the next smallest (22) and swap with the third element.
   - `[11, 12, 22, 25, 64]`
4. Find the next smallest (25) and swap with the fourth element.
   - `[11, 12, 22, 25, 64]`

Final sorted array: `[11, 12, 22, 25, 64]`

## Time Complexity
- **Best Case:** O(n²)
- **Worst Case:** O(n²)
- **Average Case:** O(n²)

## Space Complexity
- O(1) (in-place sorting)

## Java Implementation
```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

## When to Use
✅ When memory space is a constraint (in-place sorting).  
❌ When performance is critical (inefficient for large datasets).  

Selection Sort is useful for small datasets and when memory usage must be minimal, but for larger datasets, more efficient algorithms like Quick Sort or Merge Sort are preferred.

