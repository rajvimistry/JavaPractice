
/**
 * @author Rajvi
 *
 */
public class TestAddressBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println("Main Method");
		
			SingleAddress temp1 = new SingleAddress("Rajvi","Mistry","Naranpura","Ahmedabad","Gujarat","India",380013);
			SingleAddress temp2 = new SingleAddress("Tasleem","Mistry","Naranpura","Ahmedabad","Gujarat","India",380013);
			SingleAddress temp3 = new SingleAddress("Neha","Mistry","Naranpura","Ahmedabad","Gujarat","India",380013);
			SingleAddress temp4 = new SingleAddress("Shweta","Mistry","Naranpura","Ahmedabad","Gujarat","India",380013);
			SingleAddress temp5 = new SingleAddress("Nihar","Mistry","Naranpura","Ahmedabad","Gujarat","India",380013);
			SingleAddress temp6 = new SingleAddress("Raj","Mistry","Naranpura","Ahmedabad","Gujarat","India",380013);
			AddressbookImpl address = new AddressbookImpl();
			try {
				address.addNewAddress(temp1);
				address.addNewAddress(temp2);
				address.addNewAddress(temp3);
				address.addNewAddress(temp4);
				address.addNewAddress(temp5);
				address.addNewAddress(temp6);
			} catch (NullPointerException | DuplicateAddressException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
			//System.out.println("*****************************");
			address.display();
			//System.out.println("*****************************");
			
			address.removeAddress("Rajvi");
			System.out.println("\n\n\nAfter deleting value");
			address.display();
		}

}
