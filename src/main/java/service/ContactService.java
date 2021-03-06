package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ContactRepository;
import dto.Contact;
import api.ContactRequest;
import api.ContactResponse;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository dao;
	
	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}

}
