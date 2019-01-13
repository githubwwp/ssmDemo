package project.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.spring.web.servlet.view.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import project.entity.db.SysUser;
import project.servicenter.db.SysUserService;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("test")
    public ModelAndView test(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();

        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        map.put("sysUser", sysUser);

        return new ModelAndView(new JsonView(), map);
    }

}
