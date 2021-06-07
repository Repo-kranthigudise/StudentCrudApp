package org.aline.student.bean;

public class Student {
	private int sId;
	private String fName;
	private String lName;
	private String branch;
	private double totalMarks;
	
	public Student()
	{	
		
	}
	public Student(int sId, String fName, String lName, String branch, double totalMarks) {
		super();
		
		this.sId = sId;
		this.fName = fName;
		this.lName = lName;
		this.branch = branch;
		this.totalMarks = totalMarks;
	}
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", fName=" + fName + ", lName=" + lName + ", branch=" + branch + ", totalMarks="
				+ totalMarks + "]";
	}
	
}
