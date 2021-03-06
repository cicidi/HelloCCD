package com.cicidi.hashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import com.cicidi.context.Student;

public class SdtHashMapTest extends Runner {
	// public class SdtHashMapTest extends Runner {

	private static Student sdt1;
	private static Student sdt2;
	private SdtService sdtMap;
	private static Student sdt3;
	private static Student sdt4;

	public SdtHashMapTest() {
		super();
	}

	@Test
	public void testAdd() {
		sdtMap = new SdtService();
		sdtMap.add(sdt1);
		sdtMap.add(sdt2);
		sdtMap.add(sdt3);
		sdtMap.add(sdt4);
		assertEquals(3, sdtMap.getSdtMap().keySet().size());
		assertEquals("NY", sdtMap.getSdtMap().get(sdt1));
		assertEquals("CA", sdtMap.getSdtMap().get(sdt2));
		assertEquals("NY2", sdtMap.getSdtMap().get(sdt3));
		for (Student sdt : sdtMap.getSdtMap().keySet()) {
			Logger log = Logger.getLogger(SdtHashMapTest.class.getName());
			log.info(sdt.getName() + " " + sdt.getAge() + " "
					+ sdtMap.getSdtMap().get(sdt));

		}
		fail("Not yet implemented");
	}

	@BeforeClass
	public static void init() {
		sdt1 = new Student("Bob", 19, "NY");
		sdt2 = new Student("Mike", 55, "CA");
		sdt3 = new Student("Bob", 19, "NY");
		sdt4 = new Student("Tom", 55, "NY");

	}

	@Override
	public Description getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run(RunNotifier notifier) {
		// TODO Auto-generated method stub

	}

}
