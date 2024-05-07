public class BinarySearch {

    public static int BinarySearch(int searchValue, int[] searchArray, int low, int high){

        if(low <= high){
            int mid = (low + high)/2;

            if(searchArray[mid] == searchValue){
                return mid;
            }
            if(searchArray[mid] > searchValue){
                return BinarySearch(searchValue, searchArray, 0, mid-1);
            }

            if(searchArray[mid] < searchValue){
                return BinarySearch(searchValue, searchArray, mid+1, searchArray.length-1);
            }
        }

        return -1;
    }

    public static void main(String[] args){

        int[] searchArray = {2, 4, 6, 8, 10};

        int returnValue = BinarySearch(10, searchArray, 0, searchArray.length-1);
        System.out.println(returnValue);
    }
}
