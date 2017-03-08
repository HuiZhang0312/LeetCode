package easy;

public class ConstructRectangular {
    public int[] constructRectangle(int area) {
    	//********************Better solution***************************
        int[] result = new int[2];
        if(area == 0){
            return result;
        }
        int a = (int)Math.sqrt(area);
        while(area%a != 0){
            a--;
        }
        int b = area/a;
        result[0] = b;
        result[1] = a;
        return result;
        // *****************Straightforward solution*******slow********************
        // int minDiff=area;
        // int w=0,l=0;
        // for(int i=1;i<area+1;i++){
        //     int a = i;
        //     int b = area%i==0?area/i:0;
        //     if(b!=0 && minDiff>Math.abs(a-b)){
        //         minDiff = Math.abs(a-b);
        //         l=a>=b?a:b;
        //         w=a+b-l;
        //     }
        // }
        // int[] result = new int[2];
        // result[0]=l;
        // result[1]=w;
        // return result;
    }
}
