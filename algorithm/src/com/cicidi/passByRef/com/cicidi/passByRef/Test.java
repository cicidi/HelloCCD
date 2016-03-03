package com.cicidi.passByRef;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("walter");
		// e.setName("chen_2");
		someFunction(e);
		System.out.println(e);
		System.out.println(e.getName());

	}
/*这道面试题主要是看对与java　pass　ref　的掌握
 * 当someFunction的e　去new　了一个新的object　的时候他的指向变到了新的ref　　但是新的ref　不会在原来main　method　发生改变
 * 可以看到兩個　print　e　的　object　id　是不一樣的
 * */
	public static void someFunction(Employee e) {
//		e = new Employee("Chen");
		System.out.println(e);
		// e.setName("chen");
		// System.out.println(e.getName());
	}

	public static class Employee {
		private String name;

		public Employee(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
