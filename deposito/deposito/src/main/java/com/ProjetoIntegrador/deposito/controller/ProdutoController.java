
package com.ProjetoIntegrador.deposito.controller;

import com.ProjetoIntegrador.deposito.model.Produto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutoController {
    
    private List<Produto> listaProdutos = new ArrayList<>();
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    
    @GetMapping("/cadastro")
    public String cadastro(Model model){
        model.addAttribute("produto", new Produto());
        return "cadastro";
    }
    
    @GetMapping("/paginas")
    public String paginas(){
        return "paginas";
    }
    
    @GetMapping("/movimentacao")
    public String movimentacao(){
        return "movimentacao";
    }
    
    @PostMapping("/cadastro")
    public String processarForm(Model model, @ModelAttribute Produto produto){
        produto.setId(listaProdutos.size()+1);
        listaProdutos.add(produto);
        return "redirect:/listagem";
    }
    
    @GetMapping("/listagem")
    public String listagem(Model model){
        model.addAttribute("produtos", listaProdutos);
        return "listagem";
    }
}
