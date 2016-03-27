package com.assignment4.Lpk;

import com.assignment4.plk.disobey.obey.Band;
import com.assignment4.plk.disobey.obey.Poster;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/24.
 */
public class TestLpkObey {

    @Test
    public void testgetGuitaristName() throws Exception {

        Poster post = new Poster();
        Band band = new Band();

        post.makeposter(band);

        Assert.assertSame("Man",post.makeposter(band));

    }
}
