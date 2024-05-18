public class MergeSort {

    private static void mergeSort(int[] array){

        int arraySize = array.length;

        //base case when array contains single element
        if(arraySize <= 1) return;

        int middle = arraySize/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[arraySize - middle];
        int l = 0, r = 0;

        //Filling left and right arrays
        for(; l < arraySize; l++){
            if(l < middle){
                leftArray[l] = array[l];

            } else{
                rightArray[r] = array[l];
                r++;
            }
        }

        //calling recursive functions
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){

        int l = 0, r = 0, i = 0;

        while(l < array.length/2 && r < (array.length - array.length/2)){

            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < array.length/2){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < (array.length - array.length/2)){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args){

        int[] arrayToSort = {3, 6, 8, 1, 2, 5, 7, 4};

        mergeSort(arrayToSort);

        for(int i = 0; i < arrayToSort.length; i++){
            if(i != arrayToSort.length - 1){
                System.out.print(arrayToSort[i] + ", ");
            } else{
                System.out.print(arrayToSort[i]);

            }
        }
    }
}
