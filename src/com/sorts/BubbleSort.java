package com.sorts;

/*
 * 冒泡排序
 * 稳定
 * 平均时间复杂度：n^2
 * refer: images/BubbleSort.png
 * */
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};

    sort(arr);
    System.out.print("\n最终排序: ");
    print(arr);
  }

  static void sort(int[] arr) {
    //     第一次循环后的结果: 3 5 6 1 7 8 4 2 9
    //    for (int j = 0; j < arr.length - 1; j++) {
    //      if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
    //    }

    // 结合外循环
    //        for (int i = 1; i < arr.length; i++) {
    //          for (int j = 0; j < arr.length - 1 - i; j++) {
    //            if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
    //          }
    for (int i = arr.length - 1; i > 0; i--) { // not i>=0
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
      }

      //            System.out.print("\n经过第" + i + "次循环之后，数组内容是: ");
      //      print(arr);
    }
  }

  static void swap(int[] arr, int i, int j) {
    if (i == j) return;
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  static void print(int[] arr) {
    for (int j : arr) {
      System.out.print(j + " ");
    }
  }
}
