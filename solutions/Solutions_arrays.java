package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/* THIS CHALLENGE IS YET TO BE COMPLETED AT A 100% ACCURACY */

public class Solutions_arrays {
	public static int solution(int[] A) {
        // write your code in Java SE 8

    	int count = 0;
    	
    	Arrays.sort(A);

        int total = A[0];

        List<Integer> res = new ArrayList<Integer>();
    	
    	int num = A[0];
    	
    	for (int i = 1; i<A.length-1; i+=2) {
    		if(!(A[i]== A[i-1]) && !(A[i] == A[i+1])){
                return A[i];
            }else if(!(A[i]== A[i-1]) && A[i]==A[i+1]){
            	return A[i-1];
            	
            }

    	}
    	return 0;
    	
    }
	 
	 public static void main(String[] args) {
		 int[] a = {3,4,3,2,1,3,8,7,4,7,2,1};
		 System.out.println(solution(a));
	 }

}
