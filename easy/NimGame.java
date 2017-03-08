package easy;

public class NimGame {
	//Player who start with 4n will lose!
	public boolean canWin(int n){
		return n%4!=0;
	}
	
}
