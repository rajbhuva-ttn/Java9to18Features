package com.example.Java9to18.Java9;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;


public interface Java9Interface {
    Logger LOGGER = LogManager.getLogger(Java9Interface.class);
    default void DefaultMethod(){
        Java9Interface.staticMethodeInsideInterface();
    }

    private static void staticMethodeInsideInterface(){
        LOGGER.info("Inside Private Static Method");
    }

    void Method1();
}
