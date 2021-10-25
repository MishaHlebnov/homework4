public class Homework4 {
    public static void main (String[]args) {
    }
    public static char map [][];
    public static final int SIZE = 3;
    public static char DOTE_X = 'x';
    public static char DOTE_O = 'O';
    public static char DOTE_T = '.';
    public static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i =0; i < SIZE; i++) {
            for (int j = 0; j < SIZE;j++){
                map[i][j] = DOTE_T;
            }
        }
    }
}