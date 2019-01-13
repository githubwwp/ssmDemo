package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroUtil {

    public static void login(String iniName, String username, String pwd) {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory(iniName);
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            // 身份验证失败
            System.err.println("身份验证失败");
        }
    }
    
}
