package io.zerotomastery.day1;

import java.util.ArrayList;

public class reportRepair {
	static int result = 0;

	public static void main(String[] args) {

		ArrayList<Integer> reportEntries = new ArrayList<>();
		ArrayList<Integer> reportFlag = new ArrayList<>();
		reportEntries.add(1721);
		//reportEntries.add(1721);
		reportEntries.add(979);
		reportEntries.add(366);
		reportEntries.add(299);
		reportEntries.add(675);
		reportEntries.add(125);
		reportEntries.add(1234);
		reportEntries.add(786);
		reportEntries.add(1456);
		//reportEntries.add(299);
		reportRepair listObject = new reportRepair();
		listObject.displayList(reportEntries);
        for (int number : reportEntries) {
	        reportFlag.add(0);
		}

		for (int index = 0; index < reportEntries.size(); index++) {
			
			listObject.findEntries(reportEntries, reportFlag, reportEntries.get(index), index);
		}
		System.out.println("--------------------------------");
		if (result > 0) {
			System.out.println("Solution: " + result);
		}

	}

	void displayList(ArrayList<Integer> value) {
		for (int num : value) {
			System.out.println(num);

		}
	}

	void findEntries(ArrayList<Integer> value, ArrayList<Integer> flag, int number, int index) {

		for (int num = 0; num < value.size(); num++) {
			if (((number + value.get(num)) == 2020) && (flag.get(num) == 0) && flag.get(index) == 0) {
				result = result + (number * value.get(num));
				modifyFlag(num, 1, flag);
				//System.out.println(number + " *  " + value.get(num) + " = " + result);
				
			}

		}

	}

// modify flag by specify position
	void modifyFlag(int position, int value, ArrayList<Integer> flag) {
		flag.set(position, value);
	}

}