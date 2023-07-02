package org.example.DesignCache.Starage;

public interface Istorage<key,value> {

    public value get(key key);

    public boolean put(key key, value value);

    public boolean remove(key key);
}
