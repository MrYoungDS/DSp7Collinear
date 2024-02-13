import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import edu.princeton.cs.algs4.In;

public class FastCollinearPointsTest {
  
  FastCollinearPoints fcp;

  @BeforeEach
  public void setUp() throws Exception {
    fcp = generateFCP("input10.txt");
  }
  
  private FastCollinearPoints generateFCP(String filename) {
    In in = new In("collinear-test-files/" + filename);
    int n = in.readInt();
    Point[] points = new Point[n];
    for (int i = 0; i < n; i++) {
      int x = in.readInt();
      int y = in.readInt();
      points[i] = new Point(x, y);
    } 
    return new FastCollinearPoints(points);
  }

  @Test
  public void testNumberOfSegments() {
    fail("Not yet implemented");
  }

  @Test
  public void testSegments() {
    fail("Not yet implemented");
  }

}
