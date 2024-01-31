package com.example.Java9to18.Java9;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutoClosableDemoClass implements AutoCloseable {
    @Override
    public void close() throws Exception {
        log.info("Closing Resources");
    }
}
