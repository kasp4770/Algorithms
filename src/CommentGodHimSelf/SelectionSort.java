package CommentGodHimSelf;

/**
 * SELECTION SORT ALGORITHM
 *
 * Denne klasse demonstrerer en selection sort algoritme i Java.
 *
 * @author Daniel Lyck.
 * @since 30-11-2017
 */

public class SelectionSort {

    public static int[] doSelectionSort(int[] arr){

        //For-loop der gennemløber array
        for (int i = 0; i < arr.length - 1; i++) {

            //Erklærer og initialiserer variabel "index"
            int index = i;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        return arr;

    }

    public static void main(String a[]) {

        //Erklærer og initialiserer array "arr1" og "arr2"
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);

        //For-loop
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }

    }

}