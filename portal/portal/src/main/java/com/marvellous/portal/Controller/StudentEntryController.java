package com.marvellous.portal.Controller;

import com.marvellous.portal.Entity.StudentEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentEntryController
{
    private Map<Long, StudentEntry> studententries = new HashMap<>();

    // select * from students
    @GetMapping
    public List<StudentEntry> getAll()
    {
        return new ArrayList<>(studententries.values());
    }

    // select * from students where Rno = 3
    @GetMapping("/rno/{myrno}")
    public StudentEntry getStudentEntryById(@PathVariable Long myrno)
    {
        return studententries.get(myrno);
    }

    // select * from students where Name = "Amit";
    @GetMapping("/name/{myname}")
    public StudentEntry getStudentEntryByName(@PathVariable String myname)
    {
        return studententries.get(myname);
    }

    // insert into students values(11,Amit,Pune,87)
    @PostMapping
    public String createEntry(@RequestBody StudentEntry myentry)
    {
        studententries.put(myentry.getRno(),myentry);
        return "Data inserted succesfully";
    }

    // delete from students where rno = 12;
    @DeleteMapping("/rno/{myrno}")
    public StudentEntry deleteEntryById(@PathVariable Long myrno)
    {
        return studententries.remove(myrno);
    }

    // update students set marks = 91 where rno = 12;
    @PutMapping("/rno/{myrno}")
    public StudentEntry updateEntryById(@PathVariable Long myrno, @RequestBody StudentEntry myentry)
    {
        return studententries.put(myentry.getRno(), myentry);
    }
}
