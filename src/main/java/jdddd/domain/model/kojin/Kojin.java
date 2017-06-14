package jdddd.domain.model.kojin;

import java.util.UUID;

import org.apache.commons.lang3.ArrayUtils;

import jdddd.domain.shared.AbstractEntity;
import jdddd.domain.shared.DefaultEntityIdentifier;

public class Kojin extends AbstractEntity<Kojin> {

	private AtenaBangou 宛名番号;
	private KaiseiSeq 改製ＳＥＱ;
	private SetaiBangou 世帯番号;
	
	public Kojin(AtenaBangou 宛名番号, KaiseiSeq 改製ＳＥＱ) {
		super(new DefaultEntityIdentifier<Kojin>(
				UUID.nameUUIDFromBytes(
						ArrayUtils.addAll(
								宛名番号.toString().getBytes(),
								改製ＳＥＱ.toString().getBytes()))));
		this.set宛名番号(宛名番号);
		this.set改製ＳＥＱ(改製ＳＥＱ);
	}

	private void set宛名番号(AtenaBangou 宛名番号) {
		this.宛名番号 = 宛名番号;
	}
	
	public AtenaBangou 宛名番号() {
		return this.宛名番号;
	}

	private void set改製ＳＥＱ(KaiseiSeq 改製ＳＥＱ) {
		this.改製ＳＥＱ = 改製ＳＥＱ;
	}	

	public KaiseiSeq 改製ＳＥＱ() {
		return this.改製ＳＥＱ;
	}

	public void set世帯番号(SetaiBangou 世帯番号) {
		this.世帯番号 = 世帯番号;
	}

	public SetaiBangou 世帯番号() {
		return this.世帯番号;
	}
}
