package br.com.gigio.service;

import br.com.gigio.dao.TemplateDAO;

import br.com.gigio.domain.Template;

import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @ModelCoreReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/.properties.srv]
 * @generated
 */
@Scope("session")
@Service("TemplateService")
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
public class TemplateServiceImpl implements TemplateService {

	/**
	 * The SLF4J logging class.
	 * @generated
	 */
	private transient Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * Variable used for access to DAO - TemplateDAO
	 * @generated
	 */
	@Resource(name = "TemplateDAO")
	protected TemplateDAO templateDAO;

	/**
	 * Default constructor.
	 * @generated
	 */
	public TemplateServiceImpl() {
	}

	/**
	 * Execute 
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/DeleteTemplate/.properties.swoperation]
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void deleteTemplate(Template template) throws java.lang.Exception {

		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/DeleteTemplate/deleteTemplateAction.action]
		templateDAO.remove(template);
		templateDAO.flush();

	}

	/**
	 * Execute 
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/LoadTemplates/.properties.swoperation]
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> loadTemplates() throws java.lang.Exception {
		Set<Template> templates = null;
		int maxResults;
		Set<Template> queryResult;
		int startResult;
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/LoadTemplates/loadTemplateAction.action]

		queryResult = null;
		startResult = -1;
		maxResults = -1;

		queryResult = templateDAO.findAllTemplates(startResult, maxResults);

		templates = queryResult;

		return templates;
	}

	/**
	 * Execute 
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/SaveTemplate/.properties.swoperation]
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void saveTemplate(Template template) throws java.lang.Exception {

		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/SaveTemplate/saveTemplateAction.action]
		template = templateDAO.store(template);
		templateDAO.flush();

	}

	/**
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}
}
