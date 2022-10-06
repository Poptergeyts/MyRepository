public class Hamming {
    public static void main(String[] args){
        int s1 = 0, s2 = 0, s3 = 0;
        for (byte indexI = 0; indexI < 7; indexI++){
            switch (indexI){
                case 0:
                    s1 = Integer.parseInt(args[indexI]);
                    break;
                case 1:
                    s2 = Integer.parseInt(args[indexI]);
                    break;
                case 2:
                    s1 ^= Integer.parseInt(args[indexI]);
                    s2 ^= Integer.parseInt(args[indexI]);
                    break;
                case 3:
                    s3 = Integer.parseInt(args[indexI]);
                    break;
                case 4:
                    s1 ^= Integer.parseInt(args[indexI]);
                    s3 ^= Integer.parseInt(args[indexI]);
                    break;
                case 5:
                    s2 ^= Integer.parseInt(args[indexI]);
                    s3 ^= Integer.parseInt(args[indexI]);
                    break;
                case 6:
                    s1 ^= Integer.parseInt(args[indexI]);
                    s2 ^= Integer.parseInt(args[indexI]);
                    s3 ^= Integer.parseInt(args[indexI]);
                    break;
            }
        }

        int rez = s3 * 4 + s2 * 2 + s1;
        if (rez != 0) {
            System.out.println("Ошибка в бите номер " + rez);
            rez -= 1;
            if (Integer.parseInt(args[rez]) == 1) {
                args[rez] = "0";
            } else args[rez] = "1";
        }else System.out.println("Ошибки не было");

        System.out.println("Правильное сообщение: " + args[2] + args[4] + args[5] + args[6]);
    }
}