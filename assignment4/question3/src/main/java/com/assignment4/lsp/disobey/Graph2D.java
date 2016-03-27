package com.assignment4.lsp.disobey;

/**
 * Created by student on 2016/03/22.
 */
public class Graph2D {

        private int x;
        private int y;
        public Graph2D()
        {

        }

        public Graph2D(int x,int y)
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

            Graph2D graph = new Graph2D(x,y);
            System.out.println("drawing a 2D co-ordinate\n"+"Length :"+graph.getX()+"\nWidth :"+ graph.getY());
        }
}
