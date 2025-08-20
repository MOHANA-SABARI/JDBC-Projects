package com.oranium.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.oranium.beans.Student;
import com.oranium.resources.JavaConfig;
import com.oranium.resources.StudentRowMapper;

public class App {
  public static void main(String[] args) {
	  ApplicationContext con= new AnnotationConfigApplicationContext(JavaConfig.class);
	  NamedParameterJdbcTemplate jd = (NamedParameterJdbcTemplate) con.getBean("myJdbcTemplate");
	  
	  Map<String, Object> x = new HashMap<>();
	  
	  x.put("rollnum", 4);
	  x.put("age", 21);x.put("name","Mohan");x.put("vers",10);
//	  
//	  String iquery = "insert into spring values (:rollnum,:age,:name,:vers);";
//	  
//	  int count = jd.update(iquery, x);
//	  if(count>0) {
//		  System.out.println("Insertion Succesfull...");
//	  }
	  
//	  String dquery = "delete from spring where rollnum=:rollnum";
//	  
//	  int del = jd.update(dquery, x);
//	  
//	  if(del>0) {
//		  System.out.println("Deletion Successfull");
//	  }else {
//		  System.out.println("Failed");
//	  }
	  
//	  String uquery = "update spring set name=:name where age =:age";
//	  
//	  int up = jd.update(uquery, x);
//	  
//	  if(up>0) {
//		  System.out.println("Update Success");
//	  }
	  
	  String quer= "select * from spring";
	List<Student> qu = jd.query(quer,new StudentRowMapper());
	  
	  for(Student s : qu) {
		  System.out.println("Rollnum          age             Name            version");
		  System.out.println(s.getRollnum() +"               "+ s.getAge()+"               "+s.getName()+"               "+s.getVers() );
		  System.out.println("----------------------------------------------------------------------");
	  }
  }
}
