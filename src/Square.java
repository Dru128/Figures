public class Square extends Rhombus{
    static Type type = Type.SQUARE;

    public Square(int _a, String _tag) {
        super(_a, 90, _tag);
    }

    @java.lang.Override
    double calcS() {
        //return super.calcS();
        return a * a;
    }

    @java.lang.Override
    double calcPerimeter() {
        return super.calcPerimeter();
    }
}
