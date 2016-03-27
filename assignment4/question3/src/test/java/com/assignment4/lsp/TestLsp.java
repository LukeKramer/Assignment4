package com.assignment4.lsp;

import com.assignment4.lsp.disobey.Graph2D;
import com.assignment4.lsp.disobey.Graph3D;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/22.
 */
public class TestLsp {
    @Test
    public void testLength() throws Exception {

        Graph2D graph  = new Graph2D(3,5);

        Assert.assertEquals(3,graph.getX());

    }

    @Test
    public void testHeight() throws Exception {

        Graph3D graph = new Graph3D(3,4,5);

        Assert.assertSame(5,graph.getZ());

    }

    @Test
    public void testWidth() throws Exception {

        Graph2D graph = new Graph2D(20,9);

        Assert.assertNotNull(graph.getY());

    }


}
