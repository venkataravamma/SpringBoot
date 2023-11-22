package com.example.demo.exceptions;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.model.UserEntity;

@RestController
//@RequestMapping("/")
public class RESTfulController {
	@Autowired
	UserEntity entity;
	
	ArrayList<Integer> arr;
	
	public RESTfulController() {
		arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(9);
		arr.add(11);
	}
	
	@RequestMapping("/")
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping("/html")
	public String home() {
		String str = "<html><body><font color=\"green\">"
	                    + "<h1>WELCOME To SpringBoot</h1>"
	                    + "</font></body></html>";
	              return str;
		
	}
	
	@RequestMapping(method= {RequestMethod.GET},value = {"/gfg"})
	public String info() {
		String str2
        = "<html><body><font color=\"green\">"
          + "<h2>SpringBoot is a java framwork. "
          + " It is used to develope single page web application "
          + " and it provide production ready future."
          + "</h2></font></body></html>";
    return str2;
	}
	@GetMapping("/data")
	public UserEntity getEntity() {
		return entity;
	}
	
	@GetMapping("/get")
	 void getBody(@RequestBody Person ob) {
		System.out.println(ob);
	}
	
	@PutMapping("/update/{id}")
	void change(@PathVariable int id) {
		System.out.println(arr);
		arr.remove(id);
		arr.add(id,47);
	   System.out.println(arr);
	}
	

}
