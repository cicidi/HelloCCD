import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeSet {
	private Set<String> employeeSet = new HashSet<String>();

	public Set<String> getEmployeeet() {
		return employeeSet;
	}

	public void setEmployeeet(Set<String> employeeSet) {
		this.employeeSet = employeeSet;
	}

}
