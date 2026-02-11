package com.marvellous.dependancy_injection;

import org.springframework.stereotype.Component;

@Component
public class Harddisk
{
    public String HardiskDisplay()
    {
        return "Hardisk is of 512 GB";
    }
}
