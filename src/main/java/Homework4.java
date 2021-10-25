public class Homework4 {
    public static void main (String[]args) {
        initMap();
        printMap();
    }
    public static char map [][];
    public static final int SIZE = 3;
    public static char DOTE_X = 'x';
    public static char DOTE_O = 'O';
    public static char DOTE_T = '•';
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
}