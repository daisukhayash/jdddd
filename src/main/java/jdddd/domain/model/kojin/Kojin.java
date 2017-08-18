package jdddd.domain.model.kojin;

import java.util.ArrayList;
import java.util.List;
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
	private Seibetu 性別;
	private Tudukigara 続柄;

	private List<KojinMemo> 個人メモ;

	public static class Builder {
		// 必須
		private final AtenaBangou 宛名番号;
		private final KaiseiSeq 改製ＳＥＱ;
		private SetaiBangou 世帯番号;
		private JuuminKubun 住民区分;
		private Simei 氏名;
		private Seibetu 性別;
		private Tudukigara 続柄;

		private List<KojinMemo> 個人メモ = new ArrayList<>();

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

		public Builder 性別(Seibetu 性別) {
			this.性別 = 性別;
			return this;
		}

		public Builder 続柄(Tudukigara 続柄) {
			this.続柄 = 続柄;
			return this;
		}

		public Builder 個人メモ(KojinMemo... kojinMemos) {
			for (KojinMemo kojinMemo : kojinMemos) {
				this.個人メモ.add(kojinMemo);
			}
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
		this.set性別(builder.性別);
		this.set続柄(builder.続柄);

		this.set個人メモ(builder.個人メモ);
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

	public void set性別(Seibetu 性別) {
		this.性別 = 性別;
	}

	public Seibetu 性別() {
		return this.性別;
	}

	public void set続柄(Tudukigara 続柄) {
		this.続柄 = 続柄;
	}

	public Tudukigara 続柄() {
		return this.続柄;
	}

	public void set個人メモ(List<KojinMemo> 個人メモ) {
		this.個人メモ = 個人メモ;
	}

	public void add個人メモ(KojinMemo 個人メモ) {
		this.個人メモ.add(個人メモ);
	}

	public void add個人メモ(int index, KojinMemo 個人メモ) {
		this.個人メモ.add(index, 個人メモ);
	}

	public List<KojinMemo> 個人メモ() {
		return this.個人メモ;
	}

}
