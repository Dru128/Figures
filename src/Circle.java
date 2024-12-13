public class Circle extends Ellipse{
    static Type type = Type.CIRCLE;

    public Circle(int _r, String _tag) {
        super(_r, _r, _tag);
    }

    @java.lang.Override
    double calcS() {
        return super.calcS();
    }

    @java.lang.Override
    double calcPerimeter() {
        return 2*Math.PI*a;
    }
}
