package com.marvellous.dependancy_injection;

import org.springframework.stereotype.Component;

@Component
public class RAM
{
    public String RamDisplay()
    {
        return "RAM is of 16 GB";
    }
}
