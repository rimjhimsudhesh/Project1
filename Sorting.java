
import java.util.Arrays;
import java.util.List;

public class Sorting{
    public static void main(String[]args){
        // implement Sorting algorithm
        //using Insertion sort - Bubble sort - Quick sort. for a list of unique numbers between 1 - 50. 
        //The length of the list is 20. The function should take list of number as argument.

        int [] arr1 = {3,5,6,8,9,1};
       
        
        insertionSort(arr1);

      
        
       
    }

    public static void insertionSort(int array[]){
        int n = array.length;
        for(int i=1; i < n; i++){
            int temp = array[i];
            int j = i-1;

        while( (j >= 0) && (array[i] > temp)){
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = temp;
            
        }
       
    }

    public static void bubbleSort(int array[]){
        int n = array.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void quickSort(int array[]){
        
    }

}