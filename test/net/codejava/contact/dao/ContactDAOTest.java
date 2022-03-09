package net.codejava.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao ;
	@BeforeEach
	void setupBeforeEach() {
		
		 dataSource = new DriverManagerDataSource();
		    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		    dataSource.setUrl("jdbc:mysql://localhost:3306/database1");
		    dataSource.setUsername("root");
		    dataSource.setPassword("Ravi@1998");
		    
		    dao = new ContactDAOImpl(dataSource);
	}

	@Test
	void testSave() {
   
    Contact contact = new Contact("Steve jobs","steve@apple.com","Cupertino,CA","87837287382");
    
    int result = dao.save(contact);
    assertTrue(result>0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(2,"Bill jobs","bill@apple.com","Cupertino,CA","8783724552");
       int result = dao.update(contact);
	    assertTrue(result>0);
	}

	@Test
	void testGet() {
	Integer id =1;
	Contact contact = dao.get(id);
	if(contact!=null) {
		System.out.println(contact);
	}
	assertNotNull(contact);
	}

	@Test
	void testDelete() {
	Integer id = 3;
	int result = dao.delete(id);


	assertTrue(result >0);
	
	}
	
	@Test
	void testList() {

    List<Contact> listContacts = dao.list();
  
    for(Contact c:listContacts) {
    	
    System.out.println(c);	
    }
    
    assertTrue(!listContacts.isEmpty());
	}

}
