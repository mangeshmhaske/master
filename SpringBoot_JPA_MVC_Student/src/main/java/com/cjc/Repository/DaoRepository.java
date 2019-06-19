package com.cjc.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cjc.Model.Student;

@org.springframework.stereotype.Repository
public interface DaoRepository extends CrudRepository<Student, Integer>
{

	public List<Student> findAllByUnameAndPassword(String uname,String Password);
}
