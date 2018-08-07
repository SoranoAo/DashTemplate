package jp.co.azurelapis.dashtemplate.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.Writer;


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
