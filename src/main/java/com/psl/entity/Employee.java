package com.psl.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp")//bean id

public class Employee {
	@Value(value="1")
private int id;
	
	@Value(value="abhi")
private String name;
	
	@Autowired
private Adress addr;


public Employee(){
	System.out.println("In default constructor of employee");
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee(int id, String name, Adress addr) {
	//super();
	this.id = id;
	this.name = name;
	this.addr = addr;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
}
public void abc()
{
System.out.println("init abc");	
}
public void pqr()
{
System.out.println("destroy pqr");	
}
public Adress getAddr() {
	return addr;
}
public void setAddr(Adress addr) {
	this.addr = addr;
}

}
