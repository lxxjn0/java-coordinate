package coordinate.utils;

import java.util.ArrayList;
import java.util.List;

import coordinate.domain.Point;

public class PointParser {
	public static List<Point> parse(String inputValue) {
		String[] splitBar = inputValue.split("-");
		List<Point> points = new ArrayList<>();
		for (String value : splitBar) {
			points.add(Point.ofCommaSeparator(escapeBrace(value)));
		}
		return points;
	}

	private static String escapeBrace(String value) {
		return value.substring(1, value.length() - 1);
	}
}
