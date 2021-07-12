package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Recepta;
import pl.wsiz.iid6.patient.dto.Skierowanie;
import pl.wsiz.iid6.patient.jpa.SkierowanieRepository;
import pl.wsiz.iid6.patient.service.ReceptaService;

import java.util.List;

@Controller
@RequestMapping(value = "/recepta")
public class ReceptaController {

    @Autowired
    public ReceptaService receptaService;

    @GetMapping("/all")
    public String getRecepta(final ModelMap model){
        List<Recepta> recepty = receptaService.findAll();
        model.addAttribute("receptaAll", recepty);
        return "receptaAll";
    }

    @GetMapping("/getByPesel")
    @ResponseBody
    public List<Recepta> getReceptaByPesel(@RequestParam String pesel){
        return receptaService.findByPesel(pesel);
    }

}
