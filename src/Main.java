import java.util.EnumSet;

public class Main {
    public static void main(String[] args) throws Throwable {
        java.util.Scanner in = new java.util.Scanner(System.in);

            while (true) {
                System.out.println("Choose figure type:");
                for (Figure.Type type : EnumSet.allOf(Figure.Type.class))
                    System.out.println("* " + type);

                try {
                    int a, b, alpha;
                    Figure figure = null;
                    String inputType = in.next();
                    switch (Figure.Type.valueOf(inputType)) {
                        case SQUARE:
                            System.out.println("Введите ширину квадрата: ");
                            a = in.nextInt();
                            figure = new Square(a, "");
                            ;
                            break;
                        case RHOMBUS:
                            System.out.println("Введите длину стороны ромба: ");
                            a = in.nextInt();
                            System.out.println("Введите малый угол: ");
                            alpha = in.nextInt();
                            figure = new Rhombus(a, alpha, "");

                            ;
                            break;
                        case RECTANGLE:
                            System.out.println("Введите длину прямоугольника: ");
                            a = in.nextInt();
                            System.out.println("Введите ширину прямоугольника: ");
                            b = in.nextInt();
                            figure = new Rectangle(a, b, "");
                            ;
                            break;
                        case ELLIPSE:
                            System.out.println("Введите первый коэффицент элипса: ");
                            a = in.nextInt();
                            System.out.println("Введите второй коэффицент элипса: ");
                            b = in.nextInt();
                            figure = new Ellipse(a, b, "");
                            ;
                            break;
                        case CIRCLE:
                            System.out.println("Введите радиус окружности: ");
                            a = in.nextInt();
                            figure = new Circle(a, "");
                            ;
                            break;
                        case PARALLELOGRAM:
                            System.out.println("Введите длину параллелограма: ");
                            a = in.nextInt();
                            System.out.println("Введите ширину параллелограма: ");
                            b = in.nextInt();
                            System.out.println("Введите малый угол: ");
                            alpha = in.nextInt();
                            figure = new Parallelogram(a, b, alpha, "");

                            ;
                            break;
                        /*case ANOTHER:
                            // специально допустил ошибку чтобы в этом ветвлении
                            // выбросило NullPointerException!
                            break;*/
                    }
                    if (figure != null) {
                        double perimeter = figure.calcPerimeter();
                        if (perimeter > 0)
                            System.out.println("Периметр = " + perimeter);
                        else
                            throw new Exception("Периметр не может быть < 0!");

                        double s = figure.calcS();
                        if (s > 0)
                            System.out.println("Площадь = " + s);
                        else
                            throw new Exception("Площадь не может быть < 0!");
                    } else
                        throw new Exception("Фигура не инициализирована!");
                } catch (NullPointerException e) {
                    System.out.println("null pointer exception:" + e.getMessage());
                } catch (RuntimeException e) {
                    System.out.println("another exception:" + e.getMessage());
                }
            }
    }
}