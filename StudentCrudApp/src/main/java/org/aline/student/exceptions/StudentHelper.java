package org.aline.student.exceptions;

public class StudentHelper {

	private static StudentHelper stdhelper;

	public static StudentHelper getInstnace() {
		if (stdhelper == null) {
			stdhelper = new StudentHelper();
		}
		return stdhelper;
	}

}
