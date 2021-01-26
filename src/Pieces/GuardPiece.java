package Pieces;
import java.awt.*;
import javax.swing.*;

public class GuardPiece {

    private int row;
    private int col;
    private String color;
    // Idea that I can't figure out how to do
    protected enum COLOR{YELLOW, GREEN}


    public GuardPiece(int row, int col){
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
        g.fillOval(0, 0, 50, 50);
    }

}