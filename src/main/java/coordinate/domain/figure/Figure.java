package coordinate.domain.figure;

import java.util.List;

import coordinate.domain.Point;

public interface Figure {
	List<Point> getPoints();

	int size();

	String getName();

	double area();
}
