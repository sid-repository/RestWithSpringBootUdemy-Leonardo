package com.example.leonardo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leonardo.exception.ResourceNotFoundException;
import com.example.leonardo.model.Person;
import com.example.leonardo.repository.PersonRepository;

@Service
public class PersonServices {

	@Autowired
	PersonRepository repository;

	public Person create(Person person) {
		repository.save(person);
		return person;
	}

	public void delete(Long id) {
		Person entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
	}

	public Person update(Person person) {

		Person entity = repository.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());

		return repository.save(entity);
	}

	public Person findById(Long id) {

		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
	}

	public List<Person> findAll() {
		return repository.findAll();
	}

}
