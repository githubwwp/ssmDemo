package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;

public class PermissionTest {

    @Test
    public void testIsPermitted() {
        ShiroUtil.login("shiro-permission.ini", "zhang", "123");
        Subject subject = SecurityUtils.getSubject();
        Assert.assertTrue(subject.isPermitted("user:create"));

        Assert.assertTrue(subject.isPermittedAll("user:create", "user:delete"));

        Assert.assertFalse(subject.isPermitted("user:view"));
    }

    @Test(expected = UnauthorizedException.class)
    public void testCheckPermission() {
        ShiroUtil.login("shiro-permission.ini", "zhang", "123");
        Subject subject = SecurityUtils.getSubject();
        subject.checkPermission("user:create");
        
        subject.checkPermissions("user:create", "user:delete");
        
        subject.checkPermission("user:abc");
    }

}
