
package acme.entities;

import java.util.Date;

import javax.persistence.Entity;
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
public class PracticumSessions extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstracts;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@FutureOrPresent
	protected Date				inicialPeriod;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@FutureOrPresent
	protected Date				finalPeriod;

	@URL
	protected String			link;

}