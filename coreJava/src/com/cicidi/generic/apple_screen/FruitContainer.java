package com.cicidi.generic.apple_screen;

import java.util.List;

//Container for mix of fruit
public class FruitContainer {

	InstanceContainer<Integer, Fruit> fruitContainer = new InstanceContainer<Integer, Fruit>();
	InstanceContainer<Integer, Apple> appleContainer = new InstanceContainer<Integer, Apple>();
	InstanceContainer<Integer, Orange> orangeContainer = new InstanceContainer<Integer, Orange>();
	InstanceContainer<Integer, Pear> pearContainer = new InstanceContainer<Integer, Pear>();

	// add fruit to mixed fruit container
	public <K, V> void add(Fruit fruit) {
		int id;
		fruitContainer.add(fruit.getId(), fruit);
		if (fruit instanceof Apple) {
			id = ((Apple) fruit).getId();
			appleContainer.add(id, (Apple) fruit);
		}
		if (fruit instanceof Pear) {
			id = ((Pear) fruit).getId();
			pearContainer.add(id, (Pear) fruit);
		}
		if (fruit instanceof Orange) {
			id = ((Orange) fruit).getId();
			orangeContainer.add(id, (Orange) fruit);
		}
	}

	// remove a fruit from mixed fruit container
	public void remove(Fruit fruit) {
		fruitContainer.remove(fruit.getId());
		if (fruit instanceof Apple) {

			appleContainer.remove(((Apple) fruit).getId());
		}
		if (fruit instanceof Pear) {

			pearContainer.remove(((Pear) fruit).getId());
		}
		if (fruit instanceof Orange) {

			orangeContainer.remove(((Apple) fruit).getId());
		}

	}

	// find all fruit from mixed fruit container
	@SuppressWarnings("unchecked")
	public <K, V> List<V> findAll(FruitType type) {
		switch (type) {
		case Fruit: {
			return (List<V>) fruitContainer.iterator();
		}
		case Apple: {
			return (List<V>) appleContainer.iterator();
		}
		case Pear: {
			return (List<V>) pearContainer.iterator();
		}
		case Orange: {
			return (List<V>) orangeContainer.iterator();
		}
		}
		return null;
	}

}
