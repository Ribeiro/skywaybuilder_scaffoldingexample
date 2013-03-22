package br.com.gigio.domain;

import java.io.Serializable;

import java.lang.StringBuilder;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.*;

/**
 * 
 * @ModelCoreReference [platform:/resource/ScaffoldingExample/models/br/com/gigio/domain/Template.datatype]
 * @generated
 */

@IdClass(br.com.gigio.domain.TemplatePK.class)
@Entity
@NamedQueries( {
		@NamedQuery(name = "FindTemplateByDescriptionContaining", query = "select myTemplate from Template myTemplate where myTemplate.description like ?1"),
		@NamedQuery(name = "FindTemplateByDescriptionContainingCount", query = "select count(myTemplate.id) from Template myTemplate where myTemplate.description like ?1"),
		@NamedQuery(name = "FindAllTemplates", query = "select myTemplate from Template myTemplate"),
		@NamedQuery(name = "FindAllTemplatesCount", query = "select count(myTemplate.id) from Template myTemplate"),
		@NamedQuery(name = "FindTemplateByNameContaining", query = "select myTemplate from Template myTemplate where myTemplate.name like ?1"),
		@NamedQuery(name = "FindTemplateByNameContainingCount", query = "select count(myTemplate.id) from Template myTemplate where myTemplate.name like ?1"),
		@NamedQuery(name = "FindTemplateByDescription", query = "select myTemplate from Template myTemplate where myTemplate.description = ?1"),
		@NamedQuery(name = "FindTemplateByDescriptionCount", query = "select count(myTemplate.id) from Template myTemplate where myTemplate.description = ?1"),
		@NamedQuery(name = "FindTemplateById", query = "select myTemplate from Template myTemplate where myTemplate.id = ?1"),
		@NamedQuery(name = "FindTemplateByIdCount", query = "select count(myTemplate.id) from Template myTemplate where myTemplate.id = ?1"),
		@NamedQuery(name = "FindTemplateByPrimaryKey", query = "select myTemplate from Template myTemplate where myTemplate.id = ?1"),
		@NamedQuery(name = "FindTemplateByPrimaryKeyCount", query = "select count(myTemplate.id) from Template myTemplate where myTemplate.id = ?1"),
		@NamedQuery(name = "FindTemplateByName", query = "select myTemplate from Template myTemplate where myTemplate.name = ?1"),
		@NamedQuery(name = "FindTemplateByNameCount", query = "select count(myTemplate.id) from Template myTemplate where myTemplate.name = ?1") })
@Table(name = "Template")
public class Template implements Serializable {
	// TopLink has a defect where inclusion of serialVersionUID results in an exception
	//private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @generated
	 */

	@Column(name = "id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	private Integer id;
	/**
	 * 
	 * @generated
	 */

	@Column(name = "name")
	@Basic(fetch = FetchType.EAGER)
	private String name;
	/**
	 * 
	 * @generated
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	private String description;

	/**
	 * @generated  
	 */
	public Template() {
	}

	/**
	 *  
	 * @generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *  
	 * @generated
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 *  
	 * @generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *  
	 * @generated
	 */
	public String getName() {
		return this.name;
	}

	/**
	 *  
	 * @generated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 *  
	 * @generated
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @generated  
	 */
	public void copy(Template that) {
		setId(that.getId());
		setName(that.getName());
		setDescription(that.getDescription());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @generated  
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");

		return buffer.toString();
	}

	/**
	 * @generated  
	 *
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Template))
			return false;
		if (obj == null)
			return false;
		Template equalCheck = (Template) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

}
