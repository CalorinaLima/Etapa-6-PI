package com.ProjetoIntegrador.deposito.controller;

import com.ProjetoIntegrador.deposito.model.Funcionario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {
    @GetMapping("/inicio")
    public String inicio2(Model model){
        Funcionario funcionario = new Funcionario();
        model.addAttribute("funcionario", funcionario);
        return "index";
    }
}
