package SlidingWindow;

import java.util.HashMap;

public class fruitIntoBasket {
public static void main(String[] args) {
	int arr[]= {1,2,3,2,2};
	int k=2;
	int l=0;
	int r=0;
	int maxlen=Integer.MIN_VALUE;
	HashMap<Integer,Integer>map=new HashMap<>();
	while(r<arr.length) {
		map.put(arr[r], map.getOrDefault(arr[r],0)+1);
		if(map.size()>k) {
			map.put(arr[l],map.get(arr[l])-1);
			
			if(map.get(arr[l])==0) {
				map.remove(arr[l]);
			}
			l++;
		}
		if(map.size()<=k) {
			maxlen=Math.max(maxlen, r-l+1);
		}
		r++;
	}
	System.out.println(maxlen);
}


}
