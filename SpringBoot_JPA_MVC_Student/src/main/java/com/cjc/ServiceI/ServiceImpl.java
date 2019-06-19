package com.cjc.ServiceI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Model.Student;
import com.cjc.Repository.DaoRepository;
import com.cjc.Service.ServiceI;
@Service
public class ServiceImpl implements ServiceI
{
	@Autowired
	DaoRepository dr;

	@Override
	public int saveStud(Student student) {
		
		Student s=dr.save(student);
		return s.getRollno();
	}

	@Override
	public List<Student> loginch(String uname, String password) {
		List<Student> slist=dr.findAllByUnameAndPassword(uname, password);
		return slist;
	}

	@Override
	public List<Student> loginall(String uname, String password) {
		List<Student> slist=(List<Student>) dr.findAll();
		return slist;
	}

	@Override
	public Student editStu(int rollno) {
		Student st=dr.findById(rollno).get();
		return st;
	}

	@Override
	public List<Student> updateStu(Student student) {
		Student st=dr.save(student);
		List<Student> slist=(List<Student>) dr.findAll();
		return slist;
		
	}

	@Override
	public List<Student> deleteStu(int rollno) {
		
		System.out.println("insider service Iml");
		dr.deleteById(rollno);
		return (List<Student>) dr.findAll();
		
	}

}
