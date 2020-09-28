package controller;

import entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.CustomerRepository;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepo;
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showAddNewForm(Model model){
        String[] sexed={"men","girl"};
        model.addAttribute("sexed",sexed);
        model.addAttribute("customer", new CustomerEntity());                              
        return ("register");
    }
    
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String saveNew(CustomerEntity customer,Model model){        
        customerRepo.save(customer);
          return "redirect:/";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateBook(CustomerEntity customer){

        customerRepo.save(customer);
        return "redirect:/";
    }
}
