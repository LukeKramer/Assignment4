package com.assignment4.lsp.disobey.obey;

/**
 * Created by student on 2016/03/22.
 */
public class Graph3DImpl{





    private Graph2DImpl graph2d = new Graph2DImpl();
    public void draw(int x, int y, int z){
        graph2d.draw(x, y);
        System.out.println("drawing a 2D co-ordinate\n"+"Length :"+x+"\nWidth :"+ y+"\nHeight :"+z);
    }

}
