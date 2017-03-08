package easy;

public class RomanToInt {
	public int romanToInt(String s) {
		// **************************First solution*************************************
		int result = 0;
        int[] nums = new int[s.length()];
        char[] c = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(c[i]=='I') nums[i]=1;
            if(c[i]=='V') nums[i]=5;
            if(c[i]=='X') nums[i]=10;
            if(c[i]=='L') nums[i]=50;
            if(c[i]=='C') nums[i]=100;
            if(c[i]=='D') nums[i]=500;
            if(c[i]=='M') nums[i]=1000;
        }
        // AB If A<B,-A, If A>B,+A
        for(int i = 0;i<s.length()-1;i++){
            if(nums[i]<nums[i+1])
                result-=nums[i];
            else
                result+=nums[i];
        }
        // Don't forget the last one
        return result+nums[s.length()-1];
        
        // *************************Second solution*************************************
//        int sum=0;
//        if(s.indexOf("IV")!=-1){sum-=2;}
//        if(s.indexOf("IX")!=-1){sum-=2;}
//        if(s.indexOf("XL")!=-1){sum-=20;}
//        if(s.indexOf("XC")!=-1){sum-=20;}
//        if(s.indexOf("CD")!=-1){sum-=200;}
//        if(s.indexOf("CM")!=-1){sum-=200;}
//        
//        char c[]=s.toCharArray();
//        int count=0;
//        
//       for(;count<=s.length()-1;count++){
//           if(c[count]=='M') sum+=1000;
//           if(c[count]=='D') sum+=500;
//           if(c[count]=='C') sum+=100;
//           if(c[count]=='L') sum+=50;
//           if(c[count]=='X') sum+=10;
//           if(c[count]=='V') sum+=5;
//           if(c[count]=='I') sum+=1;
//           
//       }
//       
//       return sum;
    }
}
