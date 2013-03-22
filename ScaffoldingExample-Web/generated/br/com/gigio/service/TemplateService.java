package br.com.gigio.service;

import br.com.gigio.domain.Template;

import java.util.Set;

/**
 * 
 * @generated
 */
public interface TemplateService {

	/**
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/DeleteTemplate/.properties.swoperation]
	 */
	public void deleteTemplate(Template template) throws java.lang.Exception;

	/**
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/LoadTemplates/.properties.swoperation]
	 */
	public Set<Template> loadTemplates() throws java.lang.Exception;

	/**
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/service/TemplateService/SaveTemplate/.properties.swoperation]
	 */
	public void saveTemplate(Template template_1) throws java.lang.Exception;
}