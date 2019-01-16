package com.centyun.crm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.centyun.web.controller.WebBaseController;

@Controller
public class CrmController extends WebBaseController {

    @RequestMapping({"", "/", "index.html"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView model = new ModelAndView();
        model.addObject("products", getAvailableProducts(request));
        model.addObject("consoleUrl", consoleUrl);
        model.setViewName("index");
        return model;
    }

}
