package hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LaptopsCount {

	public LaptopsCount() {
		// TODO Auto-generated constructor stub
	}

	public static int getMaxCost(List<Integer> cost, List<String> labels, int dailyCount) {
		
		// using queue for time complexity of O(n)
		Queue<Integer> queCost = new LinkedList<>();
		Queue<String> queLabels = new LinkedList<>();

		Queue<Integer> m = new LinkedList<>();

		for (int i = 0; i < cost.size(); i++)
			queCost.add(cost.get(i));

		for (int i = 0; i < labels.size(); i++)
			queLabels.add(labels.get(i));

		// check the cost
		int day = 0;
		int currCost = 0;
		int maxCost = 0;
		while (!queCost.isEmpty() && !queLabels.isEmpty()) {
			int c = queCost.remove();
			String l = queLabels.remove();

			if (day < dailyCount) {
				currCost += c;
				if (l.equals("legal"))
					day++;
			}

			if (day == dailyCount) {
				maxCost = Math.max(currCost, maxCost);
				day = 0;
				currCost = 0;
			}

		}

		return maxCost;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> cost = Arrays.asList(3, 2, 0, 2, 4, 0, 1, 4);
		List<String> labels = Arrays.asList("legal", "illegal", "legal", "legal", "illegal", "legal", "legal", "legal");

		int dailyCount = 4;

		System.out.println("Max Cost: " + LaptopsCount.getMaxCost(cost, labels, dailyCount));

	}

}
