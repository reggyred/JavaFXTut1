package ch.makery.address.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of people. This is used for saving the
 * list of people to XML.
 * @author preddig
 *
 */
@XmlRootElement(name = "person")
public class PersonListWrapper {
	
	private List<Person> persons;
	
	@XmlElement(name = "person")
	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
}
