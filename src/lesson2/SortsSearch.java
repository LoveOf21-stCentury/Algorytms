package lesson2;

public class SortsSearch {

    public static void bubbleSort(int[] array) {
//    Необходимо написать один из простых алгоритмов сортировки,
//    имеющий сложность O(n2)
//    Можно выбрать из пузырьковой сортировки, сортировки вставками и
//    сортировки выбором
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void quickSort(int[] array, int min, int max) {
        //    Написать алгоритм быстрого поиска (quicksort)

        if (array == null || array.length == 0 || min >= max) return;
        int pivot = (max - min) / 2 + min;
        int midPoint = array[pivot];
        int n = min;
        int x = max;
        while (n <= x) {
            while (array[n] < midPoint) n++;
            while (array[x] > midPoint) x--;
            if (n <= x) {
                int temp = array[n];
                array[n] = array[x];
                array[x] = temp;
                n++;
                x--;
            }
        }
        if (min < x) quickSort(array, min, x);
        if (n < max) quickSort(array, n, max);

    }

    public int binarySearch(int[] array, int value) {
//        После успешной сортировки массива на нем можно использовать бинарный
//        поиск. Необходимо реализовать алгоритм бинарного поиска по
//        элементам.
        int left = 0;
        int right = array.length;
        int index = -1;

        while (left <= right) {
            int midPoint = (right - left) / 2 + left;
            if (array[midPoint] < value) {
                left = midPoint + 1;
            } else if (array[midPoint] > value) {
                right = midPoint - 1;
            } else if(array[midPoint] == value){
                index = midPoint;
                break;
            }
        }

        return index;
    }

}
