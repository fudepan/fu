package com.bjsxt.service;

import com.bjsxt.pojo.Person;

public interface PersonService {
	public void add(Person person);
	public void update(Person person);
	public void deleteyById(Integer id);
	public Person select(Integer id);
}
