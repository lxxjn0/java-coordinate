package coordinate.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PointTest {
	@Test
	public void 생성() {
		Point a = Point.ofCommaSeparator("1,2");
		assertThat(a).isEqualTo(Point.of(1, 2));
	}
}
