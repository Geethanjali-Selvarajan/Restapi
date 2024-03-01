package com.example.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.model.Medicine;
import com.example.day4.service.MedicineService;

@RestController
public class MedicineController {
    @Autowired
    MedicineService medicineService;

    @PostMapping("/api/medicine")
        public Medicine addMedicines(@RequestBody Medicine m)
        {
            return medicineService.addMedicine(m);
        }
    @GetMapping("/api/medicine")
    public List<Medicine> findMedicine()
    {
        return medicineService.getMedicine();
    }
    @GetMapping("/api/medicine2/{medicineId}")
        public Optional<Medicine> getMedicineById(@PathVariable Long medicineId)
        {
            return medicineService.getmedicineById(medicineId);
        }

    @PutMapping("/editmedicine/{medicineId}")
    public Medicine editMedicine(@PathVariable long medicineId,@RequestBody Medicine medicine)
    {
        return medicineService.editMedicine(medicineId, medicine);
    }
    @DeleteMapping("/deletemedicine/{medicineId}")
    public String deleteMedicine(@PathVariable Long medicineId)
    {
        return medicineService.deleteMedicine(medicineId);
    }
}
