package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    GrocerryRepository gRepository;
    CleaningRepository cleaningRepository;



    //@RequestMapping("/")
    // public String listCosmetics(Model model){
       //  model.addAttribute("cosmetices", gRepository.findAll());

         //return "list";
    // }


  //  @RequestMapping("/")
   //public String listCleaning(Model model){

       // model.addAttribute("cleanings", cleaningRepository.findAll());
        //return "list";
    //}

   @GetMapping("/add")
    public String gForm(Model model){
        model.addAttribute(("cosmetics"), new Grocerry());
        return "cform";
   }
   @PostMapping("/process")
    public String processForm(@ModelAttribute("cosmetics")  Grocerry cosmetics, BindingResult result){
        if(result.hasErrors()){
            return "cform";

        }
        gRepository.save(cosmetics);

        return "list";
   }
    @GetMapping("/addcleaning")
    public String CleaningForm(Model model){

         model.addAttribute(("cleaning"), new Cleaning());
        return "cleaningform";
    }

    @PostMapping("/processcleaning")
    public String processCleaningForm(@ModelAttribute("cleaning")  Cleaning cleaning, BindingResult result){
        if(result.hasErrors()){
            return "ceaningform";

        }
        cleaningRepository.save(cleaning);

        return "list";
    }

}
