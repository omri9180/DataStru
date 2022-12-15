public class Main {
    public static void main(String[] args) {

        int[] A = {9, 7, 5, 222, 1, 2, 12, 8, 11, 10};
        QuickSort sorted = new QuickSort(A, 0, A.length - 1);
        BinarySearch binSrc = new BinarySearch();

        System.out.println(binSrc.binarySearchMain(A, 222));
        for (int b : A) {
            System.out.print("->");
            System.out.print(b);
        }
        System.out.println();

        BinarySearchTree tree = new BinarySearchTree();
        // Insert some elements into the tree.
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        // Search for some elements in the tree.
        System.out.println(tree.search(5));  // should print true
            System.out.println(tree.search(3));  // should print true
            System.out.println(tree.search(7));  // should print true
            System.out.println(tree.search(1));  // should print true
            System.out.println(tree.search(4));  // should print true
            System.out.println(tree.search(6));  // should print true

        int[] merge = {3,4,2,5,4,1,5,6};
        MergeSort mergeS = new MergeSort();
        mergeS.mergeSort(merge,0,merge.length-1);

        for (int a:merge){
            System.out.print(a);
        }
    }


}

