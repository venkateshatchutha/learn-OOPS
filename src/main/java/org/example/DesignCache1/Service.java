package org.example.DesignCache;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Service {

    private final CacheDao cacheDao;
    private final CustomThreadPoolBuilder customThreadPoolBuilder;

    private final ExecutorService executorService;

    public Service() {
        this.cacheDao = CacheDao.getInstance();
        this.customThreadPoolBuilder = CustomThreadPoolBuilder.getInstance();
        this.executorService = customThreadPoolBuilder.getThreadPool();
    }
    private User getUserFromUserId(String userName) throws ExecutionException, InterruptedException {
        Future<User> userFuture = executorService.submit(new Callable<User>() {
            @Override
            public User call() throws Exception {
                return null;
            }
        });
        return userFuture.get();
    }
}
