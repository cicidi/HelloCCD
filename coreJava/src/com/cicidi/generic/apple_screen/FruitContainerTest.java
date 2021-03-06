package com.cicidi.generic.apple_screen;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*CODING 1

 Problem Statement:
 Implement a generic fruit container class that takes in three different types of fruits; 
 apples, oranges and pears. When asked for, it will return to me all fruits I've given the 
 container in order of when I placed the fruit in the container. I'm also able to ask for 
 only apples, pears or oranges also in order. When asked for the fruit, the fruit should be 
 removed from the container. Please make sure to define the apples, pears and oranges classes.
 Write suitable set of unit tests for the above.

 */
public class FruitContainerTest {
	static FruitContainer fruitConatiner;
	static Apple app1;
	static Apple app2;
	static Orange org1;
	static Orange org2;

	static Pear pear1;
	static Pear pear2;
	static Pear pear3;

	@Test
	public void testAdd() {
		// Apple is added in ascending order
		fruitConatiner.add(app1);
		fruitConatiner.add(app2);
		// Orange is added in ascending order
		fruitConatiner.add(org1);
		fruitConatiner.add(org2);
		// Pear is added in Descending order
		fruitConatiner.add(pear3);
		fruitConatiner.add(pear2);
		fruitConatiner.add(pear1);

		List<Pear> applelist = fruitConatiner.findAll(FruitType.Apple);
		List<Pear> pearlist = fruitConatiner.findAll(FruitType.Pear);
		List<Pear> orangelist = fruitConatiner.findAll(FruitType.Orange);
		List<Pear> fruitlist = fruitConatiner.findAll(FruitType.Fruit);
		Assert.assertEquals(applelist.size(), 2);
		Assert.assertEquals(pearlist.size(), 3);
		Assert.assertEquals(orangelist.size(), 2);
		Assert.assertEquals(fruitlist.size(), 7);

	}

	@Test
	public void testRemove() {
		// Apple is added in ascending order
		fruitConatiner.add(app1);
		fruitConatiner.add(app2);
		// Orange is added in ascending order
		fruitConatiner.add(org1);
		fruitConatiner.add(org2);
		// Pear is added in Descending order
		fruitConatiner.add(pear3);
		fruitConatiner.add(pear2);
		fruitConatiner.add(pear1);
		// remove pear2
		fruitConatiner.remove(pear2);
		List<Pear> applelist = fruitConatiner.findAll(FruitType.Apple);
		List<Pear> pearlist = fruitConatiner.findAll(FruitType.Pear);
		List<Pear> orangelist = fruitConatiner.findAll(FruitType.Orange);
		List<Pear> fruitlist = fruitConatiner.findAll(FruitType.Fruit);

		Assert.assertEquals(applelist.size(), 2);
		// pear size is 2
		Assert.assertEquals(pearlist.size(), 2);
		Assert.assertEquals(orangelist.size(), 2);
		// total fruit is 6
		Assert.assertEquals(fruitlist.size(), 6);
	}

	@Test
	public void testSequenceOrder() {
		// Apple is added in ascending order
		fruitConatiner.add(app1);
		fruitConatiner.add(org1);
		fruitConatiner.add(pear3);

		fruitConatiner.add(app2);
		// Orange is added in ascending order
		fruitConatiner.add(org2);
		// Pear is added in Descending order

		fruitConatiner.add(pear2);
		fruitConatiner.add(pear1);

		List<Apple> applelist = fruitConatiner.findAll(FruitType.Apple);
		List<Pear> pearlist = fruitConatiner.findAll(FruitType.Pear);
		List<Orange> orangelist = fruitConatiner.findAll(FruitType.Orange);
		List<Fruit> fruitlist = fruitConatiner.findAll(FruitType.Fruit);

		Assert.assertEquals(applelist.get(0).getId(), app1.getId());
		Assert.assertEquals(applelist.get(1).getId(), app2.getId());
		Assert.assertEquals(orangelist.get(0).getId(), org1.getId());
		Assert.assertEquals(orangelist.get(1).getId(), org2.getId());
		Assert.assertEquals(pearlist.get(0).getId(), pear3.getId());
		Assert.assertEquals(pearlist.get(1).getId(), pear2.getId());
		Assert.assertEquals(pearlist.get(2).getId(), pear1.getId());
		Assert.assertEquals(fruitlist.get(0).getId(), app1.getId());
		Assert.assertEquals(fruitlist.get(1).getId(), org1.getId());
		Assert.assertEquals(fruitlist.get(2).getId(), pear3.getId());
		Assert.assertEquals(fruitlist.get(3).getId(), app2.getId());
		Assert.assertEquals(fruitlist.get(4).getId(), org2.getId());
		Assert.assertEquals(fruitlist.get(5).getId(), pear2.getId());
		Assert.assertEquals(fruitlist.get(6).getId(), pear1.getId());
	}

	@BeforeClass
	public static void initFruit() {

		app1 = new Apple(001, "app1");
		app2 = new Apple(002, "app2");

		org1 = new Orange(101, "org1");
		org2 = new Orange(102, "org2");

		pear1 = new Pear(201, "pear1");
		pear2 = new Pear(202, "pear2");
		pear3 = new Pear(203, "pear3");

	}

	@Before
	public void init() {
		fruitConatiner = new FruitContainer();
	}

}
