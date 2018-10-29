package com.demo.controller;
;
import com.demo.dao.UserDao;
import com.demo.entiy.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(value = "/test", description="用户相关操作")
@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/getUserAll", method = RequestMethod.GET)
    @ApiOperation(value = "用户查询服务", notes = "查询所有用户")
    public List<User> getUserAll(){
        return userDao.getAllUser();
    }

    @RequestMapping(value = "/getUserByUsername", method = RequestMethod.GET)
    @ApiOperation(value = "用户查询服务", notes = "查询所有用户")
    public User getUserByUsername(@RequestParam @ApiParam(name="username",value="用户名",required=true)String username){
        return userDao.getUserByUsername(username);
    }

    @RequestMapping(value = "/showHello" )
    @ApiIgnore
    public ModelAndView showHello() {
        User user = userDao.getUserByUsername("test");
        return new ModelAndView("hello");
    }
}
