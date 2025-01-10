# Heap Sort

Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure to build a heap and repeatedly extract the maximum (or minimum) element.

## How It Works
1. Build a max heap from the input array.
2. Swap the root (largest element) with the last item and reduce the heap size.
3. Heapify the root to maintain the heap property.
4. Repeat until the heap size is reduced to one.

## Example
### Input:
```
[4, 10, 3, 5, 1]
```
### Steps:
1. Convert the array into a max heap: `[10, 5, 3, 4, 1]`
2. Swap `10` with `1`, heapify: `[5, 4, 3, 1, 10]`
3. Swap `5` with `1`, heapify: `[4, 1, 3, 5, 10]`
4. Continue until sorted.

Final sorted array: `[1, 3, 4, 5, 10]`

## Time Complexity
- **Best Case:** O(n log n)
- **Worst Case:** O(n log n)
- **Average Case:** O(n log n)

## Space Complexity
- O(1) (in-place sorting)

## Java Implementation
```java
public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        int arr[] = {4, 10, 3, 5, 1};
        new HeapSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

## When to Use
✅ Efficient for large datasets with O(n log n) performance.  
❌ Slower than Quick Sort on average but guarantees O(n log n) worst-case time complexity.  

Heap Sort is useful when a stable O(n log n) performance is required without relying on random pivot selection like Quick Sort.

