import java.util.Scanner;

public class SortArray {
    // Function to remove the element
    public static int[] removeTheElement(int[] arr,
                                         int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
    //Delete an element in C++
//    cin >> k;
//	for (int i = k; i < n; i++){
//        a[i] = a[i+1];
//    }
//    n--;

    // Function to insert x in arr at position pos
    public static int[] insertX(int n, int arr[], int x, int pos) {
        int i;
        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }
    //Insert an element in C++
//    cin >> k >> x;
//	for (int i = n; i >= k+1; i--){
//        a[i] = a[i-1];
//    }
//    a[k] = x;
//    n++;

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pos;//position insert
        int x;//value element insert
        int posdel;//position element delete
        pos = sc.nextInt();
        x = sc.nextInt();
        posdel = sc.nextInt();

        int arr[] = {1, 2, 8, 4, 9, 6, 7, 5, 3};
        int plusArray[] = {1, 2, 8, 4, 9, 6, 7, 5, 3};
        int n = arr.length;

        System.out.println("Before sort");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sortASC(arr);
        System.out.println("");
        System.out.println("Sort ASC ");
        show(arr);
        sortDESC(arr);
        System.out.println("");
        System.out.println("Sort DESC ");
        show(arr);

        plusArray = insertX(n, plusArray, x, pos);
        System.out.println("");
        System.out.println("After insert "+x+" at " + pos);
        show(plusArray);

        // Remove the element
        plusArray = removeTheElement(plusArray, posdel);
        System.out.println("");
        System.out.println("After delete element at position: " + posdel);
        show(plusArray);

    }
}
