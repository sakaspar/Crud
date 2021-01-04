package com.viraj.sample.controller;

import com.viraj.sample.entity.Bag;
import com.viraj.sample.service.BagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Bag/")
public class BagController {

    @Autowired
    private BagService bagService;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot ffrom bag ";
    }

    @PostMapping("/save")
    public Bag saveEmployee(@RequestBody Bag bag) {

        return bagService.saveBag(bag);
    }

    @PutMapping("/update")
    public Bag updateBag(@RequestBody Bag bag) {
        return bagService.updateBag(bag);
    }

    @GetMapping("/getall")
    public List<Bag> getAllBags() {
        return bagService.getAllBags();
    }

    @GetMapping("/getone/{bagId}")
    public Bag getBag(@PathVariable(name = "bagId") Long bagId) {
        return bagService.getBag(bagId);
    }

    @DeleteMapping("/delete/{bagId}")
    public void deleteBag(@PathVariable(name = "bagId") Long bagId) {
        bagService.deleteBag(bagId);
    }
}
