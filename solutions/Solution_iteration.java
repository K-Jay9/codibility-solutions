package solutions;

/*

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

    class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_iteration {
	
    public int solution(int N) {
        // write your code in Java SE 8


            // convert the integer into a binary string
            String binstring = Integer.toBinaryString(N);
            
            
            // convert the string into a character array
            char[] ch = binstring.toCharArray();
            
            // create a list to keep numbers
            List<Integer> res = new ArrayList<Integer>();
            
            
            //  list indexing variable
            int start = 0;
            
            // variable to keep count of '0's inside two '1's
            int count  = 0;
            
            // adding a 0 in case the list is never initialized
            res.add(0);

            //  looping through all the elements of the char array
            for( int i = 0; i < binstring.length() ; i++) {
            	
            	// checking for the start of the count
            	if (ch[i] == '1' && i > start) {
            		
            		// add the count to the List and restart the count while setting the start index
            		res.add(count);
            		start = i;
                    count = 0;
            	}
            	
            	// increasing the count with the occurrence of the '0' char
            	if (i > start && ch[i] == '0') {
            		count++;
            	}
            	
            }
            // returning the maximum in the List 
            return Collections.max(res);
            
    	}

}
