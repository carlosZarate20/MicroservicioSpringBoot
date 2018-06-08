package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
