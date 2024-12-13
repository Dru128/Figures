public class Parallelogram extends Figure{
    static Type type = Type.PARALLELOGRAM;

    final int a;
    final int b;
    final double alpha;
    public Parallelogram(int _a, int _b, double _alpha, String _tag) {
        super(_tag);
        this.a = _a;
        this.b = _b;
        this.alpha = degreeToRadian(_alpha);
    }

    @java.lang.Override
    double calcS() {
        return a * b * Math.sin(alpha);
    }

    @java.lang.Override
    double calcPerimeter() {
        return 2*(a + b);
    }
}
