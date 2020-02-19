package coordinate;

import java.util.List;

import coordinate.domain.Point;
import coordinate.domain.figure.FigureFactory;
import coordinate.utils.PointParser;
import coordinate.view.InputView;

public class CoordinateApplication {
	public static void main(String[] args) {
		List<Point> points = getParsedPoints();
		getPointsFigure(points);
	}

	private static void getPointsFigure(List<Point> points) {
		try {
			FigureFactory.getFigure(points);
		} catch (InvalidFigureException ife) {
			System.out.println(ife.getMessage());
			getPointsFigure(points);
		}
	}

	private static List<Point> getParsedPoints() {
		try {
			return PointParser.parse(InputView.getPoint());
		} catch (InvalidPointException ipe) {
			System.out.println(ipe.getMessage());
			return getParsedPoints();
		}
	}
}
