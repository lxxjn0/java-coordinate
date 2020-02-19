package coordinate.domain;

import java.util.HashMap;
import java.util.Map;

import coordinate.InvalidPointException;

public class CoordinateNumber {
	public static final int LOWER_BOUND = 0;
	public static final int UPPER_BOUND = 24;
	private static final Map<Integer, CoordinateNumber> cache = new HashMap<>();

	private final int coordinateNumber;

	static {
		for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
			cache.put(i, new CoordinateNumber(i));
		}
	}

	private CoordinateNumber(int coordinateNumber) {
		if (coordinateNumber < LOWER_BOUND || coordinateNumber > UPPER_BOUND) {
			throw new InvalidPointException("유효하지 않은 좌표입니다.");
		}
		this.coordinateNumber = coordinateNumber;
	}

	public static CoordinateNumber valueOf(int coordinateNumber) {
		if (coordinateNumber >= LOWER_BOUND && coordinateNumber <= UPPER_BOUND) {
			return cache.get(coordinateNumber);
		}
		return new CoordinateNumber(coordinateNumber);
	}

	public int minus(CoordinateNumber minusNumber) {
		return this.coordinateNumber - minusNumber.coordinateNumber;
	}
}
