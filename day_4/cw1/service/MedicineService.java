package com.example.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.model.Medicine;
import com.example.day4.repository.MedicineRepo;

@Service
public class MedicineService {
    
    @Autowired
    MedicineRepo medicineRepo;
    public Medicine addMedicine(Medicine m)
    {
        return medicineRepo.save(m);
    }
    public List<Medicine> getMedicine()
    {
        return medicineRepo.findAll();
    }
    public Optional<Medicine> getmedicineById(Long id)
    {
        return medicineRepo.findById(id);
    }

    public Medicine editMedicine(Long medicineId,Medicine medicine)
    {
        Medicine mediAvail=medicineRepo.findById(medicineId).orElse(null);
        if(mediAvail!=null)
        {
            mediAvail.setMedicineName(medicine.getMedicineName());
            mediAvail.setMedicineFor(medicine.getMedicineFor());
            mediAvail.setMedicineBrand(medicine.getMedicineBrand());
            mediAvail.setManufacturedIn(medicine.getManufacturedIn());
            mediAvail.setMedicinePrice(medicine.getMedicinePrice());
            mediAvail.setExpiryDate(medicine.getExpiryDate());

            return medicineRepo.saveAndFlush(mediAvail);
        }
        else
        {
            return null;
        }
    }
    public String deleteMedicine(Long medicineId)
    {
        medicineRepo.deleteById(medicineId);
        return("userdeleted");
    }
}
