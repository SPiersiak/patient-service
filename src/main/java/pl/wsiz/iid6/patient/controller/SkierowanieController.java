package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Skierowanie;
import pl.wsiz.iid6.patient.jpa.SkierowanieRepository;
import pl.wsiz.iid6.patient.service.SkierowanieService;

import java.util.List;

@Controller
@RequestMapping(value = "/skierowanie")
public class SkierowanieController {

    @Autowired
    public SkierowanieService skierowanieService;

    @GetMapping("/all")
    public String getSkierowanie(final ModelMap model){
        List<Skierowanie> skierowania = skierowanieService.findAll();
        model.addAttribute("skierowanieAll", skierowania);
        return "skierowanieAll";
    }

    @GetMapping("/getByName")
    @ResponseBody
    public List<Skierowanie> getSkierowanieByName(@RequestParam String name){
        return skierowanieService.findByName(name);
    }

}
