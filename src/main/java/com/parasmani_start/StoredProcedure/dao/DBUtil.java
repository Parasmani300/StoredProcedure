package com.parasmani_start.StoredProcedure.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.Types;

@Repository
public class DBUtil {
    public SimpleJdbcCall getStoredProcedureSimpleJdbc(JdbcTemplate jdbcTemplate)
    {
        SimpleJdbcCall simpleJdbcCall;

        simpleJdbcCall  = new SimpleJdbcCall(jdbcTemplate)
                .withSchemaName("SYSTEM")
                .withProcedureName("PM_SUMMER")
                .declareParameters(
                       new SqlParameter("A", Types.INTEGER),
                        new SqlParameter("B",Types.INTEGER),
                        new SqlInOutParameter("TOT",Types.INTEGER)
                );
        return simpleJdbcCall;
    }
}
