public class Main {
    public static void main(String[] args) {


        //Задача 1
        int[] cel = new int[3];
        cel[0] = 1;
        cel[1] = 2;
        cel[2] = 3;

        double[] drob = {1.57, 7.654, 9.986};

        int[] carSpeed = {123, 220, 60, 88};

        //Задача 2
        for (int i = 0; i < 3; i++) {
            System.out.print(cel[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < drob.length; i++) {
            System.out.print(drob[i] + ", ");

        }
        System.out.println();
        for (int i = 0; i < carSpeed.length; i++) {
            System.out.print(carSpeed[i] + ", ");

        }

        //Задача 3
        System.out.println();
        for (int i = 2; i > -1; i = i - 1) {
            System.out.print(cel[i] + ", ");
        }

        System.out.println();
        for (int i = 2; i > -1; i = i - 1) {
            System.out.print(drob[i] + ", ");
        }
        System.out.println();
        for (int i = 3; i > -1; i = i - 1) {
            System.out.print(carSpeed[i] + ", ");
        }

        //Задача 4
        System.out.println();
        for (int i = 0; i < cel.length; i++) {
            if (cel[i] % 2 == 0) {
                System.out.print(cel[i] + ", ");
            } else {
                cel[i] = cel[i] + 1;
                System.out.print(cel[i] + ", ");
            }

        }
    }
}
