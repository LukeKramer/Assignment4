package com.assignment4.lsp.disobey;

/**
 * Created by student on 2016/03/22.
 */
public class Graph3D extends Graph2D{

    private int z;
    public Graph3D()
    {

    }

    public Graph3D(int x,int y,int z)
    {
        super(x,y);
        this.z =z;
    }

    public int getZ() {
        return z;
    }



    public void draw(int x, int y,int z){

        Graph3D graph = new Graph3D(x,y,z);
        System.out.println("drawing a 2D co-ordinate\n"+"Length :"+graph.getX()+"\nWidth :"+ graph.getY()+"\nHeight :"+ graph.getZ());
    }


}
