package com.example.demo;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.File;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}

//	public static void main(String[] args) {
//
//		String curClasspath = System.getProperty ("java.class.path");
//		curClasspath = curClasspath
//				+ File.pathSeparator
//				+ "/src/main/webapp/lib/sqoop-1.4.6.jar";
//		System.setProperty ("java.class.path", curClasspath);
//		System.out.println(" begin test sqoop");
//		String[] argument = new String[]{
//				"--connect", "jdbc:mysql://192.168.1.111:3306/test?useSSL=false",
//				"--driver","com.mysql.jdbc.Driver",
//				"--username", "root",
//				"--password", "123",
//				"--table", "psn",
//				"--columns", "id,name,msg,age",
//				"-m","1",
//				"--target-dir","/user/psn"
//		};
	
		//jdbc:mysql://192.168.210.1:3306/bbs?useUnicode=yes&characterEncoding=UTF-8&useSSL=false
//		com.cloudera.sqoop.tool.SqoopTool sqoopTool=(com.cloudera.sqoop.tool.SqoopTool)SqoopTool.getTool("import");
//		Configuration conf= new Configuration();
//		conf.set("fs.default.name","hdfs://192.168.1.112:8020");
//		Sqoop sqoop=new Sqoop(sqoopTool,SqoopTool.loadPlugins(conf));
//		int res = Sqoop.runSqoop(sqoop,argument);
//		System.out.println("--------"+res);
//		System.out.println("执行sqoop结束");
	
//		SqoopTool sqoopTool = SqoopTool.getTool("import");
//		Configuration conf = new Configuration();
//		conf.set("fs.default.name", "hdfs://192.168.1.112:8020");
//		Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) sqoopTool, SqoopTool.loadPlugins(conf));
//		int res = Sqoop.runSqoop(sqoop, argument);
//		System.out.println("--------" + res);
//		System.out.println("执行sqoop结束");

//		SpringApplication.run(DemoApplication.class, args);
//		System.out.println(" begin test sqoop");
//		String[] argument = new String[]{
//				"--connect", "jdbc:oracle:thin:@192.168.210.1:1521:orcale",
//				"--username", "system",
//				"--password", "huang",
//				"--table", "TBNAME",
////				"--hbase-table", "flume",
////				"--column-family", "f",
////				"--hbase-row-key", "ROWKEY",
//				"-m", "1",
//				"--target-dir", "/user/hadoop1"
//		};
//		com.cloudera.sqoop.tool.SqoopTool sqoopTool=(com.cloudera.sqoop.tool.SqoopTool) SqoopTool.getTool("import");
//		Configuration conf= new Configuration();
//		conf.set("fs.default.name","hdfs://192.168.159.160:9000/");
//		Sqoop sqoop = new Sqoop(sqoopTool,SqoopTool.loadPlugins(conf) );
//		int res = Sqoop.runSqoop(sqoop,argument);
//		System.out.println(res);
//		System.out.println("执行sqoop结束");
//	}

}

