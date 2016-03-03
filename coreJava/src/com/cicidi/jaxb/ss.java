package com.cicidi.jaxb;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ss {

	public static void main(String[] args) throws JAXBException {
		HashMap<Integer, EmployeeSet> map = new HashMap<Integer, EmployeeSet>();
		Set<String> set = new HashSet<String>();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFirstName("Lokesh");
		emp1.setLastName("Gupta");
		emp1.setIncome(100.0);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFirstName("John");
		emp2.setLastName("Mclane");
		emp2.setIncome(200.0);

		set.add(emp1.getFirstName());
		set.add(emp2.getFirstName());
		EmployeeSet employeeSet = new EmployeeSet();
		employeeSet.setEmployeeet(set);
		map.put(emp1.getId(), employeeSet);
		// map.put(2, emp2);

		// Add employees in map
		EmployeeMap employeeMap = new EmployeeMap();
		employeeMap.setEmployeeMap(map);

		/******************** Marshalling example *****************************/

		JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeMap.class,
				EmployeeSet.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(employeeMap, System.out);
		jaxbMarshaller.marshal(employeeMap, new File(
				"/home/jianming/Downloads/employees.xml"));
	}
}
