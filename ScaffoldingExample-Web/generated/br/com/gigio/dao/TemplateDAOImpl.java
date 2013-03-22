package br.com.gigio.dao;

import br.com.gigio.domain.Template;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.execution.dao.AbstractJpaDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Scope;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @generated
 */
@Scope("singleton")
@Repository("TemplateDAO")
@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
public class TemplateDAOImpl extends AbstractJpaDao implements TemplateDAO {

	/**
	 * @generated
	 */
	private static transient Logger logger = LoggerFactory.getLogger(TemplateDAOImpl.class);

	/**
	 * @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Template.class }));

	/**
	 * @generated
	 */
	@PersistenceContext(unitName = "LocalhostMySQL")
	private EntityManager entityManager;

	/**
	 * @generated
	 */
	public TemplateDAOImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Transactional(readOnly = true)
	public Logger getLogger() {
		return logger;
	}

	/**
	 * @generated
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @generated
	 */
	@Transactional(readOnly = true)
	public Set<Class<?>> getDataTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findAllTemplates
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindAllTemplates.query]JPASelect
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findAllTemplates() throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		return findAllTemplates(-1, -1);
	}

	/**
	 * JPQL Query - findAllTemplates
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindAllTemplates.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findAllTemplates(int startResult, int maxRows) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		Query query = createNamedQuery("FindAllTemplates", startResult, maxRows);
		return new LinkedHashSet<Template>(query.getResultList());
	}

	/**
	 * JPQL Count Query - findAllTemplates
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindAllTemplates.query]JPACount
	 */
	@Transactional(readOnly = true)
	public long findAllTemplatesCount() throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		return (Long) executeQueryByNameSingleResult("FindAllTemplatesCount");
	}

	/**
	 * JPQL Query - findTemplateByDescription
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescription.query]JPASelect
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByDescription(String description) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		return findTemplateByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findTemplateByDescription
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescription.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		Query query = createNamedQuery("FindTemplateByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Template>(query.getResultList());
	}

	/**
	 * JPQL Count Query - findTemplateByDescription
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescription.query]JPACount
	 */
	@Transactional(readOnly = true)
	public long findTemplateByDescriptionCount(String description) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		return (Long) executeQueryByNameSingleResult("FindTemplateByDescriptionCount", description);
	}

	/**
	 * JPQL Query - findTemplateByDescriptionContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescriptionContaining.query]JPASelect
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByDescriptionContaining(String description) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		return findTemplateByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findTemplateByDescriptionContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescriptionContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		Query query = createNamedQuery("FindTemplateByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Template>(query.getResultList());
	}

	/**
	 * JPQL Count Query - findTemplateByDescriptionContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByDescriptionContaining.query]JPACount
	 */
	@Transactional(readOnly = true)
	public long findTemplateByDescriptionContainingCount(String description) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		return (Long) executeQueryByNameSingleResult("FindTemplateByDescriptionContainingCount", description);
	}

	/**
	 * JPQL Query - findTemplateById
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateById.query]JPASelect
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateById(Integer id) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		return findTemplateById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTemplateById
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateById.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateById(Integer id, int startResult, int maxRows) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		Query query = createNamedQuery("FindTemplateById", startResult, maxRows, id);
		return new LinkedHashSet<Template>(query.getResultList());
	}

	/**
	 * JPQL Count Query - findTemplateById
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateById.query]JPACount
	 */
	@Transactional(readOnly = true)
	public long findTemplateByIdCount(Integer id) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		return (Long) executeQueryByNameSingleResult("FindTemplateByIdCount", id);
	}

	/**
	 * JPQL Query - findTemplateByName
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByName.query]JPASelect
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByName(String name) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		return findTemplateByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findTemplateByName
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByName.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByName(String name, int startResult, int maxRows) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		Query query = createNamedQuery("FindTemplateByName", startResult, maxRows, name);
		return new LinkedHashSet<Template>(query.getResultList());
	}

	/**
	 * JPQL Count Query - findTemplateByName
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByName.query]JPACount
	 */
	@Transactional(readOnly = true)
	public long findTemplateByNameCount(String name) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		return (Long) executeQueryByNameSingleResult("FindTemplateByNameCount", name);
	}

	/**
	 * JPQL Query - findTemplateByNameContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByNameContaining.query]JPASelect
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByNameContaining(String name) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		return findTemplateByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findTemplateByNameContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByNameContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Set<Template> findTemplateByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		Query query = createNamedQuery("FindTemplateByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Template>(query.getResultList());
	}

	/**
	 * JPQL Count Query - findTemplateByNameContaining
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByNameContaining.query]JPACount
	 */
	@Transactional(readOnly = true)
	public long findTemplateByNameContainingCount(String name) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		return (Long) executeQueryByNameSingleResult("FindTemplateByNameContainingCount", name);
	}

	/**
	 * JPQL Query - findTemplateByPrimaryKey
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByPrimaryKey.query]JPASelect
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Template findTemplateByPrimaryKey(Integer id) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code

		return findTemplateByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTemplateByPrimaryKey
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Template findTemplateByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		try {
			return executeQueryByNameSingleResult("FindTemplateByPrimaryKey", id);
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Count Query - findTemplateByPrimaryKey
	 * 
	 * @ModelReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/dao/TemplateDAO/FindTemplateByPrimaryKey.query]JPACount
	 */
	@Transactional(readOnly = true)
	public long findTemplateByPrimaryKeyCount(Integer id) throws DataAccessException {
		// begin-user-code
		// WARNING: You MUST keep the outside comments of this block {begin-user-code, end-user-code}in place 
		// 		for EMF models to merge appropriately.
		// TODO - Hand code method implementation here, or design an Action in the model
		// end-user-code
		return (Long) executeQueryByNameSingleResult("FindTemplateByPrimaryKeyCount", id);
	}

}
