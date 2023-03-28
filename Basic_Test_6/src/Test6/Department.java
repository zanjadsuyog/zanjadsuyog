package Test6;

public class Department {
	private int deptId;
	private String deptName;

	public Department() {

	}

	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public String toString() {
		return "Department:" + " " + deptId + " " + deptName;
	}
}
