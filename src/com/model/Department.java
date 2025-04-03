package com.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department implements Iterator<Set<String>> {
	
@Id
private int did;
private String dname;

@OneToMany(cascade = CascadeType.ALL)

private Set<Employee> e=new HashSet<>();

public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Set<Employee> getE() {
	return e;
}
public void setE(Set<Employee> e) {
	this.e = e;
}
@Override
public boolean hasNext() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Set<String> next() {
	// TODO Auto-generated method stub
	return null;
}	
}

