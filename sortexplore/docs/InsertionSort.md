# Insertion Sort

Insertion Sort is a simple sorting algorithm that builds the sorted array one element at a time by shifting elements as necessary.

## How It Works
1. Assume the first element is already sorted.
2. Pick the next element and compare it with elements in the sorted part.
3. Shift larger elements to the right to create space.
4. Insert the picked element in its correct position.
5. Repeat until all elements are sorted.

## Example
### Input:
```
[12, 11, 13, 5, 6]
```
### Steps:
1. Take `11`, insert it before `12` → `[11, 12, 13, 5, 6]`
2. Take `13`, it is already in place → `[11, 12, 13, 5, 6]`
3. Take `5`, move `13`, `12`, and `11` to the right, insert `5` → `[5, 11, 12, 13, 6]`
4. Take `6`, move `13`, `12`, and `11` to the right, insert `6` → `[5, 6, 11, 12, 13]`

Final sorted array: `[5, 6, 11, 12, 13]`

## Time Complexity
- **Best Case:** O(n) (already sorted)
- **Worst Case:** O(n²) (reverse sorted)
- **Average Case:** O(n²)

## Space Complexity
- O(1) (in-place sorting)

## Java Implementation
```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

## When to Use
✅ Efficient for small datasets and nearly sorted arrays.  
❌ Not ideal for large datasets due to O(n²) complexity.  

Insertion Sort is useful when sorting small datasets or when the array is already nearly sorted.

