package com.techelevator.dao;

import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
	
		List<Customer> matchingCustomers = new ArrayList<>();
        String orderByValue = "last_name";
        if(sort.equalsIgnoreCase("last_name") || sort.equalsIgnoreCase("email") || sort.equalsIgnoreCase("active")) {
        	orderByValue = sort;
        }
        
        String customerSearchSql = "SELECT first_name, last_name, email, active FROM customer WHERE first_name ILIKE ? OR last_name ILIKE ? ORDER BY " + orderByValue;
        SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search + "%", "%" + search + "%");
        while(results.next()) {
            matchingCustomers.add(mapRowToCustomers(results));
        }
        return matchingCustomers;
    }

	private Customer mapRowToCustomers(SqlRowSet results) {
        Customer customerRow = new Customer();
        customerRow.setFirstName(results.getString("first_name"));
        customerRow.setLastName(results.getString("last_name"));
        customerRow.setEmail(results.getString("email"));
        customerRow.setActive(results.getBoolean("active"));
       
        return customerRow;
	}
	  
}