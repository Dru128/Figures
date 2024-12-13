public class Rhombus  extends Parallelogram{
    static Type type = Type.RHOMBUS;

    public Rhombus(int _a, double _alpha, String _tag) {
        super(_a, _a, _alpha, _tag);
    }

    @java.lang.Override
    double calcS() {
        //return super.calcS();
        return a*a * Math.sin(alpha);
    }
    static double calcS(int _a, int _alpha) {
        return _a*_a * Math.sin(degreeToRadian(_alpha));
    }

    @java.lang.Override
    double calcPerimeter() {
        //return super.calcPerimeter();
        return 4*a;
    }
}
