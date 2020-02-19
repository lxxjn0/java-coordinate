package coordinate.domain;

import java.util.Objects;

public class Point {
	private final CoordinateNumber x;
	private final CoordinateNumber y;

	private Point(CoordinateNumber x, CoordinateNumber y) {
		this.x = x;
		this.y = y;
	}

	private static int square(int number) {
		return number * number;
	}

	public static Point of(int x, int y) {
		return new Point(CoordinateNumber.valueOf(x), CoordinateNumber.valueOf(y));
	}

	public static Point ofCommaSeparator(String text) {
		String[] values = text.split(",");
		return new Point(CoordinateNumber.valueOf(Integer.parseInt(values[0])),
			CoordinateNumber.valueOf(Integer.parseInt(values[1])));
	}

	public double getDistance(Point other) {
		int xDifference = other.minusX(x);
		int yDifference = other.minusY(y);
		return Math.sqrt(square(xDifference) + square(yDifference));
	}

	private int minusX(CoordinateNumber number) {
		return this.x.minus(number);
	}

	private int minusY(CoordinateNumber number) {
		return this.y.minus(number);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Point point = (Point)o;
		return x == point.x &&
			y == point.y;
	}

	@Override
	public int hashCode() {

		return Objects.hash(x, y);
	}
}
