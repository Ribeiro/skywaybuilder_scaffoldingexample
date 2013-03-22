package br.com.gigio.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * @generated
 */
public class TemplatePK implements Serializable {
	// TopLink has a defect where inclusion of serialVersionUID results in an exception
	//private static final long serialVersionUID = 1L;

	/**
	 * @generated
	 */
	public TemplatePK() {
	}

	/**
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
		if (!(obj instanceof TemplatePK))
			return false;
		if (obj == null)
			return false;
		TemplatePK equalCheck = (TemplatePK) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

}
