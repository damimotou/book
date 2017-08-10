package ua.mega.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;

import javax.annotation.Resource;

@Controller
public class ManageCustomersController 
{
	@Resource(name = "customerService")
	private CustomerManagementService customers;
	
	@RequestMapping("/all-customers")
	public ModelAndView displayAllCustomersOnWebPage()
	{
		List<Customer> allCustomers = customers.getAllCustomers();
		return new ModelAndView("/allCustomersJSPPage.jsp","customers", allCustomers);
	}
}
