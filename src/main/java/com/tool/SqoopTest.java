package com.tool;

import com.cloudera.sqoop.lib.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
//import  com.cloudera.sqoop.tool.SqoopTool;
import org.apache.hadoop.io.nativeio.NativeIO;
import org.apache.sqoop.util.OptionsFileUtil;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.logging.slf4j.Log4jLoggerFactory;
import  org.slf4j.LoggerFactory;
import org.apache.hadoop.io.Text;
public class SqoopTest {
    public static void main(String[] args) throws Exception {


//        System.out.println(" begin test sqoop");
//        String[] argument = new String[]{
//                "--connect", "jdbc:mysql://192.168.1.111:3306/test?useSSL=false",
//                "--driver","com.mysql.jdbc.Driver",
//                "--username", "root",
//                "--password", "123",
//                "--table", "psn",
//                "--columns", "id,name,msg,age",
//                "-m","1",
//                "--target-dir","/user/psn"
//        };
//        //jdbc:mysql://192.168.210.1:3306/bbs?useUnicode=yes&characterEncoding=UTF-8&useSSL=false
//        com.cloudera.sqoop.tool.SqoopTool sqoopTool=(com.cloudera.sqoop.tool.SqoopTool)SqoopTool.getTool("import");
//        Configuration conf= new Configuration();
//        conf.set("fs.default.name","hdfs://192.168.1.111:8020");
//        Sqoop sqoop = new Sqoop(sqoopTool,SqoopTool.loadPlugins(conf) );
//        int res = Sqoop.runSqoop(sqoop,argument);
//        System.out.println("--------"+res);
//
//        System.out.println("执行sqoop结束");

    }
}
