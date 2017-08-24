package jdddd.domain.model.kojin;

import java.util.UUID;

import org.apache.commons.lang3.ArrayUtils;

import jdddd.domain.shared.DefaultEntityIdentifier;

public class KojinIdentifier extends DefaultEntityIdentifier<Kojin> {

	private AtenaBangou 宛名番号;
	private KaiseiSeq 改製ＳＥＱ;

	public KojinIdentifier(AtenaBangou 宛名番号, KaiseiSeq 改製ＳＥＱ) {
		super(UUID.nameUUIDFromBytes(ArrayUtils.addAll(宛名番号.toString().getBytes(), 改製ＳＥＱ.toString().getBytes())));
	}

	public AtenaBangou 宛名番号() {
		return this.宛名番号;
	}

	public KaiseiSeq 改製ＳＥＱ() {
		return this.改製ＳＥＱ;
	}

}
