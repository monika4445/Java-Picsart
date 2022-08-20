//Implement HeapSort algorithm

import java.util.*;

public class HeapSort implements InplaceSort {

  @Override
  public void sort(int[] values) {
    Heapsort.heapsort(values);
  }

  private static void heapsort(int[] arr) {
    if (arr == null) return;
    int n = arr.length;

    // Heapify, converts array into binary heap O(n), see:
    for (int i = Math.max(0, (n / 2) - 1); i >= 0; i--) {
      sink(arr, n, i);
    }

    // Sorting bit
    for (int i = n - 1; i >= 0; i--) {
      swap(arr, 0, i);
      sink(arr, i, 0);
    }
  }

  private static void sink(int[] ar, int n, int i) {
    while (true) {
      int left = 2 * i + 1; // Left  node
      int right = 2 * i + 2; // Right node
      int largest = i;

      // Right child is larger than parent
      if (right < n && ar[right] > ar[largest]) largest = right;

      // Left child is larger than parent
      if (left < n && ar[left] > ar[largest]) largest = left;

      // Move down the tree following the largest node
      if (largest != i) {
        swap(ar, largest, i);
        i = largest;
      } else break;
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  public static void main(String[] args) {
    Heapsort sorter = new Heapsort();
    int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
    sorter.sort(array);
    // Prints:
    // [-13, 2, 3, 4, 4, 6, 8, 10]
    System.out.println(java.util.Arrays.toString(array));
  }
}