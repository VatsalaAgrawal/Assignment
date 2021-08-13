package com.techment.Assignment3OOPS;

class Addressnew  { 
	private String Addressline; 
	private String City;  	 
 	public Addressnew(String addressline, String city) { 
 		super(); 
 		setAddressline(addressline); 
 		setCity(city); 
 	}
 
 	public String getAddressline() { 
 		return Addressline; 
 	} 
 	public void setAddressline(String addressline) { 
 		Addressline = addressline; 
 	} 
 	public String getCity() { 
 		return City; 
 	} 
 	public void setCity(String city) { 
 		City = city; 
 	} 
 	public void getAddressDetails() 
 	{ 
		System.out.print(getAddressline() + " , "+getCity()); 
 	} 
}

class Customernew 
 { 
	private String customerName ; 
	private Addressnew residentialAddress ; 
 	private Addressnew OfficialAddress; 
	 	 
 	public Addressnew getOfficialAddress() { 
 		return OfficialAddress; 
	}
	 
 	public void setOfficialAddress(Addressnew officialAddress) { 
			OfficialAddress = officialAddress; 
	} 
	 
	 	public String getCustomerName() { 
	 		return customerName; 
	 	} 
	 	 
	 	public void setCustomerName(String customerName) { 
	 		this.customerName = customerName; 
	 	} 
	 	 
	 	public Addressnew getResidentialAddress() { 
	 		return residentialAddress; 
	 	} 
	 	 
	 	public void setResidentialAddress(Addressnew residentialAddress) { 
	 		this.residentialAddress = residentialAddress; 
	 	} 
@Override
	public String toString() {
		return "Customernew [customerName=" + customerName + ", residentialAddress=" + residentialAddress
				+ ", OfficialAddress=" + OfficialAddress + "]";
	}
public void getCustomerDetails (Customernew residentialAddress ) { 
	System.out.println("Customer : "+customerName); 
 		System.out.println("Residential Address : " + residentialAddress.getResidentialAddress().getAddressline() + ", Official Address "+ residentialAddress.getOfficialAddress().getCity() ); 
 	} 
 	public Customernew(String customerName, Addressnew residentialAddress ,Addressnew OfficialAddress) { 
 		super(); 
 		this.customerName = customerName; 
 		this.residentialAddress = (Addressnew) residentialAddress; 
		this.OfficialAddress=(Addressnew) OfficialAddress; 
}
 }




public class AggregationEncapsulation1 {

	public static void main(String[] args) {
		Addressnew residAddress = new Addressnew("Ist Main Electronics City , Complex", "Banglore"); 
			Addressnew offAddress = new Addressnew("Nehru Nagar", "Bhilai"); 
				Customernew customer = new Customernew("Rohan", residAddress, offAddress); 
				customer.getCustomerDetails(customer); 
				
		
		 


	}

}
