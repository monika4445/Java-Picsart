//Implement Insertion sort

public class InsertionSort implements InplaceSort {

  @Override
  public void sort(int[] values) {
    InsertionSort.insertionSort(values);
  }

  // Sort the given array using insertion sort. The idea behind
  // insertion sort is that at the array is already sorted from
  // [0, i] and you want to add the element at position i+1, so
  // you 'insert' it at the appropriate location.
  private static void insertionSort(int[] arr) {
    if (arr == null) {
      return;
    }

    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
        swap(arr, j - 1, j);
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  public static void main(String[] args) {
      
    InplaceSort sorter = new InsertionSort();
    
    int[] array = {4, 6, 5, 19, 7};
    sorter.sort(array);
    
    System.out.println(java.util.Arrays.toString(array));
  }
}