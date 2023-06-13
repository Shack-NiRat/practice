package ru.neoflex.practice.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.practice.model.Base;
import ru.neoflex.practice.repository.BaseRepository;

@RestController
public class CalcController {
    @Autowired
    private BaseRepository baseRepository;

    @GetMapping("/plus/{a}/{b}")
    public String GetSum(@PathVariable("a") double a,@PathVariable("b") double b ){
        double result = a + b;
        Base Result = new Base(String.valueOf(result));
        createResult(Result);
        return Result.getResult();
    }

    @GetMapping("/minus/{a}/{b}")
    public String GetDifference(@PathVariable("a") double a,@PathVariable("b") double b ){
        double result = a - b;
        Base Result = new Base(String.valueOf(result));
        createResult(Result);
        return Result.getResult();
    }

    @GetMapping("/results")
    public List<Base> getAllResults(){
        return baseRepository.findAll();
    }

    public void createResult(@Valid @RequestBody Base result){
        baseRepository.save(result);
    }
}
