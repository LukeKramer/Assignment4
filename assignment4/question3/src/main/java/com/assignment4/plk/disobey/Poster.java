package com.assignment4.plk.disobey;

import com.assignment4.plk.disobey.Band;

/**
 * Created by student on 2016/03/24.
 */
public class Poster {

    public String makeposter(Band band)
    {
      String name =  band.getGuitarist().getName();

        return name;
    }
}
