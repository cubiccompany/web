package com.example.controller;

import com.example.domain.Product;
import com.example.domain.User;
import com.example.repos.ProductRepo;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@PreAuthorize("hasAuthority('ADMIN')")
@Controller
public class AdminController {


    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private UserService userService;


//    @Value("${upload.path}")
//    private String uploadPath;
//    @GetMapping("/main")
//    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
//
//        Iterable<Product> products = productRepo.findAll();
//        model.addAttribute("products", products);
//        return "main";
//    }
//
//    @PreAuthorize("hasAuthority('ADMIN')")
//    @PostMapping("/main")
//    public String product(
//            @AuthenticationPrincipal User user,
//            @Valid Product prod,
//            BindingResult bindingResult,
//            Model model,
//            @RequestParam float price,
//            @RequestParam String nameProduct,
//            @RequestParam("file") MultipartFile file
//
//    ) throws IOException {
//        prod.setAuthor(user);
//
//        if (bindingResult.hasErrors()) {
//            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);
//
//            model.mergeAttributes(errorsMap);
//            model.addAttribute( "prod", prod);
//
//        } else {
//            if (file != null && !file.getOriginalFilename().isEmpty()) {
//                File uploadDir = new File(uploadPath);
//
//                if (!uploadDir.exists()) {
//                    uploadDir.mkdir();
//                }
//
//                String uuidFile = UUID.randomUUID().toString();
//                String resultFilename = uuidFile + "." + file.getOriginalFilename();
//
//                file.transferTo(new File(uploadPath + "/" + resultFilename));
//
//                prod.setFilename(resultFilename);
//            }
//            model.addAttribute("prod", null);
//            productRepo.save(prod);
//
//        }
//        Iterable<Product> products = productRepo.findAll();
//
//
//        model.addAttribute("products", products);
//        return "main";
//    }

}
