import java.lang.Math;                                                            //класс Math для работы с математическими ф-ми

public class lab1 {
    public static void main(String[] args) {
        short[] s = new short[16 - 4 + 1];                                        //одномерный массив s типа short
        float[] x = new float[11];                                                //одномерный массив x типа float
        double[][] c = new double[s.length][x.length];                            //двумерный массив c типа double

        byte indexI = 0;                                                          //переменная для индекса первого порядка
        for (byte elForS = 16; elForS > 3; elForS--){                             //цикл для заполнения массива s числами от 16 до 4 включительно
            s[indexI++] = elForS;
        }
        for (indexI = 0; indexI < x.length; indexI++){                            //цикл для заполнения массива x 11ю рандомными числами от -15.0 до 14.0
            x[indexI] = (float)(Math.random() * (14 - -15) + -15);                //метод random генерирует рандомное чило от 0.0 до 1.0
        }

        for (indexI = 0; indexI < c.length; indexI++){                            //вложенный цикл для заполнения массива c
            for (byte indexJ = 0; indexJ < c[indexI].length; indexJ++){
                switch(s[indexI]){                                                //оператор switch для проверки значения s[indexI]
                    case 6:
                        c[indexI][indexJ] = Math.tan(Math.pow(Math.pow(x[indexJ], (1.0 / 3.0)), (2 / Math.pow((((1.0 / 2.0) - x[indexJ]) / x[indexJ]), x[indexJ]))));
                        break;
                    case 4:
                    case 5:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                        c[indexI][indexJ] = Math.pow(Math.exp(Math.pow(x[indexJ], (2 * x[indexJ]))), (1.0 / 3.0));
                        break;
                    default:
                        c[indexI][indexJ] = Math.atan(1.0 / Math.exp(Math.pow(Math.pow(Math.tan(Math.asin(Math.sin(x[indexJ]))), 2)
                                        * (2 * Math.PI + Math.pow(Math.tan(Math.sin(Math.tan(x[indexJ]))), 2)),
                                (Math.log(Math.pow((4 + Math.pow((Math.PI / Math.abs(x[indexJ])), x[indexJ])),
                                        (Math.asin(1.0 / Math.exp(Math.abs(x[indexJ]))))))))));
                        break;
                }
            }
        }
        for (indexI = 0; indexI < c.length; indexI++) {                            //вложенный цикл для вывода массива c
            for (byte indexJ = 0; indexJ < c[indexI].length; indexJ++) {
                System.out.printf("%.3f ", c[indexI][indexJ]);                     //%.3f - форматирует в число с тремя знаками после запятой
            }
            System.out.println();
        }
    }
}
