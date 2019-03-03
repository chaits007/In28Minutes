package com.chaitanya.mockito;

public class SomeBusinessImpl {

	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		this.dataService = dataService;
	}

	int findGreatest() {
		int[] data = dataService.retreiveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int num : data) {
			if (num > greatest) {
				greatest = num;
			}
		}

		return greatest;
	}
}