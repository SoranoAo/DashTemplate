package jp.co.azurelapis.dashtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


/**
 * ダッシュボードのメインController
 */
@Controller
public class Dashbord {


    @RequestMapping(value="/dashbord" ,method = RequestMethod.GET)
    public String initDashbord(Model model) throws IOException {

        return "dashbord";
    }




}
