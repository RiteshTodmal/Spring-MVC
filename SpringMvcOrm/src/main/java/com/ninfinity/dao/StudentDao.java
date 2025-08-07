package com.ninfinity.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.ninfinity.beans.Student;



@Repository
public class StudentDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	public int saveStudent(Student student) {
		int save = (Integer) this.hibernateTemplate.save(student);
		return save;
	}
	

}
