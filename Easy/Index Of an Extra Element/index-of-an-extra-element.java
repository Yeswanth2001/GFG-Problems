//{ Driver Code Starts
import java.util.*;
class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(a, b, n));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        
        int l = 0, h = n-1, index = -1;
        while(l <= h ) {
            int mid = l+(h-l)/2;
            
            if(l < n-1 && a[mid] == b[mid]) {
                l=mid+1;
            } else {
                h = mid-1;
                index = mid;
            }
        }
        return index;
    }
}