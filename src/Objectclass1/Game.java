package Objectclass1;

public class Game implements Cloneable {
	int hiscore=5000;
public static void main(String[] args)throws CloneNotSupportedException {
	
	Game orig=new Game();
	System.out.println(orig.hiscore);
	
	Game copy=(Game)orig.clone();
	System.out.println(copy.hiscore);
	
}
}
