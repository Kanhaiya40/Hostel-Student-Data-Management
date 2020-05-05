package com.test.api.controller;

import com.test.api.dto.FindStudentWithAdress;
import com.test.api.service.HostelServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class UIController {
    @Autowired
    private HostelServiceClass serviceClass;
    @GetMapping("index/{state}")
    public String getUi(ModelMap modelMap,@PathVariable String state)
    {
        List<FindStudentWithAdress> list=serviceClass.getCustomInfo(state);
        modelMap.addAttribute("list",list);
        return "AddressWiseName";
    }
    @GetMapping("index")
    public String getHomePage(ModelMap modelMap)
    {
        return "home";
    }

}
