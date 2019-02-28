package com.persons.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persons.dao.PersonInformationDao;
import com.persons.model.PersonInformation;

@Service
@Transactional
public class PersonInformationServiceImpl implements PersonInformationService {

	@Autowired
	private PersonInformationDao personsDao;

	@Override
	public void save(PersonInformation person) {
		personsDao.save(person);
	}

	@Override
	public List<PersonInformation> getPersonInformationList() {
		return personsDao.getPersonInformationList();
	}

	@Override
	public PersonInformation getPerson(Integer id) {
		return personsDao.getPerson(id);
	}

	@Override
	public void updatePerson(PersonInformation person) {
		personsDao.updatePerson(person);
	}

	@Override
	public void deletePerson(PersonInformation person) {
		personsDao.deletePerson(person);
	}
}
