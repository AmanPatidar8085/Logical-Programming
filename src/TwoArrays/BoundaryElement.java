package TwoArrays;

public class BoundaryElement {
    public static void main(String[] args) {

        int a[][] = {
            {10,20,30,40},
            {50,60,70,80},
            {90,100,110,130}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){

                if(i==0 || j==0 || i==a.length-1 || j==a[0].length-1){
                    System.out.printf("%4d", a[i][j]); // fixed width
                }
                else{
                    System.out.printf("%4s", " "); // space
                }
            }
            System.out.println();
        }
    }
}