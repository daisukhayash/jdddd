package jdddd.domain.model.kojin;

import java.util.UUID;

import org.apache.commons.lang3.ArrayUtils;

import jdddd.domain.shared.AbstractEntity;
import jdddd.domain.shared.DefaultEntityIdentifier;

public class Kojin extends AbstractEntity<Kojin> {

	private AtenaBangou 宛名番号;
	private KaiseiSeq 改製ＳＥＱ;
	private SetaiBangou 世帯番号;

	public static class Builder {
		// 必須
		private final AtenaBangou 宛名番号;
		private final KaiseiSeq 改製ＳＥＱ;
		private SetaiBangou 世帯番号;

		public Builder(AtenaBangou 宛名番号, KaiseiSeq 改製ＳＥＱ) {
			this.宛名番号 = 宛名番号;
			this.改製ＳＥＱ = 改製ＳＥＱ;
		}

		public Builder 世帯番号(SetaiBangou 世帯番号) {
			this.世帯番号 = 世帯番号;
			return this;
		}

		public Kojin build() {
			return new Kojin(this);
		}
	}

	private Kojin(Builder builder) {
		super(new DefaultEntityIdentifier<Kojin>(UUID.nameUUIDFromBytes(
				ArrayUtils.addAll(builder.宛名番号.toString().getBytes(), builder.改製ＳＥＱ.toString().getBytes()))));
		this.set宛名番号(builder.宛名番号);
		this.set改製ＳＥＱ(builder.改製ＳＥＱ);
		this.set世帯番号(builder.世帯番号);
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
