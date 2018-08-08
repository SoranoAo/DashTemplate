package jp.co.azurelapis.dashtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


/**
 * ダッシュボードのメインController
 */
@Controller
public class Dashbord {


    @RequestMapping(value="/dashbord")
    @ResponseBody
    public String initDashbord() throws IOException {

        return "dash bord test";
    }




}
