package medium;

public class Test {
	public String distance(String str){
		int length = str.length();
		StringBuilder sb = new StringBuilder();
		int distance = 0;
		boolean pre = false;
		for(int i = 0;i<length;i++){
			for(int j = i;j<length;j++){
					if(str.charAt(j)=='1'){
						distance++;
						if(pre){
							sb.append(distance);
							break;
						}
					}else{
						sb.append("0");
						distance = 0;
						pre = true;
						break;
					}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args){
		Test t = new Test();
		System.out.println(t.distance("11000111011"));
	}
}
