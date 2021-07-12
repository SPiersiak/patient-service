package pl.wsiz.iid6.patient.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wsiz.iid6.patient.dto.Recepta;
import pl.wsiz.iid6.patient.service.ReceptaService;

import java.util.List;

@RestController
@RequestMapping(value="/api/recepta")
public class ReceptaRESTController {
    @Autowired
    private ReceptaService receptaService;

    @GetMapping(path="/all")
    public List<Recepta> receptaAll(){
        return receptaService.findAll();
    }

    @GetMapping(path="/{pesel}")
    public List<Recepta> receptaBePesel(@PathVariable String pesel){
        return receptaService.findByPesel(pesel); }

}
