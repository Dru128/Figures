public class Ellipse extends Figure{
    static Type type = Type.ELLIPSE;

    final int a;
    final int b;

    public Ellipse(int _a, int _b, String _tag) {
        super(_tag);
        this.a = _a;
        this.b = _b;
    }

    @java.lang.Override
    double calcS() {
        return Math.PI * a * b;
    }

    @java.lang.Override
    double calcPerimeter() {
        double p = Math.log(2)/Math.log(Math.PI/2);
        return 4*Math.pow(Math.pow(a, p) + Math.pow(b, p), 1/p);
    }
}
