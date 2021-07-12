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

        @GetMapping(path="/indexOld")
        @ResponseBody
        public String index() {
                return "Witamy";
        }

        @GetMapping(path="/index")
        public String indexWeb() {
                return "index.html";
        }

        @GetMapping(path="/age") //?yearNow=2021&yearBirth=1998
        @ResponseBody
        public String age(@RequestParam(required = true) int yearNow, @RequestParam int yearBirth) {
                return Integer.toString(yearNow-yearBirth);
        }

        @GetMapping(path="/id") // po idP
        @ResponseBody
        public String patientId(@RequestParam Long idP){
                return (patientService.findbyId(idP)).toString();
        }

        @GetMapping(path="/lastname") //po lname
        @ResponseBody
        public String patientName(@RequestParam String lname){
                return (patientService.findByLastName(lname)).toString();
        }

        @GetMapping(path="/firstname") //po fname
        @ResponseBody
        public String patientFirstName(@RequestParam String name){
                return (patientService.findByFirstName(name)).toString();
        }

        @GetMapping(path="/pesel") //po pesel
        @ResponseBody
        public String patientPesel(@RequestParam String pesel){
                return (patientService.findByPesel(pesel)).toString();
        }

        @GetMapping(path="/namesWeb") //po name - też nazwisko
        public String patientNameWeb (final ModelMap model, @RequestParam String name){
                List<PatientEntity> patientByName = patientService.findByLastName(name);
                model.addAttribute("patientsByName", patientByName);
                return "pacjentByName.html";
        }

        @GetMapping(path="/peselWeb") //po pesel
        public String patientPeselWeb (final ModelMap model, @RequestParam String pesel){
                List<PatientEntity> patientByPesel = patientService.findByPesel(pesel);
                model.addAttribute("patientsByPesel", patientByPesel);
                return "pacjentByPesel.html";
        }

        @GetMapping(path="/firstnamesWeb") //po fname
        public String patientFNameWeb (final ModelMap model, @RequestParam String fname){
                List<PatientEntity> patientByFirstName = patientService.findByFirstName(fname);
                model.addAttribute("patientsByFirstName", patientByFirstName);
                return "pacjentByFirstName.html";
        }

        @RequestMapping(value = "/pacjent") //po idP
        public String index(final ModelMap model, Long idP) {
                model.addAttribute("nr", idP);
                Pacjent patient = patientService.findbyId(idP);
                model.addAttribute("imie", patient.getImie());
                model.addAttribute("nazwisko", (patient.getNazwisko()));
                model.addAttribute("pesel", (patient.getPesel()));
                return "pacjent.html";
        }

        @GetMapping(path="/patientsall")
        public String listPatients(final ModelMap model) throws Exception {
                List<PatientEntity> allPatient = patientService.findAll();
                model.addAttribute("patients", allPatient);
                return  "pacjentAll.html";
        }

}
