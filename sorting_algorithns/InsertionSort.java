
public class InsertionSort {

    private static void InsertionSort(int[] arrayToSort){

       for(int i = 1; i < arrayToSort.length; i++){
        int key = arrayToSort[i];
        int j = i - 1;
        while(j > 0 && arrayToSort[j] > key){
            arrayToSort[j+1] = arrayToSort[j];
            j--;
        }
        arrayToSort[j] = key;
       }
    }

    private static void printArray(int[] array){

        System.out.print(
            '[');
        for(int i = 0; i < array.length; i++){

            System.out.print(array[i] + ',');
        }
        System.out.println(']');
    }

    public static void main(String[] args){

        int[] arrayToSort = { 18, 14, 20, 4, 0};

        InsertionSort(arrayToSort);
        printArray(arrayToSort);
    }
}
