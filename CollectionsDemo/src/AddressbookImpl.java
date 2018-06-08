import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Rajvi
 *
 */
public class AddressbookImpl extends DuplicateAddressException implements Addressbook{

	private Set<SingleAddress> addressList;
	
	/**
	 * 
	 */
	public AddressbookImpl() {
		addressList = new HashSet<SingleAddress>();
	}
	
	/**
	 * @param message
	 */
	public AddressbookImpl(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addNewAddress(SingleAddress address) throws DuplicateAddressException, NullPointerException{
		// TODO Auto-generated method stub
		if(address == null) {
			throw new NullPointerException("Enter valid data");
		}
		boolean isThere = addressList.add(address);
		if(isThere == false) {
			throw new DuplicateAddressException("Record Existed");
		}
		
	}

	@Override
	public void removeAddress(String name) {
		Iterator<SingleAddress> iterator = addressList.iterator();
		while(iterator.hasNext()) {
			SingleAddress add = iterator.next();
			if(name.equals(add.getFirstName())) {
				iterator.remove();
			}
		}
	}
	
	/**
	 * 
	 */
	public void display() {
		Iterator iterator = addressList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
