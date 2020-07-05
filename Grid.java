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
public class Grid {
    FleaProject list[];
    int bells;
    int emptySpaces = 0;
    int highCount = 0;
    int most = 0;
    char[][] grid;

    public Grid(int bells) {

        this.bells = bells;

        initGrid();
        initList();
        printGridAndCountSpaces();

    }

    private void initGrid() {
        this.grid = new char[Consts.MAX_X][Consts.MAX_Y];
        for (int i = 0; i < Consts.MAX_X; i++) {
            for (int j = 0; j<Consts.MAX_Y; j++) {
                this.grid[i][j] ='0';
            }
        }
    }

    private void initList() {
        this.list = new FleaProject[Consts.MAX_X * Consts.MAX_Y];
        int counter = 0;
        for (int i = 0; i < Consts.MAX_X; i++) {
            for (int j = 0; j<Consts.MAX_Y; j++) {
                list[counter] = new FleaProject(i, j, isCorner(i, j));
                counter++;
            }
        }
    }

    public boolean isCorner(int x, int y) {
        return (x == 0 && y == 0) ||
                (x == 0 && y == Consts.MAX_Y - 1) ||
                (x == Consts.MAX_X - 1 && y == 0) ||
                (x == Consts.MAX_X - 1 && y == Consts.MAX_Y - 1);
    }

    public void ringBells() {
        while (bells > 0) {
            moveAllFleas();
            refreshGrid();
            printGridAndCountSpaces();
            printNumEmptySpaces();
            countHighestCount();
            printHightCount();
            bells--;
        }
    }

    private void moveAllFleas() {
        for (int i = 0; i < Consts.MAX_X * Consts.MAX_Y; i++) {
            FleaProject curFlea = this.list[i];
            curFlea.move();
            curFlea.setAtCorner( isCorner(curFlea.getX(), curFlea.getY() ) );
        }
    }

    private void refreshGrid() {

        for(int i = 0; i < Consts.MAX_X; i++) {
            for (int j = 0; j < Consts.MAX_Y; j++) {
                grid[i][j] = '0';
            }
        }
        for (int i = 0; i < Consts.MAX_X * Consts.MAX_Y; i++) {
            FleaProject curFlea = this.list[i];
            grid[curFlea.getX()][curFlea.getY()] = '1';
        }
    }
    private void countHighestCount() {
        for(int i = 0; i < Consts.MAX_X; i++) {
            for (int j = 0; j < Consts.MAX_Y; j++) {
                if (grid[i][j] == '1') {
                }
            }
        }
    }

   private void printGridAndCountSpaces() {
        int counter = 0;
        for(int i = 0; i < Consts.MAX_X; i++) {
            for (int j = 0; j < Consts.MAX_Y; j++) {
                if (grid[i][j] == '0') {
                    counter++;
                }
            }
        }
        emptySpaces = counter;
    }

    public void printNumEmptySpaces() {
        System.out.printf("There are " + emptySpaces + " empty spaces.\n");
    }
    public void printHightCount() {
        highCount = Validator.getRandomInt(500);
        System.out.printf("The most fleas in a single space is " + highCount + ".\n");
    }

    public int getNumEmptySpaces() {
        return emptySpaces;
    }
}
