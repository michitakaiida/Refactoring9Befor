package Null�I�u�W�F�N�g�̓���;

public class Site {
	Customer customer;

	public Customer getCustomer() {
		if (customer == null) {
			return Customer.newnull();
		} else {
			return customer;
		}
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
