package jdddd.infrastructure.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "kojin" database table.
 * 
 */
@Embeddable
public class KojinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String 宛名番号;

	private String 改製ｓｅｑ;

	public KojinPK() {
	}
	public String get宛名番号() {
		return this.宛名番号;
	}
	public void set宛名番号(String 宛名番号) {
		this.宛名番号 = 宛名番号;
	}
	public String get改製ｓｅｑ() {
		return this.改製ｓｅｑ;
	}
	public void set改製ｓｅｑ(String 改製ｓｅｑ) {
		this.改製ｓｅｑ = 改製ｓｅｑ;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof KojinPK)) {
			return false;
		}
		KojinPK castOther = (KojinPK)other;
		return 
			this.宛名番号.equals(castOther.宛名番号)
			&& this.改製ｓｅｑ.equals(castOther.改製ｓｅｑ);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.宛名番号.hashCode();
		hash = hash * prime + this.改製ｓｅｑ.hashCode();
		
		return hash;
	}
}