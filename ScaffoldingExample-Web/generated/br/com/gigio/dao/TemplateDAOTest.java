package br.com.gigio.dao;

import br.com.gigio.domain.Template;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

/**
 * Class used to test the basic Data Store Functionality
 *
 * @generated
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners( {
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-domain-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-domain-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-dao-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-dao-context.xml" })
public class TemplateDAOTest {
	/**
	 * @generated
	 */
	private TemplateDAO dataStore;

	/**
	 * Instantiates a new TemplateDAOJDBCTest.
	 * @generated
	 */
	public TemplateDAOTest() {
	}

	/**
	 * Method to test Template domain object.
	 *
	 * @generated
	 */
	@Rollback(false)
	@Test
	public void Template() {
		Template instance = new Template();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * @generated
	 */
	@Autowired
	public void setDataStore(TemplateDAO dataStore) {
		this.dataStore = dataStore;
	}
}
