package coordinate.domain.figure;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import coordinate.domain.Point;

public enum FigureFactory {
	Line(2, Line::new),
	Triangle(3, Triangle::new),
	Rectangle(4, Rectangle::new);

	private int pointCount;
	private Function<List<Point>, Figure> creator;

	FigureFactory(int pointCount, Function<List<Point>, Figure> creator) {
		this.pointCount = pointCount;
		this.creator = creator;
	}

	public static Figure getFigure(List<Point> points) throws InvalidFigureException {
		int pointCount = points.size();

		FigureFactory figureFactory = Arrays.stream(values())
			.filter(shape -> shape.pointCount == pointCount)
			.findFirst()
			.orElseThrow(() -> new InvalidFigureException("유효하지 않은 도형입니다."));

		return figureFactory.creator.apply(points);
	}
}
