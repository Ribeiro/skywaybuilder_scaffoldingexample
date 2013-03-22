package br.com.gigio.dao;

import br.com.gigio.domain.Template;

import java.util.Set;

import org.execution.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * 
 * @generated
 */
public interface TemplateDAO extends JpaDao {

	/**
	 * JPQL Query - findAllTemplates
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindAllTemplates.query]JPASelect
	 */
	public Set<Template> findAllTemplates() throws DataAccessException;

	/**
	 * JPQL Query - findAllTemplates
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindAllTemplates.query]JPASelectWithPagination
	 */
	public Set<Template> findAllTemplates(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Count Query - findAllTemplates
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindAllTemplates.query]JPASelectCount
	 */
	public long findAllTemplatesCount() throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByDescription
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescription.query]JPASelect
	 */
	public Set<Template> findTemplateByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByDescription
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescription.query]JPASelectWithPagination
	 */
	public Set<Template> findTemplateByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Count Query - findTemplateByDescription
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescription.query]JPASelectCount
	 */
	public long findTemplateByDescriptionCount(String description) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByDescriptionContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescriptionContaining.query]JPASelect
	 */
	public Set<Template> findTemplateByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByDescriptionContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescriptionContaining.query]JPASelectWithPagination
	 */
	public Set<Template> findTemplateByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Count Query - findTemplateByDescriptionContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescriptionContaining.query]JPASelectCount
	 */
	public long findTemplateByDescriptionContainingCount(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateById
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateById.query]JPASelect
	 */
	public Set<Template> findTemplateById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateById
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateById.query]JPASelectWithPagination
	 */
	public Set<Template> findTemplateById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Count Query - findTemplateById
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateById.query]JPASelectCount
	 */
	public long findTemplateByIdCount(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByName
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByName.query]JPASelect
	 */
	public Set<Template> findTemplateByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByName
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByName.query]JPASelectWithPagination
	 */
	public Set<Template> findTemplateByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Count Query - findTemplateByName
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByName.query]JPASelectCount
	 */
	public long findTemplateByNameCount(String name) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByNameContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByNameContaining.query]JPASelect
	 */
	public Set<Template> findTemplateByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByNameContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByNameContaining.query]JPASelectWithPagination
	 */
	public Set<Template> findTemplateByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Count Query - findTemplateByNameContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByNameContaining.query]JPASelectCount
	 */
	public long findTemplateByNameContainingCount(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByPrimaryKey
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByPrimaryKey.query]JPASelect
	 */
	public Template findTemplateByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTemplateByPrimaryKey
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByPrimaryKey.query]JPASelectWithPagination
	 */
	public Template findTemplateByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Count Query - findTemplateByPrimaryKey
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByPrimaryKey.query]JPASelectCount
	 */
	public long findTemplateByPrimaryKeyCount(Integer id_1) throws DataAccessException;

}