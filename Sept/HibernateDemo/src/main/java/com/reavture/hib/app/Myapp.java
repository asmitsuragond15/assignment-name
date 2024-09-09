package com.reavture.hib.app;
import java.util.List;

import com.revature.hib.model.*;
public class Myapp {
	
	public static void main(String[] args)
	{
		StudentDao studentDao=new StudentDao();
		Student student=new Student("Asmit,","Suragond","suragondasmit15@gmail.com");
	    studentDao.saveStudent(student);
        List < Student > students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));
	

}
}
