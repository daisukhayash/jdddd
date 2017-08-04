package jdddd.domain.model.kojin;

import java.util.UUID;

import org.apache.commons.lang3.ArrayUtils;

import jdddd.domain.shared.AbstractEntity;
import jdddd.domain.shared.DefaultEntityIdentifier;

public class Kojin extends AbstractEntity<Kojin> {

	private AtenaBangou 宛名番号;
	private KaiseiSeq 改製ＳＥＱ;
	private SetaiBangou 世帯番号;
	private JuuminKubun 住民区分;
	private Simei 氏名;

	public static class Builder {
		// 必須
		private final AtenaBangou 宛名番号;
		private final KaiseiSeq 改製ＳＥＱ;
		private SetaiBangou 世帯番号;
		private JuuminKubun 住民区分;
		private Simei 氏名;

		public Builder(AtenaBangou 宛名番号, KaiseiSeq 改製ＳＥＱ) {
			this.宛名番号 = 宛名番号;
			this.改製ＳＥＱ = 改製ＳＥＱ;
		}

		public Builder 世帯番号(SetaiBangou 世帯番号) {
			this.世帯番号 = 世帯番号;
			return this;
		}

		public Builder 住民区分(JuuminKubun 住民区分) {
			this.住民区分 = 住民区分;
			return this;
		}

		public Builder 氏名(Simei 氏名) {
			this.氏名 = 氏名;
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
		this.set住民区分(builder.住民区分);
		this.set氏名(builder.氏名);

	}

	@Override
	public Kojin clone() throws CloneNotSupportedException {
		Kojin c = (Kojin) super.clone();
		// 参照型のフィールドは各々コピーすること
		return c;
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

	public void set住民区分(JuuminKubun 住民区分) {
		this.住民区分 = 住民区分;
	}

	public JuuminKubun 住民区分() {
		return this.住民区分;
	}

	public void set氏名(Simei 氏名) {
		this.氏名 = 氏名;
	}

	public Simei 氏名() {
		return this.氏名;
	}

}
