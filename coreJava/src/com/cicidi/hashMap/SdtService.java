package com.cicidi.hashMap;

import java.util.HashMap;

import com.cicidi.context.Student;

public class SdtService {

	private HashMap<Student, String> map = new HashMap<Student, String>();

	public HashMap<Student, String> getSdtMap() {
		return map;
	}

	public void setSdtMap(HashMap<Student, String> sdtMap) {
		this.map = sdtMap;
	}

	public void add(Student sdt) {
		map.put(sdt, sdt.getAddress());
	}

	public String get(Student sdt) {
		return map.get(sdt);
	}
}
