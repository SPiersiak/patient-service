package pl.wsiz.iid6.patient.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Lek;
import pl.wsiz.iid6.patient.service.LekService;

import java.util.List;


@Controller
@RequestMapping(value = "/medicine")
public class MedicineController
{
    @Autowired
    private LekService lekService;

    @GetMapping(path = "/allMedicine")
    public String getMedicineAll(final ModelMap model) {
        List<Lek> leki = lekService.getAllMedicine();
        model.addAttribute("lekiAll", leki);
        return "lekiAll";
    }

    @GetMapping(path = "/medicineByName")
    public String getAllByName(final ModelMap model, @RequestParam String name) {
        List<Lek> leki = lekService.getAllMedByName(name);
        model.addAttribute("lekiByName", leki);
        return "lekiByName";
    }
    @GetMapping(path = "/medicineByProducent")
    public String getAllByProducent(final ModelMap model, @RequestParam String producent) {
        List<Lek> leki = lekService.getAllMedByProducent(producent);
        model.addAttribute("lekiByProducent", leki);
        return "lekiByProducent";
    }
}
