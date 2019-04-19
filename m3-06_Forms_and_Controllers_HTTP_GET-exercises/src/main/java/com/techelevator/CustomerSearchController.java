package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/customerList")
	public String showCustomerSearchForm() {
		return "customerList";
	}
    
    @RequestMapping("/customerListResult")
	public String searchCustomers(HttpServletRequest request) {

		String customerName = request.getParameter("customerName");
		String sort = request.getParameter("sort");
		
		List<Customer> customers = customerDao.searchAndSortCustomers(customerName, sort);
		request.setAttribute("customers", customers);

		return "customerList";
	}
}