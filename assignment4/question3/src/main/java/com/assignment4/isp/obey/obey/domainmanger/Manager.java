package com.assignment4.isp.obey.obey.domainmanger;

import com.assignment4.isp.obey.obey.service.IFeedable;
import com.assignment4.isp.obey.obey.service.IWorkable;

/**
 * Created by student on 2016/03/24.
 */
public class Manager {
    IWorkable worker;
    IFeedable food;

    public void setWorker(IWorkable w) {
        worker=w;
    }
    public void setFood(IFeedable f)
    {
        food =f;
    }

    public int manageHours() {
        return worker.Hours();
    }

    public  String manageFood()
    {
        return food.Food();
    }
}
