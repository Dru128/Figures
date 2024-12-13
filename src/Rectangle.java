public class Rectangle extends Parallelogram{
    static Type type = Type.RECTANGLE;

    public Rectangle(int _a, int _b, String _tag){
        super(_a, _b, 90, _tag);
    }


    @java.lang.Override
    double calcS() {
        //return super.calcS(); Этот вариант тоже работает
        return a * b;
    }

    @java.lang.Override
    double calcPerimeter() {
        return super.calcPerimeter();
    }
}
