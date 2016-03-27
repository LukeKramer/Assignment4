package com.assignment4.lsp.disobey.obey;

/**
 * Created by student on 2016/03/22.
 */
public class DrawGraphCorrectly {

    public static void main(String args[]) {
        Graph3DImpl graph3d = new Graph3DImpl();
        //delegation wont allow 3D to draw 2D graph
        graph3d.draw(4, 4, 7);
    }
}
