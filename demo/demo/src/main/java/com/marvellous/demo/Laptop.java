package com.marvellous.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    private final HDD hobj;
    private final Microprocessor mobj;

    @Autowired
    public Laptop(HDD hobj, Microprocessor mobj)
    {
        this.hobj = hobj;
        this.mobj = mobj;
    }


    @GetMapping("Display")
    public String LaptopInformaton()
    {
        return hobj.HDDInforamation() + " | " + mobj.MicroprocessorInformation();
    }
}
