package za.ac.nwu.web.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.service.GeneralResponse;

@RestController
public class AccountTypeController {
    @GetMapping("/all")

   public GeneralResponse<String> getAll() {return new GeneraResponse <String>(successful true, payload)}

}
