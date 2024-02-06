package sheridan.malikovt.quiz1.controllers;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeController {
    @GetMapping("/")
    public String genTable(Model model){
        Random random = new Random();
        //Generate 1-9
        int numRows = random.nextInt(9);
        List<Integer> rowData = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            rowData.add(i);
        }
        model.addAttribute("rows",numRows);
        return "table";
    }



}
