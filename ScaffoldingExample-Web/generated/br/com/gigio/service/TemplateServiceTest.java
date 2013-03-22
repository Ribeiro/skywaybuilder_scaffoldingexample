package br.com.gigio.service;

import br.com.gigio.domain.Template;

import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 * @generated
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners( {
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-service-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-service-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-domain-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-domain-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-dao-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-dao-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-web-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-web-context.xml" })
@Transactional
public class TemplateServiceTest {

	/**
	 * The Spring application context.
	 * @generated
	 */
	private ApplicationContext context;

	/**
	 * @generated
	 */
	@Resource(name = "TemplateService")
	protected TemplateService service;

	/**
	 * Instantiates a new TemplateServiceTest.
	 * @generated
	 */
	public TemplateServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * 
	 * @generated
	 */
	@Test
	public void deleteTemplate() throws java.lang.Exception {
		// TODO: JUnit - Populate test inputs for operation: deleteTemplate 
		Template template = null;
		service.deleteTemplate(template);
	}

	/**
	 * Operation Unit Test
	 * 
	 * @generated
	 */
	@Test
	public void loadTemplates() throws java.lang.Exception {
		Set<Template> response = null;
		response = service.loadTemplates();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTemplates
	}

	/**
	 * Operation Unit Test
	 * 
	 * @generated
	 */
	@Test
	public void saveTemplate() throws java.lang.Exception {
		// TODO: JUnit - Populate test inputs for operation: saveTemplate 
		Template template_1 = null;
		service.saveTemplate(template_1);
	}

	/**
	 * Autowired to set the Spring application context.
	 * @generated
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 * @generated
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}

}
