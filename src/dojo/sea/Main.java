package dojo.sea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	Map<Integer,Integer> cache = new HashMap<Integer, Integer>(); 
	
	public int lenghtOf(int i) {
		int n = i;
		if (cache.containsKey(i)){
			return cache.get(i);
		}
		int value = 1;
		while (i != 1) {
			if (i % 2 != 0) {
				i = i * 3 + 1;
			} else {
				i /= 2;
			}
			if (cache.containsKey(i)){
				value = cache.get(i)+value;
				cache.put(n, value);
				return value;
			}
			value++;
		}
		cache.put(n, value);
		return value;
	}

	public int maxBetween(int first, int last) {
		// if the range is inverted, switch order
		if(first+1 > last){
			int temp = first;
			first = last;
			last = temp;
		}
		int max = lenghtOf(first);
		for (int i = first+1; i <= last; i++) {
			int value = lenghtOf(i);
			if (value > max){
				max = value;
			}
		}
		return max;
	}

	public static void main(String[] args){
		Main resolver = new Main();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
			System.out.println(""+i+" "+j+" "+resolver.maxBetween(i, j));				
		}
		
	}
	
}
