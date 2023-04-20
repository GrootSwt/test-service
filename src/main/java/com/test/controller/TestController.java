package com.test.controller;

import com.test.base.exception.BusinessRuntimeException;
import com.test.base.result.SuccessResponse;
import com.test.business.bean.User;
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

    @GetMapping("getUserList")
    public SuccessResponse<List<User>> getSuccessList(HttpServletResponse response) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(1000);
        ArrayList<User> list = new ArrayList<>();
        // throw new BusinessRuntimeException("get user list error");
        User user = new User("1", "张三", "男", 18);
        list.add(user);
        return SuccessResponse.success(list);
    }

    @GetMapping("getUserInfo")
    public SuccessResponse<User> getUserInfo(HttpServletResponse response) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(1500);
        throw new BusinessRuntimeException("get user info error");
        // User user = new User("1", "张三", "男", 18);
        // return SuccessResponse.success(user);
    }
}
