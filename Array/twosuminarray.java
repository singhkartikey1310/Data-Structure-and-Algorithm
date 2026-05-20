public class twosuminarray {
        public static void main(String[] args) {
        int num[] = {2,4,7,8,4,1};
        int target = 5;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == target){
                    System.out.println("the numbers are : " + num[i] + "," + num[j]);
                }
            }
            
        }
        
    }
    
    
}
