package pl.wsiz.iid6.patient.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wsiz.iid6.patient.service.LekService;

@RestController
@RequestMapping(value="/api/medicine")
public class MedicineRESTController {
    @Autowired
    private LekService lekService;

    @GetMapping(path="/all")
    public String lekAll(){
        return (lekService.getAllMedicine()).toString();
    }

    @GetMapping(path="lekNazwa/{name}")
    public String lekName(@PathVariable String name){
        return (lekService.getAllMedByName(name)).toString(); }

    @GetMapping(path="producent/{name}")
    public String producentName(@PathVariable String name){
        return (lekService.getAllMedByProducent(name)).toString();
    }
}
