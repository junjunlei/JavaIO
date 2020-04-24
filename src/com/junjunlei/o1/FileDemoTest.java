package com.junjunlei.o1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 文件测试
 * @author junjun.lei
 * @create 2020-04-24 10:14
 */
public class FileDemoTest {
    public static void main(String[] args) throws IOException {
        File file = new File("F://info.txt");
        file.createNewFile();
    }

    /**
     * File.separator
     * 根据操作系统,动态创建分割符
     * @throws IOException
     */
    @Test
    public void test01() throws IOException {
        File file = new File("F:"+File.separator+"test.txt");
        file.createNewFile();
    }

}
