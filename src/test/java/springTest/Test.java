package springTest;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;

public class Test {

    public static void main(String[] args) {
        // ApplicationContext ac = new
        // ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // AbcService abcService = (AbcService) ac.getBean("abcService");
        // System.out.println(abcService);

        String str = "abc";
        String a = Base64.encodeToString(str.getBytes());
        String str2 = Base64.decodeToString(a);
        System.out.println(str.equals(str2));
        
        String s2 = "hello";
        String salt = "123";
        String md5 = new Md5Hash(s2).toString();
        System.out.println(md5);
        String md5_2 = new Md5Hash(s2, salt).toString();
        System.out.println(md5_2);
    }

}
