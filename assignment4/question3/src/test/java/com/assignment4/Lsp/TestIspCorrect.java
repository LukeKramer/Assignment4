package com.assignment4.Lsp;

import com.assignment4.isp.obey.obey.domainmanger.Manager;
import com.assignment4.isp.obey.obey.workertypes.Robot;
import com.assignment4.isp.obey.obey.workertypes.SuperWorker;
import com.assignment4.isp.obey.obey.workertypes.Worker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/24.
 */
public class TestIspCorrect {

    @Test
    public void testWorker() throws Exception {

        Manager manage = new Manager();
        Worker work = new Worker();

        manage.setWorker(work);


        Assert.assertSame(5,manage.manageHours());

    }

    @Test
    public void testSuperWorker() throws Exception {

        Manager manage = new Manager();
        SuperWorker eat = new SuperWorker();

        manage.setFood(eat);

        Assert.assertEquals("Meat",manage.manageFood());

    }

    @Test
    public void testRobot() throws Exception {

        Manager manage = new Manager();
        Robot robo = new Robot();

        manage.setWorker(robo);

        Assert.assertEquals(12,manage.manageHours());

    }
}
