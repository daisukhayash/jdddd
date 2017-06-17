package jdddd.domain.model.common;

import java.time.DateTimeException;
import java.time.chrono.JapaneseEra;
import java.util.Arrays;

public class MyJapaneseEra {

	static final int ERA_OFFSET = -1;
	
	public static final MyJapaneseEra MEIJI = new MyJapaneseEra(1, "M");
	public static final MyJapaneseEra TAISHO = new MyJapaneseEra(2, "T");
	public static final MyJapaneseEra SHOWA = new MyJapaneseEra(3, "S");
	public static final MyJapaneseEra HEISEI = new MyJapaneseEra(4, "H");
	private static final MyJapaneseEra[] KNOWN_ERAS;
	static {
		KNOWN_ERAS = new MyJapaneseEra[JapaneseEra.values().length];
		KNOWN_ERAS[0] = MEIJI;
		KNOWN_ERAS[1] = TAISHO;
		KNOWN_ERAS[2] = SHOWA;
		KNOWN_ERAS[3] = HEISEI;
	}

	private final transient int eraNumber;
	private final transient String eraAlphabet;
	
	private MyJapaneseEra(int eraNum, String eraAlphabet) {
		this.eraNumber = eraNum;
		this.eraAlphabet = eraAlphabet;
	}
	
    public static MyJapaneseEra of(int myJapaneseEra) {
        if (myJapaneseEra < MEIJI.eraNumber || ordinal(myJapaneseEra) >= KNOWN_ERAS.length) {
            throw new DateTimeException("Invalid era: " + myJapaneseEra);
        }
        return KNOWN_ERAS[ordinal(myJapaneseEra)];
    }

	public static MyJapaneseEra from(JapaneseEra japaneseEra) {
		return of(japaneseEra.getValue() + 2);
	}

	public JapaneseEra toJapaneseEra() {
		return JapaneseEra.of(this.eraNumber - 2);
	}

	public static MyJapaneseEra[] values() {
        return Arrays.copyOf(KNOWN_ERAS, KNOWN_ERAS.length);
    }

	public int getNumericValue() {
		return this.eraNumber;
	}
	
	public String getAlphabeticalValue() {
		return this.eraAlphabet;
	}
	
	private static int ordinal(int eraNum) {
		return eraNum + ERA_OFFSET;
	}
}
