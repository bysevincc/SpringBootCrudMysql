package com.persons.service;

 

import java.util.List;

import com.persons.model.PersonInformation;

public interface PersonInformationService {
	  PersonInformation getPerson(Integer id);
	  public void save(PersonInformation person);
	  List<PersonInformation> getPersonInformationList();
	  void updatePerson(PersonInformation person);
	  void deletePerson(PersonInformation person);
}
