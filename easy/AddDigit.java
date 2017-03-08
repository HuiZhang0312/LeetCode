package easy;

public class AddDigit {
	// All possible results appear periodically from 1 to 9 except when num is 0
	public int addDigits(int num) {
        if(num==0)return 0;
        return num%9==0?9:num%9;
    }
}
