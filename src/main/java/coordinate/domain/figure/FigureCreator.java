package coordinate.domain.figure;

import java.util.List;

import coordinate.domain.Point;

public interface FigureCreator {
	Figure create(List<Point> points);
}
