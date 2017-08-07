package jdddd.domain.model.kojin;

import java.util.Arrays;
import java.util.List;

import jdddd.domain.shared.AbstractSpecification;
import jdddd.domain.shared.Specification;

public class KojinSpecification {
	public static Specification<Kojin> 日本人の氏名有無 = new AbstractSpecification<Kojin>() {

		@Override
		public boolean isSatisfiedBy(Kojin kojin) {
			if (kojin.住民区分() == JuuminKubun.日本人) {
				if (kojin.氏名().漢字氏名().isEmpty()) {
					return false;
				}
				if (!kojin.氏名().英字氏名().isEmpty()) {
					return false;
				}
				if (!kojin.氏名().通称().isEmpty()) {
					return false;
				}
			}
			return true;
		}
	};

	public static Specification<Kojin> 外国人の氏名有無 = new AbstractSpecification<Kojin>() {

		@Override
		public boolean isSatisfiedBy(Kojin kojin) {
			if (kojin.住民区分() == JuuminKubun.外国人) {
				if (kojin.氏名().英字氏名().isEmpty() && kojin.氏名().漢字氏名().isEmpty()) {
					return false;
				}
			}
			return true;
		}
	};

	public static Specification<Kojin> 性別と続柄の関連 = new AbstractSpecification<Kojin>() {

		private final List<Tudukigara> 男と不整合 = Arrays.asList(Tudukigara.妻, Tudukigara.妻_未届, Tudukigara.姉, Tudukigara.妹);
		private final List<Tudukigara> 女と不整合 = Arrays.asList(Tudukigara.夫, Tudukigara.夫_未届, Tudukigara.兄, Tudukigara.弟);

		@Override
		public boolean isSatisfiedBy(Kojin kojin) {
			switch (kojin.性別()) {
			case 男:
				if (男と不整合.contains(kojin.続柄())) {
					return false;
				}
				break;
			case 女:
				if (女と不整合.contains(kojin.続柄())) {
					return false;
				}
				break;

			default:
				break;
			}
			return true;
		}
	};

}
