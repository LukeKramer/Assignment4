package com.assignment4.Lpk;

import com.assignment4.plk.disobey.Band;
import com.assignment4.plk.disobey.Poster;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/24.
 */
public class TestLpk {

    @Test
    public void testgetGuitarist() throws Exception {

        Band band = new Band();

        Poster post = new Poster();

        String name =post.makeposter(band);

       Assert.assertEquals("Luke",post.makeposter(band));

    }
}
