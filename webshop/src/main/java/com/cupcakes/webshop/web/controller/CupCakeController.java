package com.cupcakes.webshop.web.controller;

import com.cupcakes.webshop.model.Bottom;
import com.cupcakes.webshop.model.CartLine;
import com.cupcakes.webshop.model.CupCake;
import com.cupcakes.webshop.model.Topping;
import com.cupcakes.webshop.service.CupCakeService;
import com.cupcakes.webshop.web.Color;
import com.cupcakes.webshop.web.FlashMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

/**
 * Created by scheldejonas on 10/09/16.
 */
@Controller
public class CupCakeController {

    @Autowired
    private CupCakeService cupCakeService;

    // Form for uploading a new GIF
    @RequestMapping("/cupcake/upload")
    public String formNewGif(Model model) {

        if (!model.containsAttribute("cupCake")) {
            model.addAttribute("cupCake",new CupCake());
        }
        model.addAttribute("colors", Color.values());
        model.addAttribute("heading","Upload");
        model.addAttribute("action","/cupcake");
        model.addAttribute("submit","Upload Cup Cake");

        return "cupcake/form";
    }

    // Upload a new Cup Cake
    @RequestMapping(value = "/cupcake", method = RequestMethod.POST)
    public String addGif(CupCake cupCake, @RequestParam MultipartFile file, RedirectAttributes redirectAttributes) {
        // Upload new Cup Cake
        cupCakeService.save(cupCake,file,file);

        // Add flash message for succesfully upload
        redirectAttributes.addFlashAttribute("flash",new FlashMessage("Your Cup Cake has been succesfully uploaded to the shop", FlashMessage.Status.SUCCES));

        // TODO: Redirect browser to new GIF's detail view
        return "redirect:/";
    }


}
