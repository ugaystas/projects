package ru.job4j.calculate;
/**
 * Вычисление площади треугольника
 */
public class Triangle {
    /**
     * поля для хранения {@code Point} треугольника
     */
    public Point a;
    public Point b;
    public Point c;

    /**
     * Создает новый обьет {@code Triangle}
     *
     * @param   a   первая {@code Point} треугольника
     * @param   b   вторая {@code Point} треугольника
     * @param   c   третья {@code Point} треугольника
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Считает площадь треугольника
     *
     * @return  площадь треугольника
     */
    public double area() {
        double abDistance = this.a.distanceTo(b);
        double bcDistance = this.b.distanceTo(c);
        double acDistance = this.a.distanceTo(c);
        double perimeter = (abDistance + bcDistance + acDistance) / 2;
        return Math.sqrt( perimeter * (perimeter - abDistance) * (perimeter - bcDistance) * (perimeter - acDistance) );
    }
}
