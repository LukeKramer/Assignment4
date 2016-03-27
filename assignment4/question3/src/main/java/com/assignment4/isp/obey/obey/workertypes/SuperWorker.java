package com.assignment4.isp.obey.obey.workertypes;

import com.assignment4.isp.obey.obey.service.IFeedable;
import com.assignment4.isp.obey.obey.service.IWorkable;

/**
 * Created by student on 2016/03/24.
 */
public class SuperWorker implements IWorkable,IFeedable{

    public int Hours() {

        return 8;

    }
    public String Food() {

        return "Meat";
    }
}
