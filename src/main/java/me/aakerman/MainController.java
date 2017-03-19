package me.aakerman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 3/19/2017.
 */
@Controller
public class MainController {

    @RequestMapping("/thyme")
    public String thyme() {
        return "thyme";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, String> hello() {
        HashMap<String, String> res = new HashMap<>();
        res.put("you", "hello there");
        return res;
    }

}
