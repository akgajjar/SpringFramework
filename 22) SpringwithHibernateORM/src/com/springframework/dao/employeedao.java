package com.springframework.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.employee;

public class employeedao   {

	HibernateTemplate template;

	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	//method to save employee  
	public void saveEmployee(employee e){  
	    template.save(e);  
	}  
	//method to update employee  
	public void updateEmployee(employee e){  
	    template.update(e);  
	}  
	//method to delete employee  
	public void deleteEmployee(employee e){  
	    template.delete(e);  
	}  
	//method to return one employee of given id  
	public employee getById(int id){  
	    employee e=(employee)template.get(employee.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<employee> getEmployees(){  
	    List<employee> list=new ArrayList<employee>();  
	    list=template.loadAll(employee.class);  
	    return list;  
	}  
}
