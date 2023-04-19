package com.test.controller;

import com.test.base.result.ErrorResponse;
import com.test.base.result.SuccessResponse;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
@RequestMapping(value = "test")
public class TestController {

    @GetMapping("getSuccessList")
    public SuccessResponse<List<String>> getSuccessList() throws InterruptedException {
        log.info("getSuccessList start");
        TimeUnit.MILLISECONDS.sleep(2000);
        ArrayList<String> list = new ArrayList<>(4);
        list.add("hello");
        list.add("world");
        log.info("getSuccessList end");
        return SuccessResponse.success(list);
    }

    @GetMapping("getErrorList")
    public ErrorResponse getError(HttpServletResponse response) throws InterruptedException{
        log.info("getErrorList start");
        TimeUnit.MILLISECONDS.sleep(1000);
        response.setStatus(404);
        log.info("getErrorList end");
        return ErrorResponse.failure("get failure");
    }
}
