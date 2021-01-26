package Pieces;



import java.awt.*;

public class LeaderPiece  {
    private int row;
    private int col;
    private String color;

    public LeaderPiece(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //Неосъществена идея
    public void render(Graphics g, String COLOR) {

        if (COLOR.equals("YELLOW")) {
            g.setColor(Color.YELLOW);
        } else {
            g.setColor(Color.GREEN);
        }
        g.fillRect(10, 10, 50, 50);
    }

}
