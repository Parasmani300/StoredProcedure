package com.parasmani_start.StoredProcedure.controller;

import com.parasmani_start.StoredProcedure.bean.SumInput;
import com.parasmani_start.StoredProcedure.dao.DBProcedureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/pcon")
public class ProcedureController {

    @Autowired
    DBProcedureDao dbProcedureDao;

    @GetMapping("/apt")
    public Integer getResult()
    {
        Integer ans = 0;
        return  ans;
    }

    @PostMapping("/apt")
    public Integer setResult(@RequestBody SumInput sumInput)
    {
        Integer ans = dbProcedureDao.getMyResponse(sumInput);
        return ans;
    }
}
