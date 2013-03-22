package br.com.gigio.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>TemplateController</code> controller.
 *
 * @see br.com.gigio.web.TemplateController
 * @generated
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-service-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-service-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-domain-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-domain-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-dao-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-dao-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-generated-web-context.xml",
		"file:/D:/DEV/Skyway%20Visual%20Perspectives%20CE/workspace/ScaffoldingExample-Web/resources/ScaffoldingExample-web-context.xml" })
public class TemplateControllerTest {
	/**
	 * The Spring application context.
	 * @generated
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexTemplatehtml()</code>.
	 * @generated
	 */
	@Test
	@SuppressWarnings("unused")
	public void indexTemplatehtml() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTemplate.html");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TemplateController controller = (TemplateController) context.getBean("TemplateController");

		// TODO Invoke method and Assert return values
	}

	/**
	 * Test <code>selectTemplatehtml()</code>.
	 * @generated
	 */
	@Test
	@SuppressWarnings("unused")
	public void selectTemplatehtml() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTemplate.html");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TemplateController controller = (TemplateController) context.getBean("TemplateController");

		// TODO Invoke method and Assert return values
	}

	/**
	 * Test <code>editTemplatehtml()</code>.
	 * @generated
	 */
	@Test
	@SuppressWarnings("unused")
	public void editTemplatehtml() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTemplate.html");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TemplateController controller = (TemplateController) context.getBean("TemplateController");

		// TODO Invoke method and Assert return values
	}

	/**
	 * Test <code>saveTemplatehtml()</code>.
	 * @generated
	 */
	@Test
	@SuppressWarnings("unused")
	public void saveTemplatehtml() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTemplate.html");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TemplateController controller = (TemplateController) context.getBean("TemplateController");

		// TODO Invoke method and Assert return values
	}

	/**
	 * Test <code>newTemplatehtml()</code>.
	 * @generated
	 */
	@Test
	@SuppressWarnings("unused")
	public void newTemplatehtml() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTemplate.html");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TemplateController controller = (TemplateController) context.getBean("TemplateController");

		// TODO Invoke method and Assert return values
	}

	/**
	 * Test <code>deleteTemplatehtml()</code>.
	 * @generated
	 */
	@Test
	@SuppressWarnings("unused")
	public void deleteTemplatehtml() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTemplate.html");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TemplateController controller = (TemplateController) context.getBean("TemplateController");

		// TODO Invoke method and Assert return values
	}

	/**
	 * Test <code>pagestemplateindexjsp()</code>.
	 * @generated
	 */
	@Test
	@SuppressWarnings("unused")
	public void pagestemplateindexjsp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/pages/template/index.jsp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TemplateController controller = (TemplateController) context.getBean("TemplateController");

		// TODO Invoke method and Assert return values
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
	 * Returns a mock HttpServletRequest object.
	 * @generated
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 * @generated
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}