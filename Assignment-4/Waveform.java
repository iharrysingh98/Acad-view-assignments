import java.util.Scanner;
import java.util.*;
 class Wave
{
     public static void main(String args[])
    {

        Wave obj= new Wave();
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int n = array.length;
        obj.sortInWave(array, n);
        for (int i : array)
            System.out.print(i + " ");
    } 

    void swap(int array[], int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    void sortInWave(int array[], int n)
    {
        Arrays.sort(array);
        for (int i=0; i<n-1; i += 2)
            swap(array, i, i+1);
    }

}