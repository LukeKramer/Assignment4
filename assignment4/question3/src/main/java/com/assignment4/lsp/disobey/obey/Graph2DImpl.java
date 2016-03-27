package com.assignment4.lsp.disobey.obey;

/**
 * Created by student on 2016/03/22.
 */
public class Graph2DImpl {

    private int x;
    private int y;
    public Graph2DImpl()
    {

    }

    public Graph2DImpl(int x,int y)
    {
        this.x =x;
        this.y =y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(int x, int y){

        Graph2DImpl graph = new Graph2DImpl(x,y);
        System.out.println("drawing a 2D co-ordinate\n"+"Length :"+graph.getX()+"\nWidth :"+ graph.getY());
    }

}
