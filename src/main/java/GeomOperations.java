import java.util.stream.IntStream;

public class GeomOperations {
    public int[] xcoord;
    public int[] ycoord;
    public int[] others;




    public GeomOperations(int[] xs, int[] ys, int[] os) {
        xcoord = xs;
        ycoord = ys;
        others = os;
    }



    public double[] findTriangleIncenter() {
        // Formula to calculate in-center
        double x = (others[0] * xcoord[0] + others[1] * xcoord[1] + others[2] * xcoord[2] * 1.0) / IntStream.of(others).sum();
        double y = (others[0] * ycoord[0] + others[1] * ycoord[1] + others[2] * ycoord[2]) / IntStream.of(others).sum();

        System.out.println("Incenter= " + "(" + x + ", " + y + ")");

        double[] center = {x, y};
        return center;
    }




}
