package coordinate.domain.figure;

import java.util.List;

import coordinate.domain.Point;

class Rectangle extends AbstractFigure {
	Rectangle(List<Point> points) {
		super(points);
	}

	@Override
	public int size() {
		return 4;
	}

	@Override
	public String getName() {
		return "사각형";
	}

	@Override
	public double area() {
		return 0;
	}
}
