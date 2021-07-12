package pl.wsiz.iid6.patient.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wsiz.iid6.patient.dto.Badanie;
import pl.wsiz.iid6.patient.service.BadanieService;

import java.util.List;

@RestController
@RequestMapping(value="/api/badanie")
public class BadanieRESTController {
    @Autowired
    private BadanieService badanieService;

    @GetMapping(path="/all")
    public List<Badanie> badanieAll(){
        return badanieService.findAll();
    }

    @GetMapping(path="pesel/{pesel}")
    public List<Badanie> badanieByPesel (@PathVariable String pesel){
        return badanieService.findByPesel(pesel); }

    @GetMapping(path="typ/{typ}")
    public List<Badanie> badanieByTyp(@PathVariable String typ){
        return badanieService.findByTyp(typ);
    }

}
