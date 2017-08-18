package jdddd.domain.model.kojin;

import jdddd.domain.model.common.GyoumuDate;
import jdddd.domain.shared.AbstractValueObject;

public class KojinMemo extends AbstractValueObject {

	private MemoType メモ区分;
	private MemoReasonType 理由区分;
	private GyoumuDate 設定年月日;
	private GyoumuDate 期限;
	private String メモ;

	public KojinMemo(MemoType メモ区分, MemoReasonType 理由区分, GyoumuDate 設定年月日, GyoumuDate 期限, String メモ) {
		this.メモ区分 = メモ区分;
		this.理由区分 = 理由区分;
		this.設定年月日 = 設定年月日;
		this.期限 = 期限;
		this.メモ = メモ;
	}

	public MemoType メモ区分() {
		return this.メモ区分;
	}

	public MemoReasonType 理由区分() {
		return this.理由区分;
	}

	public GyoumuDate 設定年月日() {
		return this.設定年月日;
	}

	public GyoumuDate 期限() {
		return this.期限;
	}

	public String メモ() {
		return this.メモ;
	}

}
