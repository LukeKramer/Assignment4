package com.assignment4.dip.violation;

/**
 * Created by student on 2016/03/22.
 */
public class WatcherImpl {


        // Handle to EventLog writer to write to the logs
        LogWriterImpl writer = null;

        // This function will be called when the app pool has problem
    public void Notify(String message)
    {
        if (writer == null)
        {
            writer = new LogWriterImpl();
        }
        writer.Write(message);
    }
}
