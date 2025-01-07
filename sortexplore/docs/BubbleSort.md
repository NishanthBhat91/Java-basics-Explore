# Bubble Sort

## 🔹 Overview
Bubble Sort is a simple sorting algorithm that repeatedly **compares adjacent elements** and **swaps them if they are in the wrong order**. The process continues until the entire array is sorted.

## 🔹 Working Principle
1. Start at the first element and compare it with the next one.
2. If the first is greater than the second, swap them.
3. Move to the next pair and repeat.
4. After one full pass, the largest element is at the end.
5. Repeat for the remaining elements until no swaps are needed.

## 🔹 Example Walkthrough
### **🔸 Input:**

`[5, 3, 8, 4, 2]`

### **🔸 Iteration Steps:**
| Pass | Array State |
|------|------------|
| 1st  | `[3, 5, 4, 2, 8]` |
| 2nd  | `[3, 4, 2, 5, 8]` |
| 3rd  | `[3, 2, 4, 5, 8]` |
| 4th  | `[2, 3, 4, 5, 8]` ✅ Sorted |

## 🔹 Time Complexity
- **Best Case (Sorted Input)** → **O(n)** (if optimized with a flag to check swaps)
- **Average & Worst Case** → **O(n²)** (nested loops)
- **Space Complexity** → **O(1)** (in-place sorting)

## 🔹 Java Implementation
```java
public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimized for best case O(n)
        }
    }
}
```

## 🔹 When to Use Bubble Sort?
✅ When the list is already nearly sorted (optimized version runs in O(n)).
❌ Not suitable for large datasets due to O(n²) complexity.

## 🔹 See Also
- Selection Sort - Picks the smallest element each time.
- Insertion Sort - Inserts elements into a sorted portion.

