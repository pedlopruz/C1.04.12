
package acme.roles;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;

public class Auditor extends AbstractRole {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			firm;

	@NotBlank
	@Length(max = 25)
	protected String			profesionalID;

	@NotBlank
	@Length(max = 100)
	protected String			certifications;

	@URL
	protected String			link;

}
