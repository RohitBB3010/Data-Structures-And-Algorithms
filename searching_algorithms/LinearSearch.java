public class LinearSearch {

    private static int linearSearch(int searchValue, int[] arrayToSearch){
        int searchIndex = -1;

        for(int i = 0; i < arrayToSearch.length; i++){
            if(searchValue == arrayToSearch[i]){
                searchIndex = i;
            }
        }

        return searchIndex;
    }

    public static void main(String[] args){

        int[] searchArray = {2, 4, 6, 8, 10};

        int returnValue = linearSearch(13, searchArray);
        System.out.println(returnValue);
    }
}
