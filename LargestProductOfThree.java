// Maximum product of a triplet (subsequence of size 3) in array
// Input:
// 4
// -10 -10 5 2     
// Output: Maximum product is 500

import java.util.*;

class LargestProductOfThree {

    static int maxProduct(int []arr, int n) {

        if (n < 3)
            return -1;
    
        int max_product = Integer.MIN_VALUE;
    
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    max_product = Math.max(max_product,
                            arr[i] * arr[j] * arr[k]);
    
        return max_product;
    }
    
        public static void main (String [] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = maxProduct(arr, n);
    
            if (max == -1)
                System.out.println("No Triplet Exists");
            else
                System.out.println("Maximum product is " + max);
            sc.close();
        }
    }
    