public class main {
    public static void main (String[]args){

        int arr [] = {1,1,2,3,3,6,6,6,9,9,9,9};

        int length = arr.length;
        length = removeDuplicateElementsInArrayExample.removeDuplicateElements(arr, length);

        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");

    }

}
