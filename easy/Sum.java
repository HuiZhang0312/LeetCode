package easy;

public class Sum {
	//Get sum without using +
	public int getSum(int a, int b) {
        return  b==0?a:getSum(a^b,(a&b)<<1);
    }
	public static void main(String[] args){
		Sum s = new Sum();
		System.out.println(s.getSum(5, 1));
	}
}
