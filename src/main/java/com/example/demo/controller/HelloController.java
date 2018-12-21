package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;;
/**
 * @创建人 yangwulin
 * @创建时间 2018/12/19
 */
@RestController
public class HelloController {
    @RequestMapping(value ="/Hello",method = RequestMethod.GET)
//    @RequestMapping("/")
    public String hello(){
        sqooptest sq=new sqooptest();
        int i=sq.sqoopt();
        if (i==0)
        {
            return "0";
        }
        else return "1";

    }
}
