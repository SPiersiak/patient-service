package pl.wsiz.iid6.patient.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wsiz.iid6.patient.dto.Skierowanie;
import pl.wsiz.iid6.patient.service.SkierowanieService;

import java.util.List;

@RestController
@RequestMapping(value="/api/skierowanie")
public class SkierowanieRESTController {
    @Autowired
    private SkierowanieService skierowanieService;

    @GetMapping(path="/all")
    public List<Skierowanie> skierowanieAll(){
        return skierowanieService.findAll();
    }

    @GetMapping(path="/{name}")
    public List<Skierowanie> skierowanieByName(@PathVariable String name){
        return skierowanieService.findByName(name); }
}
