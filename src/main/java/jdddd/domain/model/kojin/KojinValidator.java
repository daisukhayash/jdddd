package jdddd.domain.model.kojin;

import jdddd.domain.shared.DefaultValidationRule;
import jdddd.domain.shared.EntityValidatorBase;

public class KojinValidator extends EntityValidatorBase<Kojin> {

	public KojinValidator() {
		addValidation("日本人の氏名有無", new DefaultValidationRule<>(KojinSpecification.日本人の氏名有無, "日本人の氏名に誤りがあります", "Simei"));
		addValidation("外国人の氏名有無", new DefaultValidationRule<>(KojinSpecification.外国人の氏名有無, "外国人の氏名に誤りがあります", "Simei"));
		addValidation("性別と続柄の関連",
				new DefaultValidationRule<>(KojinSpecification.性別と続柄の関連, "性別と続柄の関連に誤りがあります", "Tudukigara"));
	}
}
