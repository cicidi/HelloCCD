package com.cicidi.generic.apple_screen;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class InstanceContainer<K, V> {
	// Each Type of fruit with have a LinkedHashMap to save objectF
	private LinkedHashMap<K, V> map = new LinkedHashMap<K, V>();

	// Add Apple ,Orange,Pear,Or Fruit object
	public void add(K k, V v) {
		map.put(k, v);

	}

	// get Apple ,Orange,Pear,Or Fruit object
	public void get(K k) {
		map.get(k);
	}

	// remove Apple ,Orange,Pear,Or Fruit object
	public void remove(K k) {
		map.remove(k);
	}

	// find all object in Apple ,Orange,Pear,Or Fruit Type
	public List<V> iterator() {
		List<V> list = new ArrayList<V>();
		for (Entry<K, V> entry : map.entrySet()) {
			list.add(entry.getValue());
		}
		return list;
	}

}
