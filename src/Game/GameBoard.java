package Game;

import Pieces.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import Game.GameTile.*;

public class GameBoard extends JFrame{

    private ArrayList<Object> pieceCollection;

    /**
     * Създава и визуализира GameBoard-a, задава параметри на прозореца и неговите property-та , задава стартово полужение на всички фигури
     */
    public GameBoard() {

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Yellow Pieces
        this.pieceCollection.add(new GuardPiece(0, 0));
        this.pieceCollection.add(new GuardPiece(0, 1));
        this.pieceCollection.add(new GuardPiece(0, 2));
        this.pieceCollection.add(new GuardPiece(0, 3));
        this.pieceCollection.add(new LeaderPiece(0, 4));


        // Green Pieces
        this.pieceCollection.add(new LeaderPiece(4, 0));
        this.pieceCollection.add(new GuardPiece(4, 1));
        this.pieceCollection.add(new GuardPiece(4, 2));
        this.pieceCollection.add(new GuardPiece(4, 3));
        this.pieceCollection.add(new GuardPiece(4, 4));



    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < 5 ; row++){
            for(int col = 0; col < 5; col++){

                GameTile tile = new GameTile(row , col);
                tile.render(g);

            }

        }
    }
}