package com.example.leonardo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.leonardo.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();

	public Person create(Person person) {
		return person;
	}
	
	public void delete(String id) {
		
	}
	
	public Person update(Person person) {
		return person;
	}

	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Sid");
		person.setLastName("Agr");
		person.setAddress("221B Baker Street");
		person.setGender("Male");
		return person;
	}

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();

		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("221B Baker Street");
		person.setGender("Male");
		return person;
	}

}
