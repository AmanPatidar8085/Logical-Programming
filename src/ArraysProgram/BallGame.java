package ArraysProgram;

import java.util.ArrayList;

public class BallGame {
public static void main(String[] args) {
	String arr[]= {"5","2","C","D","+"};
	ArrayList<Integer>al=new ArrayList<>();
	int j=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].equals("C")) {
			al.remove(al.size() - 1);
			j--;
		}
		else if(arr[i].equals("D")) {
			al.add(al.get(j)*2);
			j++;
		}
		else if(arr[i].equals("+")) {
			al.add(al.get(j)+al.get(j-1));
			j++;
		}
		else {
			al.add(Integer.parseInt(arr[i]));
			j++;
		}
	}
	int sum=0;
	for(int i=0;i<al.size();i++) {
		sum+=al.get(i);
	}
	System.out.println(sum);
}
}
