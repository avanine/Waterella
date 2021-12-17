package com.waterella.mdbspringboot.controller;

import com.waterella.mdbspringboot.model.ReadingTip;
import com.waterella.mdbspringboot.service.ReadingTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/readingTip")
@CrossOrigin
public class ReadingTipController {
    @Autowired
    private ReadingTipService ReadingTipService;

    @PostMapping("/add")
    public String add(@RequestBody ReadingTip ReadingTip){
        ReadingTipService.saveReadingTip(ReadingTip);
        return "New reading tip is added";
    }

    @GetMapping("/getAll")
    public List<ReadingTip> list(){
        return ReadingTipService.getAllTips();
    }
}