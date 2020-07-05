/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mausbachfinal;

/**
 *
 * @author njmau
 */
public class FleaProject {
    private int x;
    private int y;
    boolean atCorner;

    public FleaProject(int x, int y, boolean atCorner) {
        this.x = x;
        this.y = y;
        this.atCorner = atCorner;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setAtCorner(boolean atCorner) {
        this.atCorner = atCorner;
    }

    public void move() {

        if (atCorner) {
            moveFromCorner();
        }
        else {
            moveFromNonCorner();
        }
    }

    private void moveFromNonCorner() {
        if ( this.x == 0 ) {
            int ranY = Consts.RAND.nextInt(3) - 1;
            this.y += ranY;
            if (ranY == 0) {
                this.x++;
            }
        }
        else if (this.y == 0) {
            int ranX = Consts.RAND.nextInt(3) - 1;
            this.x += ranX;
            if (ranX == 0) {
                this.y++;
            }
        }
        else if ( this.x == Consts.MAX_X - 1 ) {

            int ranY = Consts.RAND.nextInt(3) - 1;
            this.y += ranY;
            if (ranY == 0) {
                this.x--;
            }
        }
        else if (this.y == Consts.MAX_Y - 1) {
                int ranX = Consts.RAND.nextInt(3) - 1;
                this.x += ranX;
                if (ranX == 0) {
                    this.y--;
                }
            }
        else {
                int ranX = Consts.RAND.nextInt(3) - 1;
                this.x += ranX;
                if (ranX == 0) {
                    int ranY = 0;
                    while (ranY == 0) {
                        ranY = Consts.RAND.nextInt(3) - 1;
                    }
                    this.y += ranY;
                }


        }
    }
    private void moveFromCorner() {
        int corner = findWhichCorner();
        switch(corner) {
            case Consts.TOP_LEFT:
                moveFromTopLeft();
                break;
            case Consts.TOP_RIGHT:
                moveFromTopRight();
                break;
            case Consts.BOTTOM_LEFT:
                moveFromBottomLeft();
                break;
            case Consts.BOTTOM_RIGHT:
                moveFromBottomRight();
                break;
        }
    }
    private void moveFromTopLeft() {
        int ranY = Consts.RAND.nextInt(2);
        this.y += ranY;
        if (ranY == 0) {
            this.x++;
        }
    }
    private void moveFromTopRight() {
        int ranY = Consts.RAND.nextInt(2) - 1;
        this.y += ranY;
        if (ranY == 0) {
            this.x++;
        }
    }
    private void moveFromBottomLeft(){
        int ranY = Consts.RAND.nextInt(2);
        this.y += ranY;
        if (ranY == 0) {
            this.x--;
        }
    }
    private void moveFromBottomRight() {
        int ranY = Consts.RAND.nextInt(2) - 1;
        this.y += ranY;
        if (ranY == 0) {
            this.x--;
        }
    }

    public int findWhichCorner() {
        if (x == 0 && y == 0) {
            return Consts.TOP_LEFT;
        }
        else if (x == 0 && y == Consts.MAX_Y - 1) {
            return Consts.TOP_RIGHT;
        }
        else if (x == Consts.MAX_X-1 && y == 0) {
            return Consts.BOTTOM_LEFT;
        }
        else if (x == Consts.MAX_X-1 && y == Consts.MAX_Y-1) {
            return Consts.BOTTOM_RIGHT;
        }
        else {
            return 0;
        }
    }
}
