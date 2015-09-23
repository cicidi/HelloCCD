package test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	public static void main(String [] args)
	{
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		hashSet = fillSet(hashSet);
		System.out.println(hashSet);
		treeSet = fillSet(treeSet);
		System.out.println(treeSet);
	}
	public static Set<Integer> fillSet(Set<Integer> set)
	{
		while(set.size() < 7)
		{
			set.add((int)(Math.random()*35+1));
		}
		return set;
	}
}