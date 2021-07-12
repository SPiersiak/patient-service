package pl.wsiz.iid6.patient.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Lek;
import pl.wsiz.iid6.patient.service.LekService;


@Controller
@RequestMapping(value = "/medicine")
public class MedicineController
{
    @Autowired
    private LekService lekService;

    @GetMapping(path="/find")
    @ResponseBody
    public Lek getMedicine(@RequestParam String name)
    {
        return lekService.findLek(name);
    }
}
