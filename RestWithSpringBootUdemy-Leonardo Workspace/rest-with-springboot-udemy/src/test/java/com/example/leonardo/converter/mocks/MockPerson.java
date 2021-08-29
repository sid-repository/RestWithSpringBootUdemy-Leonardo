package com.example.leonardo.converter.mocks;

import java.util.ArrayList;
import java.util.List;

import com.example.leonardo.data.model.Person;
import com.example.leonardo.data.valueObject.PersonVO;

public class MockPerson {

	public Person mockEntity() {
		return mockEntity(0);
	}

	public PersonVO mockVO() {
		return mockVO(0);
	}

	public List<Person> mockEntityList() {
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			persons.add(mockEntity(i));
		}
		return persons;
	}

	public List<PersonVO> mockVOList() {
		List<PersonVO> persons = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			persons.add(mockVO(i));
		}
		return persons;
	}

	private Person mockEntity(Integer i) {
		Person person = new Person();
		person.setAddress("Address Test" + i);
		person.setFirstName("First Name Test" + i);
		person.setGender((i % 2 == 0) ? "Male" : "Female");
		person.setId(i.longValue());
		person.setLastName("Last Name Test" + i);
		return person;
	}
	
	private PersonVO mockVO(Integer i) {
		PersonVO person = new PersonVO();
		person.setAddress("Address Test" + i);
		person.setFirstName("First Name Test" + i);
		person.setGender((i % 2 == 0) ? "Male" : "Female");
		person.setId(i.longValue());
		person.setLastName("Last Name Test" + i);
		return person;
	}

}
