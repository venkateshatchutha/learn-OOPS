package org.example.DesignCache;

import java.util.Optional;

public class CacheDao {

    // Cache data store.

    private static final CacheDao cacheDao = new CacheDao();

    private final CacheDataStore cacheDataStore;

    public CacheDao() {
        this.cacheDataStore = CacheDataStore.getInstance();
    }

    public static CacheDao getInstance() {
        return cacheDao;
    }

    public void fetchUserByUserName(String userName) {
         cacheDataStore.getDataStore().getOrDefault( userName, null);
    }

    public void insertRecordIntoDataStore(String userName, User user){
        cacheDataStore.getDataStore().put(userName,user);
    }


}
