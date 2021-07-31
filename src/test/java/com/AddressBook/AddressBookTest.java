package com.AddressBook;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AddressBookTest {

	static AddressBookService addressBookService;
	@Test
	public void givenAddressBookContactsInList_WhenRetrieved_ShouldMatchContactsCount() {
		AddressBookService addressBookService = new AddressBookService();
		List<AddressBookData> addressBookData = addressBookService.personList;
		Assert.assertEquals(1, addressBookData.size());
	}
}
