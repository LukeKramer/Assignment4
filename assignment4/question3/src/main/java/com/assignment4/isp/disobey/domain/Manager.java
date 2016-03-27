package com.assignment4.isp.disobey.domain;

import com.assignment4.isp.disobey.Service.IWorker;

/**
 * Created by student on 2016/03/22.
 */
public class Manager {

    IWorker worker;

    public void setWorker(IWorker w) {
        worker=w;
    }

    public int manageHours() {
        return worker.Hours();
    }

    public String manageFood()
    {
        return worker.Food();
    }
}
