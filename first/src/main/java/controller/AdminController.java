package controller;

import Aop.Aop1;
import bean.Admin;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import serviceImpl.AdminServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping("index")
    @ResponseBody
    public String toIndex(){
        return "hello IDEA!";
    }

    @RequestMapping("indexs")
    public ModelAndView toIndex2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        System.out.println("indexs");
        return modelAndView;
    }

    @RequestMapping("sel")
    @ResponseBody
    public Map<String,Object> selectAllAdmin(){
        Map<String,Object> map = new HashMap<String, Object>();
        List<Admin> admins = adminService.selectAllAdmin();
        map.put("admin",admins);
        return map;
    }
}
