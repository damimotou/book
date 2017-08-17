package ua.mega.services.customers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="The customer wasn't found")
public class CustomerNotFoundException extends Exception {
    // I've added this just to stop the annoying warning in Eclipse.
    private static final long serialVersionUID = 1L;
}
