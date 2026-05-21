public class smallestvalueinarray {
    public static void main(String[] args) {
        int num[] = {88,33,5,66,3,1,8} ;
        int min = Integer.MAX_VALUE;
        for (int number : num){ //"for each loop" is used when we have to visit each index consecutively and can be used in place where index is used
            if(number < min){
                min = number;
            }
        }
        System.out.println("smallest number is " + min);

    }
    
}
