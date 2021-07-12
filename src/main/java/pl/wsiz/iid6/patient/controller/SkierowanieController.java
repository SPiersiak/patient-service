package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Skierowanie;
import pl.wsiz.iid6.patient.jpa.SkierowanieRepository;

import java.util.List;

@Controller
@RequestMapping(value = "/skierowanie")
public class SkierowanieController {

    @Autowired
    public SkierowanieRepository skierowanieRepository;

    @GetMapping("/all")
    @ResponseBody
    public List<Skierowanie> getSkierowanie(){
        return skierowanieRepository.findAll();
    }

    @GetMapping("/getByName")
    @ResponseBody
    public Skierowanie getSkierowanieByName(@RequestParam String name){
        return skierowanieRepository.findByLekarz(name);
    }

}
