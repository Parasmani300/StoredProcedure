package com.parasmani_start.StoredProcedure.dao;

import com.parasmani_start.StoredProcedure.bean.SumInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("DBProcedureDao")
public class DBProcedureDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DBUtil dbUtil;

    public Integer getMyResponse(SumInput sumInput)
    {
        try{
            SimpleJdbcCall simpleJdbcCall = dbUtil.getStoredProcedureSimpleJdbc(jdbcTemplate);
            Map<String,Object> params = new HashMap<>();
            params.put("A",sumInput.getA() != null?sumInput.getA():1);
            params.put("B",sumInput.getB() != null?sumInput.getB():3);
            params.put("TOT",0);
            Map<String,Object> out = simpleJdbcCall.execute(params);
            for(String name : out.keySet())
            {
                String key = name;
                String value = (String) "" + out.get(name);
                return  Integer.parseInt(value);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return  0;
    }
}
