package pl.wsiz.iid6.patient.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
//import pl.wsiz.iid6.patient.dto.Pacjent;
import org.springframework.web.servlet.ModelAndView;
import pl.wsiz.iid6.patient.dto.Pacjent;
import pl.wsiz.iid6.patient.entity.PatientEntity;
import pl.wsiz.iid6.patient.service.PatientService;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/patient")
public class PatientController
{
        @Autowired
        private PatientService patientService;

        @GetMapping(path="/id")
        public String patientId(final ModelMap model, @RequestParam Long idP)
        {
                Pacjent patient = patientService.findbyID(idP);
                model.addAttribute("imie",patient.getImie());
                model.addAttribute("nazwisko",patient.getNazwisko());
                model.addAttribute("miejscowosc",patient.getMiejscowosc());
                model.addAttribute("kod",patient.getKod());
                model.addAttribute("ulica",patient.getUlica());
                model.addAttribute("pesel",patient.getPesel());
                model.addAttribute("dataUrodzenia",patient.getDataUrodzenia());
                model.addAttribute("mail",patient.getMail());
                model.addAttribute("telefon",patient.getNrTelefonu());
                model.addAttribute("plec",patient.getPlec());
                return "pacjentId.html";



        }
/*
        @GetMapping(path="/age")
        public String age(final ModelMap model, @RequestParam int wiek)
        {
                List<PatientEntity> allPatients = patientService.findAll();

                Date dzisiaj = new Date();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(dzisiaj);
                int r1 = calendar.get(Calendar.YEAR);
                for (PatientEntity p : allPatients)
                {
                       // long rok = dzisiaj.getTime() - p.getDataUrodzenia().getTime();
                        Calendar calendar1 = Calendar.getInstance();
                        calendar1.setTime(p.getDataUrodzenia());
                        int r2 = calendar1.get(Calendar.YEAR);
                        if ( !(r1-r2 == wiek))
                        {
                               allPatients.remove(p);
                        }



                }
                model.addAttribute("patientsByWiek",allPatients);
                return "pacjentWiek.html";

        }
*/

        @GetMapping(path="/imie")
        public String patientName(final ModelMap model, @RequestParam String imie)
        {
                List<PatientEntity> patientByImie = patientService.findAllByImie(imie);
                model.addAttribute("patientsByImie",patientByImie);
                return "pacjentByImie.html";
        }

        @GetMapping(path="/all")
        public String patientAll(final ModelMap model)
        {
                List<PatientEntity> allPatient = patientService.findAll();
                model.addAttribute("patients",allPatient);
                return "pacjentAll.html";
        }

        @GetMapping(path="/nazwisko")
        public String patientNazwisko(final ModelMap model, @RequestParam String nazwisko)
        {
                List<PatientEntity> patientByNazwisko = patientService.findAllByNazwisko(nazwisko);
                model.addAttribute("patientsByNazwisko",patientByNazwisko);
                return "pacjentByNazwisko.html";
        }

        @RequestMapping(value="/form", method = RequestMethod.GET)
        public ModelAndView showForm(){
                return new ModelAndView("formularz","pacjent", new Pacjent());
        }

        @RequestMapping(value="/addPacjent",method = RequestMethod.POST)
        public String submit(@Validated @ModelAttribute("pacjent")Pacjent patient, BindingResult result, ModelMap model){
                if (result.hasErrors()){
                        return "error";
                }
                model.addAttribute("imie",patient.getImie());
                model.addAttribute("nazwisko",patient.getNazwisko());
                model.addAttribute("miejscowosc",patient.getMiejscowosc());
                model.addAttribute("kod",patient.getKod());
                model.addAttribute("ulica",patient.getUlica());
                model.addAttribute("pesel",patient.getPesel());
                model.addAttribute("dataUrodzenia",patient.getDataUrodzenia());
                model.addAttribute("mail",patient.getMail());
                model.addAttribute("nrTelefonu",patient.getNrTelefonu());
                model.addAttribute("plec",patient.getPlec());
                patientService.saveNewPacjent(patient);
                return "formularz";

        }

}
