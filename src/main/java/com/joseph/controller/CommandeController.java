
package com.joseph.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joseph.entity.Commande;
import com.joseph.service.CommandeService;

@Controller
@RequestMapping("/commande")
public class CommandeController {

    private static final Logger LOG = LoggerFactory.getLogger(CommandeController.class);

    @Autowired
    private CommandeService commandeService;

    @GetMapping("/list")
    public String listCommandes(Model theModel) {
        List<Commande> theCommandes = commandeService.getCommandes();
        theModel.addAttribute("commandes", theCommandes);
        return "list-commandes";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show commande-form handler method");
        Commande theCommande = new Commande();
        theModel.addAttribute("commande", theCommande);
        return "commande-form";
    }

    @PostMapping("/saveCommande")
    public String saveCommande(@ModelAttribute("commande") Commande theCommande) {
        commandeService.saveCommande(theCommande);
        return "redirect:/commande/list";
    }

    @GetMapping("/delete")
    public String deleteCommande(@RequestParam("commandeId") int theId) throws NullPointerException {
        commandeService.deleteCommande(theId);
        return "redirect:/commande/list";
    }
}
