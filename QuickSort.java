public class QuickSort {

    public QuickSort(int[] A, int start, int end) {
        quickSort(A, start, end);
    }

    public int partition(int[] A, int start, int end) {
        int pivot = A[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (A[j] <= pivot) {
                i += 1;
                swap(A, i, j);
            }
        }

        swap(A, i + 1, end);
        return i + 1;
    }

    public void quickSort(int[] A, int start, int end) {

        if (start >= end) {
            return;
        }
        if (start < end) {
            int p = partition(A, start, end);


            quickSort(A, start, p - 1);
            quickSort(A, p + 1, end);
        }
    }

    public void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}



