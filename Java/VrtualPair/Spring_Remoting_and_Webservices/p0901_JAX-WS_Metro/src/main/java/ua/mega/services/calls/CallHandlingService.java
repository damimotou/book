package ua.mega.services.calls;

import java.util.Collection;

import ua.mega.domain.Action;
import ua.mega.domain.Call;
import ua.mega.services.customers.CustomerNotFoundException;

public interface CallHandlingService 
{
	// DO NOT IMPLEMENT THIS INTERFACE UNTIL A LATER CHAPTER!
	
	/**
	 * Records a call with the customer management service, and also records
	 * any actions in the diary service
	 */
	public void recordCall(String customerId, Call newCall, Collection<Action> actions) throws CustomerNotFoundException;
}
