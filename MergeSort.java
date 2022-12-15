import java.util.Arrays;

public class MergeSort {


    public void mergeSort(int[] A, int start, int end) {
        if (start < end) {
            int p = (int) Math.floor((start + end) / 2);
            mergeSort(A, start, p);
            mergeSort(A, p + 1, end);
            merge(A, start, p, end);

        }

    }


    public void merge(int [] A,int start,int mid,int end){
        int left_size = (mid-start)+1;
        int right_size = (end-mid);

        int [] left = new int[left_size];
        int [] right = new int[right_size];

        for(int i = 0;i<left_size;i++){
            left[i] = A[i];
        }
        for (int j = 0;j<right_size;j++){
            right[j] = A[mid +1+j];
        }

        int i = 0, j = 0, k = start;
        while (i<left_size&& j<right_size){
            if(left[i]<right[j]){
                A[k] = left[i];
                i++;
            }else{
                A[j] = right[k];
                j++;
            }
            k++;
        }
    }
//    public void merge(int[] A, int p, int start, int end) {
//        int[] left = Arrays.copyOfRange(A, start, p);
//        int[] right = Arrays.copyOfRange(A, p + 1, end);
//        int i = 0, j = 0, k = start;
//        while (i < left.length && right.length > j) {
//            if (A[i] < A[j]) {
//                A[k] = A[i];
//                i++;
//            } else {
//                A[k] = A[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < left.length) {
//            A[k] = A[i];
//            i++;
//            k++;
//        }
//        while (j < right.length) {
//            A[k] = A[j];
//            j++;
//            k++;
//        }
//    }
}

