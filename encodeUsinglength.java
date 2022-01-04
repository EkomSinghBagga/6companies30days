class GfG
 {
	String encode(String str)
	{
          //Your code here
          String ans = "";
          int i =1;
          int count = 1 ;
          while(str.length()>i){
              
              if(str.charAt(i-1) == str.charAt(i)){
                  count++;
                  
              }else{
                  ans += str.charAt(i-1);
                  ans += count;
                  count = 1 ;
              }
              i++;
          }
           ans += str.charAt(i-1);
                  ans += count;
          
          return ans;
	}
	
 }
