package com.persons.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.persons.model.PersonInformation;
import com.persons.service.PersonInformationService;

@Controller
public class PersonsController {
	@Autowired
	private PersonInformationService personInformationService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		List<PersonInformation> personInformation = personInformationService.getPersonInformationList( );
		model.addAttribute("personInformation", personInformation);
	
		return "index";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String editTeamPage(Model model,@PathVariable("id") Integer id) {
		PersonInformation persons = personInformationService.getPerson(id);
		model.addAttribute("persons", persons);
		return  "edit";
	}
 
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String edditingMusteri(@PathVariable int id, PersonInformation prs) {
	 	PersonInformation persons = personInformationService.getPerson(id);
	 	persons.setName(prs.getName());
	 	persons.setAge(prs.getAge());
	 	persons.setHobby(prs.getHobby());
		personInformationService.updatePerson(persons);
		return "redirect:/index/";
	} 
	
	@RequestMapping(value = "/personDelete/{id}", method = RequestMethod.GET)
	public String deleteAjandaNotlar(@PathVariable("id") Integer id) {
		PersonInformation persons=personInformationService.getPerson(id);
		personInformationService.deletePerson(persons);
		return "redirect:/index/";
	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String indet(Model model) {
		model.addAttribute("personInformation", new PersonInformation());
		return "add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addMusteriNot(HttpServletRequest request, @ModelAttribute("PersonInformation") PersonInformation newPerson, BindingResult result) {
		PersonInformation persons = new PersonInformation();
		persons.setId(newPerson.getId());
		persons.setName(newPerson.getName());
		persons.setAge(newPerson.getAge());
		persons.setHobby(newPerson.getHobby());
		personInformationService.save(persons);
		return "redirect:/index";
	}
	
	 
}

 