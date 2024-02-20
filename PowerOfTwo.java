<<<<<<< HEAD
class Solution {
public:
    bool isPowerOfTwo(int n) {
         if(n==0){
            return false;
        }
        // if(n<0){
        //     if((n & (n+1))==0){
        //     return true;
        // } 
        long long n_long = n;
         long long c = (long long)(n_long & (n_long - 1));

       
        if(c==0){
            return true;
        }
       
        return false;
    }
=======
class Solution {
public:
    bool isPowerOfTwo(int n) {
         if(n==0){
            return false;
        }
        // if(n<0){
        //     if((n & (n+1))==0){
        //     return true;
        // } 
        long long n_long = n;
         long long c = (long long)(n_long & (n_long - 1));

       
        if(c==0){
            return true;
        }
       
        return false;
    }
>>>>>>> c2ac130fb50a62d0c73d7423ea4358bc486b2ef2
};