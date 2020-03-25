package com.syntax.class13;

class Google {
    public static int countVowels(String s)
    {
        char [] vowels = {'a','e','i','o','u'};
        
        s=s.toLowerCase();
        
        int cnt=0;
        
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<vowels.length;j++) {
                if(s.charAt(i)==vowels[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("hafizullah")); //3
        System.out.println(countVowels("Sheba")); //9
    }
}
  
