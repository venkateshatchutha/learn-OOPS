package org.example.DesignCache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheDataStore {

    private static ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<>();

    private static CacheDataStore cacheDataStore = new CacheDataStore();

    public static CacheDataStore getInstance() {
        return cacheDataStore;
    }
    private CacheDataStore(){
    }


    public Map<String,Object> getDataStore(){
        return concurrentHashMap;
    }

}
