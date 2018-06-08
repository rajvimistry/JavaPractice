
/**
 * @author Rajvi
 *
 */
public class SingleAddress {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private long postalCode;
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param country
	 * @param postalCode
	 */
	public SingleAddress(String firstName, String lastName, String streetAddress, String city, String state,
			String country, long postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
	}
	
	


	/**
	 * @return string
	 */
	public String getFirstName() {
		return firstName;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SingleAddress other = (SingleAddress) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "SingleAddress [firstName=" + firstName + ", lastName=" + lastName + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", postalCode=" + postalCode + "]";
	}

}
