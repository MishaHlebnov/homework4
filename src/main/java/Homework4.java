import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main (String[]args) {
        initMap();
        printMap();
        while (true) {
            human();
            printMap();
            if (win(DOTE_X)) {
                System.out.println("Вы победили восстание машин");
                break;
            }
            if (fifty_fifty()) {
                System.out.println("СРАЖАЙСЯ ЛУЧШЕ");
                break;
            }
            nanoMachine();
            printMap();
            if (win(DOTE_O)) {
                System.out.println("ГДЕ САРА КОНОР");
                break;
            }
            if (fifty_fifty()) {
                System.out.println("СРАЖАЙСЯ ЛУЧШЕ");
                break;
            }
        }
        System.out.println("Это была великая битва");
    }
    public static char map [][];
    public static final int SIZE = 3;
    public static char DOTE_X = 'x';
    public static char DOTE_O = 'O';
    public static char DOTE_T = '•';

    public static boolean win (char znak) {
        if(map[0][0] == znak && map[0][1] == znak && map[0][2] == znak) return true;
        if(map[1][0] == znak && map[1][1] == znak && map[1][2] == znak) return true;
        if(map[2][0] == znak && map[2][1] == znak && map[2][2] == znak) return true;
        if(map[0][0] == znak && map[1][0] == znak && map[2][0] == znak) return true;
        if(map[0][1] == znak && map[1][1] == znak && map[2][1] == znak) return true;
        if(map[0][2] == znak && map[1][2] == znak && map[2][2] == znak) return true;
        if(map[0][0] == znak && map[1][1] == znak && map[2][2] == znak) return true;
        if(map[2][0] == znak && map[1][1] == znak && map[0][2] == znak) return true;
        return false;
    }

    public static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i =0; i < SIZE; i++) {
            for (int j = 0; j < SIZE;j++){
                map[i][j] = DOTE_T;
            }
        }
    } public static void printMap () {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static Scanner scanner = new Scanner(System.in);

    public static boolean fifty_fifty () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map [i][j] = DOTE_T;
                return false;
            }
        }
        return true;
    }
    public static void human () {
        int x,y;
        do {
            System.out.println(" Введите координаты ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!chekMethod(x,y));
        map [x][y] = DOTE_X;
    }
    public static Random random = new Random();
    public static void nanoMachine() {
        int x,y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3) ;
        } while (!chekMethod(x,y));
        map [x][y] = DOTE_O;
    }
    public static boolean chekMethod (int x,int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map [y][x] == DOTE_T) return true;
        return false;
    }
}