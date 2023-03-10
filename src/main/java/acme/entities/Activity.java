
package acme.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Activity extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			_abstract;

	@Temporal(TemporalType.DATE)
	@NotNull
	@FutureOrPresent
	protected Date				inicialPeriod;

	@Temporal(TemporalType.DATE)
	@NotNull
	@FutureOrPresent
	protected Date				finalPeriod;

	@NotNull
	@Enumerated(EnumType.STRING)
	protected Nature			nature;

	@URL
	protected String			link;

}
