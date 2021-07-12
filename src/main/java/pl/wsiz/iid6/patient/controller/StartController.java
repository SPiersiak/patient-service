package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.service.PatientService;

@Controller
@RequestMapping(value = "/")
public class StartController {

    @GetMapping
    public String index() {
        return "index";
    }

}