package Game;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Random;




public class GameTile extends JFrame{

    private int row;
    private int col;
    private int tileSize;
    private int tileSizeFill;


    //set-ва property-та на всеки tile
    public GameTile(int row, int col) {

        this.row        = row;
        this.col        = col;
        this.tileSize   = 100;
        this.tileSizeFill = 100;

    }
    /**
     * Показване на готовият board, оцветяване на предварително създадените полета...тъжен опит за направата на border
     */


    public void render(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        int tileXFill =  this.col * this.tileSizeFill;
        int tileYFill =  this.row * this.tileSizeFill;

        //custom colors
        Color darkOrange  = new Color(255,69,0);
        Color Gray  =       new Color(192,192,192);
        Color darkGray =    new Color(64,64,64);
        Color darkGreen =   new Color(	3, 125, 80);

        /*
         * Задава цвят на всеки tile спрямо кординатите му върху board-a
         * */

        //Orange tiles

        if((this.row == 0 && this.col == 0) ||
                (this.row == 0 && this.col == 4) ||
                (this.row == 4 && this.col == 1) ||
                (this.row == 4 && this.col == 3)) {


            g.setColor(darkOrange);
            g.fillRect(tileX,tileY,this.tileSize, this.tileSize);

            g.setColor(Color.black);
            g.drawRect(tileX, tileY, this.tileSizeFill, this.tileSizeFill);


        }
        // Gray tiles

        else if((this.row == 0 && this.col == 1) ||
                (this.row == 0 && this.col == 3) ||
                (this.row == 4 && this.col == 0) ||
                (this.row == 4 && this.col == 4)) {
            // border
            g.setColor(Color.black);
            g.fillRect(tileXFill, tileYFill, this.tileSizeFill, this.tileSizeFill);

            g.setColor(darkGray);
            g.fillRect(tileX,tileY,this.tileSize, this.tileSize);
        }
        else if((this.row == 1 && this.col == 0) ||
                (this.row == 1 && this.col == 1) ||
                (this.row == 1 && this.col == 3) ||
                (this.row == 1 && this.col == 4) ||
                (this.row == 3 && this.col == 0) ||
                (this.row == 3 && this.col == 1) ||
                (this.row == 3 && this.col == 3) ||
                (this.row == 3 && this.col == 4)){
            g.setColor(Gray);
            g.fillRect(tileX,tileY,this.tileSize, this.tileSize);

            g.setColor(Color.black);
            g.drawRect(tileX, tileY, this.tileSizeFill, this.tileSizeFill);
        }
        //White tiles
        else {

            g.setColor(Color.white);
            g.fillRect(tileX,tileY,this.tileSize, this.tileSize);}
        g.setColor(Color.black);
        g.drawRect(tileX, tileY, this.tileSizeFill, this.tileSizeFill);
        //Middle grey circle

        g.setColor(Color.gray);
        g.fillOval(222,222,60, 60);


        //Визуализация на Guard-овете спрямо позицията им board-a
        for(int i = 0; i <= 300; i+=100){
            g.setColor(darkGreen);
            g.fillOval(i + 35,35,40, 40);
            g.setColor(Color.yellow);
            g.fillOval(i + 40, 40, 30, 30);

            g.setColor(Color.yellow);
            g.fillOval(i  + 130,425,40, 40);
            g.setColor(darkGreen);
            g.fillOval(i + 135, 430, 30, 30);

        }
        //Визуализация на Leaders
        g.setColor(darkGreen);
        g.fillRect(28,425,50, 50);

        g.setColor(Color.yellow);
        g.fillRect(425,32,50, 50);
//left turtle
        g.setColor(Color.red);
        g.fillOval(28, 233, 50, 50);
        g.setColor(Color.white);
        g.fillOval(35, 240, 35, 35);
//right turtle
        g.setColor(Color.red);
        g.fillOval(428, 233, 50, 50);
        g.setColor(Color.white);
        g.fillOval(435, 240, 35, 35);






    }
   /* public void diceTurtle1 (int side, Graphics g){

        switch (side) {
            case 1:
                g.setColor(Color.red);
                g.fillOval(28, 233, 50, 50);
                g.setColor(Color.white);
                g.fillOval(35, 240, 35, 35);
break;
            case 2:

                g.setColor(Color.red);
                g.fillOval(128, 233, 50, 50);
                g.setColor(Color.white);
                g.fillOval(135, 240, 35, 35);
                break;
            default: g.setColor(Color.white);
            g.fillOval(35 , 240 , 35 ,35);
        }
        }
        */

    }
