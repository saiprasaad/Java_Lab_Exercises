package daytwentytwo;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) throws ParseException {
		CustomerMasterDTO customermasterdto=new CustomerMasterDTO();
		customermasterdto.setCustomerno(3);
		customermasterdto.setCustomeraddress("tiruvallur");
		customermasterdto.setCustomeremail("drvrohith11@gmail.com");
		customermasterdto.setCustomername("rohith");
		customermasterdto.setCustomerphone("9080268964");
		CustomerMasterDAOImpl customermasterdaoimpl=new CustomerMasterDAOImpl(DBUtility.getConnection());
		customermasterdaoimpl.insertCustomer(customermasterdto);
		Set<CustomerMasterDTO> customerdetails=new HashSet<CustomerMasterDTO>();
		customerdetails=customermasterdaoimpl.getCustomerMasterAll();
		System.out.println(customerdetails);
		System.out.println(customermasterdaoimpl.getCustomerMaster(1));
		CustomerMasterDTO customermasterdtoupdate=new CustomerMasterDTO();
		customermasterdtoupdate.setCustomerno(2);
		customermasterdtoupdate.setCustomername("vignesh");
		customermasterdtoupdate.setCustomerphone("9876543210");
		customermasterdtoupdate.setCustomeraddress("hyderabad");
		customermasterdtoupdate.setCustomeremail("vicky241299@gmail.com");
		customermasterdaoimpl.updateCustomer(customermasterdtoupdate);
		customermasterdaoimpl.deleteCustomer(3);
		System.out.println("-----------------------");
		InvoiceMasterDTO invoicemasterdto=new InvoiceMasterDTO();
		invoicemasterdto.setCustomerno(3);
		invoicemasterdto.setInvdate("2021-03-14");
		invoicemasterdto.setInvno(103);
		InvoiceMasterDAOImpl invoicemasterdaoimpl=new InvoiceMasterDAOImpl(DBUtility.getConnection());
		invoicemasterdaoimpl.insertInvoice(invoicemasterdto);
		Set<InvoiceMasterDTO> invoicedetails=new HashSet<InvoiceMasterDTO>();
		invoicedetails=invoicemasterdaoimpl.getInvoiceMasterAll();
		System.out.println(invoicedetails);
		System.out.println(invoicemasterdaoimpl.getInvoiceMaster(101));
		InvoiceMasterDTO invoicemasterdtoupdate=new InvoiceMasterDTO();
		invoicemasterdtoupdate.setInvno(103);
		invoicemasterdtoupdate.setInvdate("2021-03-12");
		invoicemasterdaoimpl.updateInvoice(invoicemasterdtoupdate);
		invoicemasterdaoimpl.deleteInvoice(103);
		System.out.println("--------------------");
		ItemMasterDTO itemmasterdto=new ItemMasterDTO();
		itemmasterdto.setItemno(1003);
		itemmasterdto.setItemdescription("MilkBikis");
		itemmasterdto.setItemprice(10);
		itemmasterdto.setItemunit("1 pkt");
		ItemMasterDAOImpl itemmasterdaoimpl=new ItemMasterDAOImpl(DBUtility.getConnection());
//		itemmasterdaoimpl.insertItemDetails(itemmasterdto);
		Set<ItemMasterDTO> itemdetails=new HashSet<ItemMasterDTO>();
		itemdetails=itemmasterdaoimpl.getItemMasterAll();
		System.out.println(itemdetails);
		System.out.println(itemmasterdaoimpl.getItemMaster(1001));
		ItemMasterDTO itemmasterdtoupdate=new ItemMasterDTO();
		itemmasterdtoupdate.setItemdescription("Parle - G");
		itemmasterdtoupdate.setItemno(1003);
		itemmasterdaoimpl.updateItemDetails(itemmasterdtoupdate);
		itemmasterdaoimpl.deleteItemDetails(1003);
		System.out.println("--------------------");
		ItemTransactionMasterDTO itemtransactionmasterdto=new ItemTransactionMasterDTO();
		itemtransactionmasterdto.setItemno(1003);
		itemtransactionmasterdto.setInvno(103);
		itemtransactionmasterdto.setItemqty(2);
		ItemTransactionMasterDAOImpl itemtransactionmasterdaoimpl=new ItemTransactionMasterDAOImpl(DBUtility.getConnection());
//		itemtransactionmasterdaoimpl.insertItem(itemtransactionmasterdto);
		Set<ItemTransactionMasterDTO> itemtransactiondetails=new HashSet<ItemTransactionMasterDTO>();
		itemtransactiondetails=itemtransactionmasterdaoimpl.getItemTransactionMasterAll();
		System.out.println(itemtransactiondetails);
		System.out.println(itemtransactionmasterdaoimpl.getItemTransactionMaster(101, 1001));
		ItemTransactionMasterDTO itemtransactionmasterdtoupdate=new ItemTransactionMasterDTO();
		itemtransactionmasterdtoupdate.setInvno(103);
		itemtransactionmasterdtoupdate.setItemno(1003);
		itemtransactionmasterdtoupdate.setItemqty(1);
		itemtransactionmasterdaoimpl.updateItem(itemtransactionmasterdtoupdate);
		itemtransactionmasterdaoimpl.deleteItem(103, 1003);
		DBUtility.closeConnection(null);
	}
}