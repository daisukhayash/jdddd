package jdddd.infrastructure.persistence.jpa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * The primary key class for the "kojin" database table.
 * 
 */
@Embeddable
public class KojinEntityPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String 宛名番号;

	private String 改製ＳＥＱ;

	public KojinEntityPK() {
	}

	public String get宛名番号() {
		return this.宛名番号;
	}

	public void set宛名番号(String 宛名番号) {
		this.宛名番号 = 宛名番号;
	}

	public String get改製ＳＥＱ() {
		return this.改製ＳＥＱ;
	}

	public void set改製ＳＥＱ(String 改製ＳＥＱ) {
		this.改製ＳＥＱ = 改製ＳＥＱ;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof KojinEntityPK)) {
			return false;
		}
		KojinEntityPK castOther = (KojinEntityPK) other;
		return this.宛名番号.equals(castOther.宛名番号) && this.改製ＳＥＱ.equals(castOther.改製ＳＥＱ);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.宛名番号.hashCode();
		hash = hash * prime + this.改製ＳＥＱ.hashCode();

		return hash;
	}
}