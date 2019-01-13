package shiro;

import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class AuthorizatorTest {

    @Test
    public void testHasRole() {
        ShiroUtil.login("shiro-role.ini", "zhang", "123");
        Subject subject = SecurityUtils.getSubject();
        Assert.assertTrue(subject.hasRole("role1"));

        Assert.assertTrue(subject.hasAllRoles(Arrays.asList("role1", "role2")));
        boolean[] bs = subject.hasRoles(Arrays.asList("role1", "role2", "role3"));
        for (boolean b : bs) {
            System.out.println(b);
        }
    }

    @Test(expected = UnauthorizedException.class)
    public void testCheckRole() {
        ShiroUtil.login("shiro-role.ini", "zhang", "123");
        Subject subject = SecurityUtils.getSubject();
        subject.checkRole("role1");

        subject.checkRoles("role1", "role3");

    }

}
