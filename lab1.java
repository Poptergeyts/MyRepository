import java.lang.Math;                                                            //класс Math для работы с мтематическими ф-ми

public class lab1 {
    public static void main(String[] args) {
        short[] s = new short[16 - 4 + 1];                                        //одномерный массив s типа short
        float[] x = new float[11];                                                //одномерный массив x типа float
        double[][] c = new double[s.length][x.length];                            //двумерный массив c типа double

        int indxI = 0;                                                            //переменная для индекса первого порядка
        for (short elForS = 16; elForS > 3; elForS--){                            //цикл для заполнения массива s числами от 16 до 4 включительно
            s[indxI++] = elForS;
        }

        for (indxI = 0; indxI < x.length; indxI++){                               //цикл для заполнения массива x 11ю рандомными числами от -15.0 до 14.0
            x[indxI] = (float) Math.random() * (14 - -15) + -15;                  //метод random генерирует рандомное чило от 0.0 до 1.0
        }

        boolean check;                                                            //переменная-флаг для проверки нахождения элемента
        short[] checkForS = {4, 5, 8, 9, 10, 12};                                 //одномерный массив для проверки нахождения элемента
        for (indxI = 0; indxI < c.length; indxI++){                               //вложенный цикл для заполнения массива c
            for (int indxJ = 0; indxJ < c[indxI].length; indxJ++){
                check = false;

                if (s[indxI] == 6){
                    c[indxI][indxJ] = Math.tan(Math.pow(Math.pow(x[indxJ], (1.0 / 3.0)), (2 / Math.pow((((1.0 / 2.0) - x[indxJ]) / x[indxJ]), x[indxJ]))));
                }
                else {
                    for (short elCheck : checkForS) {                             //цикл для проверки нахождения элемента
                        if (elCheck == s[indxI]) {
                            check = true;
                        }
                    }

                    if (check) {
                        c[indxI][indxJ] = Math.pow(Math.exp(Math.pow(x[indxJ], (2 * x[indxJ]))), (1.0 / 3.0));
                    } else {
                        c[indxI][indxJ] = Math.atan(1.0 / Math.exp(Math.pow(Math.pow(Math.tan(Math.asin(Math.sin(x[indxJ]))), 2)
                                        * (2 * Math.PI + Math.pow(Math.tan(Math.sin(Math.tan(x[indxJ]))), 2)),
                                (Math.log(Math.pow((4 + Math.pow((Math.PI / Math.abs(x[indxJ])), x[indxJ])),
                                        (Math.asin(1.0 / Math.exp(Math.abs(x[indxJ]))))))))));
                    }
                }
            }
        }

        for (indxI = 0; indxI < c.length; indxI++) {                             //вложенный цикл для вывода массива c
            for (int indxJ = 0; indxJ < c[indxI].length; indxJ++) {
                System.out.printf("%.3f ", c[indxI][indxJ]);                     //%.3f - форматирует в число с тремя знаками после запятой
            }
            System.out.println();
        }
    }
}