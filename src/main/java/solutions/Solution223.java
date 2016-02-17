package solutions;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 *
 * @see <a href="https://leetcode.com/problems/rectangle-area/">223. Rectangle Area</a>
 */
public class Solution223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (areRectanglesOverlapped(A, B, C, D, E, F, G, H) || areRectanglesOverlapped(E, F, G, H, A, B, C, D)) {
            return areaOfOverlappedRectangles(A, B, C, D, E, F, G, H);
        } else {
            return areaOfNonOverlappedRectangles(A, B, C, D, E, F, G, H);
        }
    }

    private boolean areRectanglesOverlapped(int A, int B, int C, int D, int E, int F, int G, int H) {
        return A >= E && A < G && B >= F && B < H ||
                A >= E && A < G && C > F && C <= H ||
                C > E && C <= G && D > F && D <= H ||
                C > E && C <= G && B >= F && B < H ||
                doesHorizontalLineIntersectRectangle(A, C, B, E, F, G, H) ||
                doesHorizontalLineIntersectRectangle(A, C, D, E, F, G, H) ||
                doesHorizontalLineIntersectRectangle(E, G, H, A, B, C, D) ||
                doesHorizontalLineIntersectRectangle(E, G, F, A, B, C, D);
    }

    private boolean doesHorizontalLineIntersectRectangle(int lX1, int lX2, int lY,
                                                         int rX1, int rY1, int rX2, int rY2) {
        boolean lineVerticallyWithinRectangle = lY >= rY1 && lY <= rY2;
        boolean lineCrossesLeftEdge = lX1 <= rX1 && lX2 >= rX1;
        boolean lineCrossesRightEdge = lX1 <= rX2 && lX2 >= rX2;

        return lineVerticallyWithinRectangle && (lineCrossesLeftEdge || lineCrossesRightEdge);
    }

    private int areaOfOverlappedRectangles(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = 0;
        int xMin = Math.min(A, E);
        int xMax = Math.max(C, G);
        int yMin = Math.min(B, F);
        int yMax = Math.max(D, H);

        for (int x = xMin; x < xMax; x++) {
            for (int y = yMin; y < yMax; y++) {
                int area1 = isPointInsideRectangle(x, y, A, B, C, D) ? 1 : 0;
                int area2 = isPointInsideRectangle(x, y, E, F, G, H) ? 1 : 0;
                area += area1 == 1 || area2 == 1 ? 1 : 0;
            }
        }

        return area;
    }

    private int areaOfNonOverlappedRectangles(int A, int B, int C, int D, int E, int F, int G, int H) {
        return (C - A) * (D - B) + (G - E) * (H - F);
    }

    private boolean isPointInsideRectangle(int x, int y, int a, int b, int c, int d) {
        return (x >= a && x < c && y >= b && y < d);
    }
}
