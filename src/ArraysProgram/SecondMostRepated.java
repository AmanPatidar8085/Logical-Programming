package ArraysProgram;
import java.util.*;

 public class SecondMostRepated{
    public static void main(String[] args) {

        int arr[]={20,10,30,20,40,10,10,20,30};

        int maxfreq=0, secmax=0;
        int fmax=0, secondmax=0;

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){

            if(entry.getValue() > maxfreq){

                secmax = maxfreq;
                secondmax = fmax;

                maxfreq = entry.getValue();
                fmax = entry.getKey();
            }

            else if(entry.getValue() > secmax && entry.getKey()!=fmax){

                secmax = entry.getValue();
                secondmax = entry.getKey();
            }
        }

        System.out.println(fmax);
        System.out.println(secondmax);
    }
}