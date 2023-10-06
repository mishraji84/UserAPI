package org.example.controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {

    private static final Logger logger = LogManager.getLogger(TestHello.class);
    @RequestMapping("/Hello")
    public String HelloWorld() {
        logger.info("My first Hello");
        return "Hello World";
    }


}
