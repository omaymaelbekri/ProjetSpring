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

import com.joseph.entity.Product;
import com.joseph.service.ProductService; // Assuming you have a ProductService for managing products

@Controller
@RequestMapping("/product")
public class ProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String listProducts(Model theModel) {
        List<Product> theProducts = productService.getProducts();
        theModel.addAttribute("products", theProducts);
        return "list-products";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("Inside show product-form handler method");
        Product theProduct = new Product();
        theModel.addAttribute("product", theProduct);
        return "product-form";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product theProduct) {
        productService.saveProduct(theProduct);
        return "redirect:/product/list";
    }

    /*@GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("productId") int theId,
                                    Model theModel) throws NullPointerException {
        Product theProduct = productService.getProduct(theId);
        theModel.addAttribute("product", theProduct);
        return "product-form";
    }*/

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("productId") int theId) throws NullPointerException {
        productService.deleteProduct(theId);
        return "redirect:/product/list";
    }
}

