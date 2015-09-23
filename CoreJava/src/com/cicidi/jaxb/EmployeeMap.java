package com.cicidi.jaxb;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeMap {

	private Map<Integer, EmployeeSet> employeeMap = new HashMap<Integer, EmployeeSet>();

	public Map<Integer, EmployeeSet> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<Integer, EmployeeSet> employeeMap) {
		this.employeeMap = employeeMap;
	}
}
