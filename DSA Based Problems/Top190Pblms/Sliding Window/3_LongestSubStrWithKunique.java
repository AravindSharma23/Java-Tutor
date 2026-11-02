//  Longest Substring with K Uniques - GFG - medium 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{  
	    
       String s = "aabacbebebe";
       int k = 3;
	   System.out.println(longestSubstr(s,k));
	    
        
      } 
      static int longestSubstr(String s , int k){
          int i = 0;
          int j = 0;
          int max = -1;
          
          HashMap<Character,Integer> map = new HashMap<>(); // store chars count
          
          while(j<s.length()){
              map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1); // add chars count
              
              while(map.size() > k){// if map size > k means remove  ele from start
                  map.put(s.charAt(i),map.get(s.charAt(i))-1);
                  if(map.get(s.charAt(i)) == 0){
                      map.remove(s.charAt(i));
                  }
                  i++;
              } 
              if(map.size() == k) max = Math.max(max,j-i+1); // get max len of substr 
              
              j++;
          }
          return max;
      }


}
