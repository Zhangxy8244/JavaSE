package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

    /**
     * 5.1 字符串操作
     * int length()：返回字符串的长度： return value.length
     * char charAt(int index)： 返回某索引处的字符return value[index]
     * boolean isEmpty()：判断是否是空字符串：return value.length == 0
     * String toLowerCase()：使用默认语言环境，将 String 中的所字符转换为小写
     * String toUpperCase()：使用默认语言环境，将 String 中的所字符转换为大写
     * String trim()：返回字符串的副本，忽略前导空白和尾部空白
     * boolean equals(Object obj)：比较字符串的内容是否相同
     * boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
     * String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
     * int compareTo(String anotherString)：比较两个字符串的大小
     * String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
     * String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
     */
    @Test
    public void Test(){

        String s1 = "helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s1.isEmpty());

        String s2 = "HelloWorld";
        System.out.println(s2.toLowerCase()); //转换为全小写
        System.out.println(s2.toUpperCase()); //转换为全大写

        String s3 = "  Hello world  ";
        System.out.println(s3.trim()); //输出字符串的副本，并去除前导空格和后续空格

        String s4 = "helloworld";
        System.out.println(s4.equals(s1)); //true
        System.out.println(s4.equalsIgnoreCase(s1)); //true

        String s5 = "zelloworld";
        System.out.println(s5.compareTo(s1));

        System.out.println(s4.substring(5)); //world
        System.out.println(s4.substring(5, 9));  //worl


        /**
         * 2 查找字符串中的字符
         * boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
         * int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
         * int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
         * int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
         * int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
         */


        /**
         * 5.3 字符串操作方法
         *
         * 1.替换：
         * String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所 oldChar 得到的。
         * String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所匹配字面值目标序列的子字符串。
         * String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所匹配给定的正则表达式的子字符串。
         * String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
         *
         * 2.匹配:
         * boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
         *
         * 3.切片：
         * String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串。
         * String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。
         */

    }

    @Test
    public void test2(){

        //String --> char[]:调用String的toCharArray() char[] --> String:调用String的构造器
        String s1 = "HelloWorld";
        char[] chars = s1.toCharArray();
        for (char c :
                chars) {
            System.out.println(c);
        }

        char[] chars1 = new char[]{'c', 'h', 'a', 'r', 's'};
        String s2 = new String(chars1);
        System.out.println(s2);

    }

    @Test
    public void test3() throws UnsupportedEncodingException {

        /**
         * 编码：String --> byte[]:调用String的getBytes()
         *
         * 解码：byte[] --> String:调用String的构造器
         *
         * 编码：字符串 -->字节 (看得懂 --->看不懂的二进制数据)
         *
         * 解码：编码的逆过程，字节 --> 字符串 （看不懂的二进制数据 ---> 看得懂
         *
         * 说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则会出现乱码。
         */

        String s1 = "你好，Java";
        byte[] byteArray = s1.getBytes(); //使用默认字符集编码

        System.out.println(Arrays.toString(byteArray));

        byte[] gbks = s1.getBytes("gbk"); //使用gbk编码集

        System.out.println("-------------------------------------------");

        String str = new String(byteArray); //使用默认字符集解码
        System.out.println(str); //你好，Java
        String str2 = new String(gbks); //使用默认字符集对gbk编码进行解码
        System.out.println(str2); //乱码

        String str3 = new String(gbks, "gbk");
        System.out.println(str3); //你好，Java

    }

    @Test
    public void test4(){
        /**
         * 1.String -->StringBuffer、StringBuilder: 调用StringBuffer、StringBuilder构造器
         */

        String str1 = "Hello";

        StringBuffer stringBuffer = new StringBuffer(str1);
        System.out.println(stringBuffer); //Hello

        StringBuilder stringBuilder = new StringBuilder(str1);
        System.out.println(stringBuilder); //Hello

        stringBuffer.append("world");
        System.out.println(stringBuffer); //Hellowrold

        stringBuilder.append("world");
        System.out.println(stringBuilder); //Helloworld
    }

    @Test
    public void test5(){
        /**
         * 2.StringBuffer、StringBuilder -->String:
         * ①调用String构造器； ②StringBuffer、StringBuilder的toString()
         */

        StringBuffer stringBuffer = new StringBuffer("Hellobuffer");
        System.out.println(stringBuffer);

        String s1 = new String(stringBuffer);
        System.out.println(s1); //Hellobuffer

        String s2 = stringBuffer.toString();
        System.out.println(s2); //Hellobuffer

    }

}
