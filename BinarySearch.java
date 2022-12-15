public class BinarySearch {

    public int binarySearchMain(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    public int binarySearch(int[] A, int target, int start, int end) {
        if (start>end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (A[mid] == target) {
            return mid;
        }
        else if (A[mid] < target) {
            return binarySearch(A, target, mid + 1, end);
        } else {
           return binarySearch(A, target, start, mid - 1);
        }



    }

}
