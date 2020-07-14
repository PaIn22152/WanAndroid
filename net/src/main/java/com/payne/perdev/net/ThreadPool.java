package com.payne.perdev.net;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Project    WanAndroid
 * Path       com.payne.perdev.net
 * Date       2020/07/14 - 10:33
 * Author     Payne.
 * About      类描述：
 */
public class ThreadPool {
    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void run(Runnable run) {
        executorService.execute(run);
    }

    public static <T> void run(Callable<T> task) {
        executorService.submit(task);
    }


}
