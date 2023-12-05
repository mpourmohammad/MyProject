package ir.sepehrnetiranian.myproject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Users {
    @GetMapping()
    public String GetAllUsers(){
        return "Meysam Your Wellcome";
    }
}