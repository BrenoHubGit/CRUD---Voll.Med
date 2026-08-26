package api.Controller;

import api.patients.signUpPatients;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")

public class PacientesController {
    @PostMapping
    public void signUpPatients (@RequestBody signUpPatients dataPatients){
        System.out.println(dataPatients);
    }
}
