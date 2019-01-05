package project.web.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.spring.web.servlet.view.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import project.servicenter.db.AbcService;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private AbcService abcService;

    @RequestMapping("test")
    public ModelAndView test() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("abc", abcService);
        
        abcService.testMybatis();

        return new ModelAndView(new JsonView(), map);
    }

}
