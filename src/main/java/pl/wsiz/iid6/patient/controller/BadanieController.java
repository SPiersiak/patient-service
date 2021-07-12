package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Badanie;
import pl.wsiz.iid6.patient.dto.Recepta;
import pl.wsiz.iid6.patient.service.BadanieService;
import pl.wsiz.iid6.patient.service.PatientService;

import java.util.List;

@Controller
@RequestMapping(value = "/badanie")
public class BadanieController {
    @Autowired
    private BadanieService badanieService;

    @GetMapping("/all")
    @ResponseBody
    public List<Badanie> getBadanie(){
        return badanieService.findAll();
    }

    @GetMapping("/pesel")
    @ResponseBody
    public List<Badanie> getbadanieByPesel(@RequestParam String pesel){
        return badanieService.findByPesel(pesel);
    }

    @GetMapping("/typ")
    @ResponseBody
    public List<Badanie> getbadanieByTyp(@RequestParam String typ){
        return badanieService.findByTyp(typ);
    }

}
