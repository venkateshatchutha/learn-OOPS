package org.example.DesignCache.Starage;

import org.example.DesignCache.Starage.Exceptions.NotFoundException;

import java.util.HashMap;
import java.util.Map;

public class HahMapStorage<key,value> implements Istorage<key,value>{

    Map<key,value> storage = new HashMap<>();
    @Override
    public value get(key key) {
        if(!storage.containsKey(key)){
            throw new NotFoundException(key + "doesn't exist in cache.");
        }
        return storage.get(key);
    }

    @Override
    public boolean put(key key, value value) {
        return false;
    }

    @Override
    public boolean remove(key key) {
        return false;
    }
}
