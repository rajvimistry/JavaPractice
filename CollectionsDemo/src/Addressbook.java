
/**
 * @author Rajvi
 *
 */
public interface Addressbook {

	/**
	 * @param address 
	 * @throws NullPointerException 
	 * @throws DuplicateAddressException 
	 * 
	 */
	public abstract void addNewAddress(SingleAddress address) throws DuplicateAddressException, NullPointerException;
	/**
	 * @param name  
	 * 
	 */
	public abstract void removeAddress(String name);
}
