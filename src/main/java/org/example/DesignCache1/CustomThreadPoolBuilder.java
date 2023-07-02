package org.example.DesignCache;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadPoolBuilder {

    private static final CustomThreadPoolBuilder customThreadPoolBuilder = new CustomThreadPoolBuilder();

    public static CustomThreadPoolBuilder getInstance(){
        return customThreadPoolBuilder;
    }

    public ExecutorService getThreadPool(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        return executorService;
    }


}
