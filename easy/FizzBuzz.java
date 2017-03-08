package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<String>();
		//Better solution 40296ns
//		 for(int i=1,fizz=0,buzz=0;i<=n ;i++){
//	            fizz++;
//	            buzz++;
//	            if(fizz==3 && buzz==5){
//	                result.add("FizzBuzz");
//	                fizz=0;
//	                buzz=0;
//	            }else if(fizz==3){
//	            	result.add("Fizz");
//	                fizz=0;
//	            }else if(buzz==5){
//	            	result.add("Buzz");
//	                buzz=0;
//	            }else{
//	            	result.add(String.valueOf(i));
//	            }
//	        } 
		//My solution 65975ns
		for(int i=1;i<n+1;i++){
			if(i%3==0 && i%5==0){
				result.add("FizzBuzz");
			}else if(i%3==0 && i%5!=0){
				result.add("Fizz");
			}else if(i%3!=0 && i%5==0){
				result.add("Buzz");
			}else{
				result.add(""+i);
			}
		}
		return result;
    }
	
	public static void main(String[] args){
		FizzBuzz fb = new FizzBuzz();
		long start = System.nanoTime();
		List<String> a = fb.fizzBuzz(15);
		long end = System.nanoTime();
		System.out.println(end - start);
		for(String b:a){
			System.out.println(b);
		}
	}
}
