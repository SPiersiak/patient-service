package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Badanie;
import pl.wsiz.iid6.patient.dto.Lek;
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
    public String getBadanie(final ModelMap model){

        List<Badanie> badanie = badanieService.findAll();
        model.addAttribute("badania", badanie);
        return "badanieAll";
    }

    @GetMapping("/pesel")
    public String getBadanieByPesel(final ModelMap model, @RequestParam String pesel){
        List<Badanie> badanie = badanieService.findByPesel(pesel);
        model.addAttribute("badanie", badanie);
        return "badanieByPesel";
    }

    @GetMapping("/typ")
    public String getBadanieByTyp(final ModelMap model, @RequestParam String typ){
        List<Badanie> badanie = badanieService.findByTyp(typ);
        model.addAttribute("badanie", badanie);
        return "badanieByTyp";
    }
}
