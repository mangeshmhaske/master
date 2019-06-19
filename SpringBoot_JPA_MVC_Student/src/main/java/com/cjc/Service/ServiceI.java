package com.cjc.Service;

import java.util.List;

import com.cjc.Model.Student;

public interface ServiceI
{

	public int saveStud(Student student);
	public List<Student> loginch(String uname,String password);
	public List<Student> loginall(String uname,String password);
	public Student editStu(int rollno);
	public List<Student> updateStu(Student student);
	public List<Student> deleteStu(int rollno);
}
