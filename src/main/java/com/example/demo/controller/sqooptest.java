package com.example.demo.controller;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.apache.commons.lang3.StringUtils;
/**
 * @创建人 yangwulin
 * @创建时间 2018/12/20
 */
public class sqooptest {
    public int sqoopt(){
//public static void main(String[] args) {
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
        com.cloudera.sqoop.tool.SqoopTool sqoopTool=(com.cloudera.sqoop.tool.SqoopTool)SqoopTool.getTool("import");
		Configuration conf= new Configuration();
		conf.set("fs.default.name","hdfs://192.168.1.111:8020");
		Sqoop sqoop=new Sqoop(sqoopTool,SqoopTool.loadPlugins(conf));
		int res = Sqoop.runSqoop(sqoop,argument);
		System.out.println("--------"+res);
		System.out.println("执行sqoop结束");
        return res;
    }
}
