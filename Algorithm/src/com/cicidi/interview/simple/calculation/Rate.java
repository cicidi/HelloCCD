package com.cicidi.interview.simple.calculation;

public class Rate {
	public final double RATE_1 = 0.25;
	public final double RATE_2 = 0.2;
	public final double RATE_3 = 0.12;
	public final int level_1 = 200000;
	public final int level_2 = 3000000;
	public double highest_in_level_1 = level_1 * RATE_1;
	public double highest_in_level_2 = highest_in_level_1 + (level_2 - level_1)
			* RATE_2;

	public int calculatePremium(int price) {
		double premium = 0;
		if (price < level_1) {
			premium = price * RATE_1;
		}
		if (price > level_1 && price < level_2) {
			premium = level_1 * RATE_1 + (price - level_1) * RATE_2;
		} else {
			premium = highest_in_level_2 + (price - level_2) * 0.12;
		}
		return (int) premium;
	}

	public int getPrice(double premium) {
		int price = 0;
		if (premium > highest_in_level_2) {
			price = (int) ((premium - highest_in_level_2) / 0.12) + 3000000;
		}
		if (premium > highest_in_level_1 && premium < highest_in_level_2) {
			price = (int) ((premium - highest_in_level_1) / 0.2) + 200000;
		} else {
			price = (int) (premium / 0.25);
		}
		return price;
	}

	public static void main(String[] args) {
		Rate rate = new Rate();
		System.out.println(rate.calculatePremium(250000));
		System.out.println(rate.getPrice(60000));
	}
}
