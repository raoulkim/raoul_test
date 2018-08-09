package raoul.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RaoulController {


    @RequestMapping(value = "/raoul.do", method = RequestMethod.GET)
    @ResponseBody
    public String controllerTest(HttpServletRequest request, HttpServletResponse response){

        System.out.println("test");


        return "hello~";
    }
}
