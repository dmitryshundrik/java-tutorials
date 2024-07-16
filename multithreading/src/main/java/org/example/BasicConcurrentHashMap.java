package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BasicConcurrentHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

        Map<String, String> concurrentMap = new ConcurrentHashMap<>();
    }
}
