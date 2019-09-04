package chapter1;

import static java.lang.System.out;

/**
 * Вычисляет значения периметра и площади прямоугольного треугольника с катетами,
 * переданными в программу в виде вещественных чисел из командной строки.
 *
 * @author Александр Цупко (alexander.tsupko@outlook.com)
 * @since 4 сентября 2019
 * @version 1.0
 */
public class Task27 {
  public static void main(String[] args) {
    // Считываем данные из командной строки
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    // Вычисляем требуемые значения
    out.println("Периметр прямоугольного треугольника с катетами " + a + " и " + b + " равен: " + perimeter(a, b));
    out.println("Площадь прямоугольного треугольника с катетами " + a + " и " + b + " равна: " + area(a, b));
  }

  private static double perimeter(double a, double b) {
    return a + b + hypotenuse(a, b); // сумма сторон треугольника
  }

  private static double hypotenuse(double a, double b) {
    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // гипотенуза по теореме Пифагора
  }

  private static double area(double a, double b) {
    return a * b / 2; // площадь равна половине произведения катетов
  }
}
