package com.cicidi.interview.homework.apple_screen;

import java.util.ArrayList;
import java.util.Arrays;
// suppose Row 1 is the coffee machine;
// The fight attendant goes to Row 1 to refill the coffee

public class FightServeTime {
	public final int move = 1;
	public final int fill = 3;
	public final int refill = 30;
	private int totalRow = 30;
	private int currentRow = 1;

	private int stopBy = 1;
	private ArrayList<Integer> serveRequired;
	private int startTime;
	private int currentTime = 0;
	private int capacity = 7;

	public void init(Integer[] array) {
		// The passenger on which rows ordered for coffee
		serveRequired = new ArrayList<Integer>(Arrays.asList(array));
		// Total row of the plane
		totalRow = 30;
		// Fight attendant current Row
		currentRow = 1;
		// when Fight attendant need to refill, set a flag where to restart
		stopBy = 1;
		// startServing time
		startTime = 0;
		// current Time
		currentTime = 0;
		// coffee Pot capacity
		capacity = 7;

	}

	public int start(int stopBy) {

		for (int i = 0; i < serveRequired.size(); i++) {

			// if (capacity > 0) {
			while (currentRow < serveRequired.get(i)) {
				move(currentRow + 1);
			}
			if (currentRow == serveRequired.get(i)) {
				fill();
			}
			if (capacity == 0 && i < serveRequired.size() - 1) {
				refill();
			}
			continue;
			// }

		}
		move(1);
		return currentTime - startTime;
	}

	public boolean check() {
		return false;
	}

	public void move(int targetRow) {
		currentTime = currentTime + Math.abs(targetRow - currentRow) * 1;
		currentRow = targetRow;
	}

	public void fill() {
		currentTime += fill;
		capacity--;
	}

	public void refill() {
		stopBy = currentRow;
		move(1);
		currentTime += refill;
		capacity = 7;
		move(stopBy + 1);

	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}
}
