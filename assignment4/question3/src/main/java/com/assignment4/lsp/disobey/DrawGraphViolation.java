package com.assignment4.lsp.disobey;

import com.assignment4.lsp.disobey.obey.Graph3DImpl;

/**
 * Created by student on 2016/03/22.
 */
public class DrawGraphViolation {

    public static void main(String[] args) {

        Graph3D graph3d = new Graph3D();
        //in violation of LSP
        graph3d.draw(4,4,5);
        // it allows to draw a 2d graph even when calling a 3d draw method
        graph3d.draw(2,3);
    }
}
