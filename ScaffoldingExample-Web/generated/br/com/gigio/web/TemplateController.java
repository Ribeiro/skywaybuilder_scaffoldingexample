package br.com.gigio.web;

import br.com.gigio.dao.TemplateDAO;

import br.com.gigio.domain.Template;

import br.com.gigio.service.TemplateService;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Enumeration;
import java.util.Set;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.execution.databinding.CustomCalendarEditor;
import org.execution.databinding.EnhancedBooleanEditor;
import org.execution.databinding.NaNHandlingNumberEditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import org.springframework.web.servlet.ModelAndView;

/**
 * Request dispatcher for the <code>TemplateController</code> controller.
 * 
 * @ModelCoreReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/.properties.webcontroller]
 * @generated
 */
@Scope("singleton")
@Controller("TemplateController")
public class TemplateController {
	/** 
	 * Used for binding in of dates that might need conversion
	 *
	 * @generated
	 */
	private static final String BIND_PATTERN_SUFFIX = "_datebindpattern";

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
	 * Variable used for access to a Service or Controller
	 * @generated
	 */
	@Resource(name = "TemplateService")
	protected TemplateService templateService;

	/**
	 * Initialize the bindings into this controller.
	 *
	 * @generated  
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) {
		// Register static property editors.
		binder.registerCustomEditor(Calendar.class, new CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new EnhancedBooleanEditor(true));
		binder.registerCustomEditor(BigDecimal.class, new NaNHandlingNumberEditor(BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new NaNHandlingNumberEditor(Integer.class, true));

		// Register dynamic property editors for specific fields.
		@SuppressWarnings("unchecked")
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			if (key.endsWith(BIND_PATTERN_SUFFIX)) {
				String field = key.substring(0, key.indexOf(BIND_PATTERN_SUFFIX));
				String pattern = (String) request.getParameter(key);
				binder.registerCustomEditor(Calendar.class, field, new CustomCalendarEditor(pattern));
			}
		}
	}

	/**
	 * Handles a request for <code>/indexTemplate.html</code>
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/ListTemplates/.properties.swoperation]/indexTemplate.html
	 */

	@RequestMapping(value = "/indexTemplate.html")
	public ModelAndView listTemplates() throws java.lang.Exception {
		Set<Template> templates = null;

		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/ListTemplates/defaultAction.action]

		templates = templateService.loadTemplates();

		ModelAndView mav = new ModelAndView();
		mav.addObject("templates", templates);
		mav.setViewName("/WEB-INF/pages/template/listTemplates.jsp");
		return mav;
	}

	/**
	 * Handles a request for <code>/selectTemplate.html</code>
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/SelectTemplate/.properties.swoperation]/selectTemplate.html
	 */

	@RequestMapping(value = "/selectTemplate.html")
	public ModelAndView selectTemplate(@RequestParam("id") Integer id) throws java.lang.Exception {
		Template template = null;
		int maxResults;
		Template queryResult;
		int startResult;
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/SelectTemplate/defaultAction.action]

		queryResult = null;

		startResult = -1;
		maxResults = -1;

		queryResult = templateDAO.findTemplateByPrimaryKey(id, startResult, maxResults);

		template = queryResult;

		ModelAndView mav = new ModelAndView();
		mav.addObject("template", template);
		mav.setViewName("/WEB-INF/pages/template/viewTemplate.jsp");
		return mav;
	}

	/**
	 * Handles a request for <code>/editTemplate.html</code>
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/EditTemplate/.properties.swoperation]/editTemplate.html
	 */

	@RequestMapping(value = "/editTemplate.html")
	public ModelAndView editTemplate(@RequestParam("id") Integer id) throws java.lang.Exception {
		Template template = null;
		int maxResults;
		Template queryResult;
		int startResult;
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/EditTemplate/defaultAction.action]

		queryResult = null;

		startResult = -1;
		maxResults = -1;

		queryResult = templateDAO.findTemplateByPrimaryKey(id, startResult, maxResults);

		template = queryResult;

		ModelAndView mav = new ModelAndView();
		mav.addObject("template", template);
		mav.setViewName("/WEB-INF/pages/template/editTemplate.jsp");
		return mav;
	}

	/**
	 * Handles a request for <code>/saveTemplate.html</code>
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/SaveTemplate/.properties.swoperation]/saveTemplate.html
	 */

	@RequestMapping(value = "/saveTemplate.html")
	public String saveTemplate(@ModelAttribute("template") Template template) throws java.lang.Exception {

		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/SaveTemplate/defaultAction.action]

		templateService.saveTemplate(template);

		return "/indexTemplate.html";
	}

	/**
	 * Handles a request for <code>/newTemplate.html</code>
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/NewTemplate/.properties.swoperation]/newTemplate.html
	 */

	@RequestMapping(value = "/newTemplate.html")
	public ModelAndView newTemplate() throws java.lang.Exception {
		Template template = null;

		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/NewTemplate/defaultAction.action]
		template = new Template();

		ModelAndView mav = new ModelAndView();
		mav.addObject("template", template);
		mav.setViewName("/WEB-INF/pages/template/editTemplate.jsp");
		return mav;
	}

	/**
	 * Handles a request for <code>/deleteTemplate.html</code>
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/DeleteTemplate/.properties.swoperation]/deleteTemplate.html
	 */

	@RequestMapping(value = "/deleteTemplate.html")
	public String deleteTemplate(@RequestParam("id") Integer id) throws java.lang.Exception {
		Template template = null;
		int maxResults;
		Template queryResult;
		int startResult;
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		// @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/web/TemplateController/DeleteTemplate/defaultAction.action]

		queryResult = null;

		startResult = -1;
		maxResults = -1;

		queryResult = templateDAO.findTemplateByPrimaryKey(id, startResult, maxResults);

		template = queryResult;

		templateService.deleteTemplate(template);

		return "/indexTemplate.html";
	}

	/**
	 * Handles a request for <code>/pages/template/index.jsp</code>
	 * @ModelReference /pages/template/index.jsp
	 */

	@RequestMapping(value = "/pages/template/index.jsp")
	String pagestemplateindexjsp() {
		return "redirect:/indexTemplate.html";
	}

	/**
	 * Handles a request for binary content to be streamed
	 * @generated
	 */
	@RequestMapping("/TemplateController/binary.action")
	public ModelAndView streamBinary(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;
	}

	/**
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}
}