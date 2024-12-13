public abstract class Figure {
    enum Type { ANOTHER, SQUARE, RHOMBUS, RECTANGLE, ELLIPSE, CIRCLE, PARALLELOGRAM;
        public String toString() {
            return this.name();
        }
    }

    static Type type = Type.ANOTHER;
    public String tag = "";
   //static String name = getClass().getSimpleName();
    public Figure(String _tag){
        this.tag = _tag;
    }

    abstract double calcS();
    abstract double calcPerimeter();

    static double degreeToRadian(double degree)
    {
        return degree / 180 * Math.PI;
    }
}
