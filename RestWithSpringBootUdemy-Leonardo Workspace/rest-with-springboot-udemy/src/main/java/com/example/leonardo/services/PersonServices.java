package com.example.leonardo.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.leonardo.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();

	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Sid");
		person.setLastName("Agr");
		person.setAddress("221B Baker Street");
		person.setGender("Male");
		return person;
	}

}
