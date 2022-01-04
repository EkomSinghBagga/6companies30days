class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        long pro=1;
        int ans=0,j=0,i=0;
        for(i=0;i<n;i++){
            pro*=a[i];
            if(pro>=k){
                while(j<i&&pro>0){
                    pro/=a[j];
                    if(pro<k){
                        ans+=i-j;
                        j++;
                        break;
                    }
                    j++;
                }
               } else
                ans+=i-j+1;
            
        }
        return ans;
    }
}
