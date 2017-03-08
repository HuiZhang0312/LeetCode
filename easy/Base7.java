package easy;

public class Base7 {
	// ***************************First solution*******************************
	public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean flag = num>0?false:true;
        num=Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(num%7!=0 || num>=7){
            if(num%7!=0){
                sb.insert(0,num%7);
                num=(num-num%7)/7;
            }else if(num>=7){
                sb.insert(0,0);
                num=num/7;
            }
        }
        
        if(num>0) sb.insert(0,num);
        if(flag){
            sb.insert(0,"-");
        }
        return sb.toString();
    }
	
	// **************************Second solution******************************
//    if(num==0) return "0";
//    boolean flag = num>0?false:true;
//    num=Math.abs(num);
//    StringBuilder sb = new StringBuilder();
//    while(num!=0){
//        sb.insert(0,num%7);
//        num=num/7;
//    }
//    if(flag){
//        sb.insert(0,"-");
//    }
//    return sb.toString();
	
	// ************************Third solution********************************
	// Used built in library
	//return Integer.toString(num,7);
}
