package chapterOne;

public class DiamondPrinter {
    public static void main(String[] args) {
        int blank =4;
        for (int topTriangleRow=1;topTriangleRow<10;topTriangleRow+=2){
            for (int space = 0; space < blank; space++) {
                System.out.print(" ");
            }

            for (int asterisk = 1; asterisk <=topTriangleRow ; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }

        blank=1;
        for (int bottomTriangleRow=7;bottomTriangleRow>0;bottomTriangleRow-=2){
            for (int space = 0; space < blank; space++) {
                System.out.print(" ");
            }

            for (int asterisk = bottomTriangleRow; asterisk >0 ; asterisk--) {
                System.out.print("*");
            }
            System.out.println();
            blank++;
        }

    }
}
