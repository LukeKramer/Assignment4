package com.assignment4.Lsp;

import com.assignment4.isp.disobey.domain.Manager;
import com.assignment4.isp.disobey.workertypes.SuperWorker;
import com.assignment4.isp.disobey.workertypes.Worker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/22.
 */
public class TestIsp {


    @Test
    public void testWorkerhours() throws Exception {

        Worker work = new Worker();
        Manager manage = new Manager();
        manage.setWorker(work);

        int hours = manage.manageHours();

        Assert.assertEquals(3,hours);

    }

    @Test
    public void testSuperWokerFood() throws Exception {

        SuperWorker work = new SuperWorker();
        Manager manage = new Manager();

        manage.setWorker(work);

        Assert.assertSame("Meat",manage.manageFood());

    }


}
