package com.assignment4.isp.disobey.workertypes;

import com.assignment4.isp.disobey.Service.IWorker;

/**
 * Created by student on 2016/03/22.
 */
public class SuperWorker implements IWorker {

    public int Hours() {

        return 10;

    }
    public String Food() {

        return "Meat";
    }
}
