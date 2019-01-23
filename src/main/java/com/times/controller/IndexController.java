package com.times.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 首页访问控制器
 * @author zhangjian
 *
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("name", "HelloController");
        return "index";
    }
}
