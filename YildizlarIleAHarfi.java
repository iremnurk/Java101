public class YildizlarIleAHarfi {
    public static void main(String[] args) {
        String[][] yildizArr = new String[6][4];

        for (int i=0; i<yildizArr.length; i++) {
            for (int j=0; j<yildizArr[i].length; j++) {

                if (i==0 || i==3 || i==6) {
                    yildizArr [i][j] = " * ";
                }

                else if (j==0 || j==3) {
                    yildizArr [i][j] = " * ";
                }

                else {
                    yildizArr [i][j] = "   ";
                }
            }
        }

        for (String[] row : yildizArr ) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
