package com.tool;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * @创建人 yangwulin
 * @创建时间 2018/12/19
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
//        return "Hello World!";
        System.out.println(" begin test sqoop");
        String[] argument = new String[]{
                "--connect", "jdbc:mysql://192.168.1.111:3306/test?useSSL=false",
                "--driver","com.mysql.jdbc.Driver",
                "--username", "root",
                "--password", "123",
                "--table", "psn",
                "--columns", "id,name,msg,age",
                "-m","1",
                "--target-dir","/user/psn"
        };
        SqoopTool sqoopTool = SqoopTool.getTool("import");
        Configuration conf = new Configuration();
        conf.set("fs.default.name", "hdfs://192.168.1.112:8020");
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) sqoopTool, SqoopTool.loadPlugins(conf));
        int res = Sqoop.runSqoop(sqoop, argument);
        System.out.println("--------" + res);
        System.out.println("执行sqoop结束");
        return ("执行sqoop结束");
    }
}
