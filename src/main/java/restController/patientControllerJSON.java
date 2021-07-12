package restController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsiz.iid6.patient.dto.Pacjent;
import pl.wsiz.iid6.patient.service.PatientService;

@RestController
@RequestMapping(value="/api")
public class patientControllerJSON {
    @Autowired
    private PatientService patientService;

    @PostMapping(value="nowy", produces = "application/json")
    public Pacjent save(@RequestBody Pacjent pacjent){
        patientService.saveNewPacjent(pacjent);
        return pacjent;
    }

}
