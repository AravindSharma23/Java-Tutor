// leetcode 50 - Imp - Medium -> Pow(x, n)

/* 

Mathematical rules:

x⁰ = 1

If n is even →
xⁿ = (x²)ⁿ⁄²

If n is odd →
xⁿ = x × xⁿ⁻¹

If n is negative →
x⁻ⁿ = 1 / xⁿ

*/
class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(nn < 0) //if its -ve means convert it into +ve
            nn = -1 *nn;
        
        while(nn>0){
            if(nn%2 == 1){ // if odd
             ans = ans * x;
             nn = nn - 1;
            }else{
             x = x *x;
             nn = nn/2;
            }
        }
        if(n<0) ans = (double)(1.0)/(double)(ans);
        
        return ans;

    }
    
}
