package dojo.sea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Resolver100 {

	public int lenghtOf(int i) {
		return do3N_1(i).size();
	}

	public List<Integer> do3N_1(int i) {
		List<Integer> inteiros = new ArrayList<Integer>();

		inteiros.add(i);

		while (i != 1) {
			if (i % 2 != 0) {
				i = i * 3 + 1;
			} else {
				i /= 2;
			}
			inteiros.add(i);
		}
		return inteiros;
	}

	public int maxBetween(int first, int last) {
		Set<Integer> lenghts = new HashSet<Integer>();
		for (int i = first; i <= last; i++) {
			lenghts.add(lenghtOf(i));
		}
		return Collections.max(lenghts);
	}

}
