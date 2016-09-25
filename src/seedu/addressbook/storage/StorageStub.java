package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub extends Storage{

	@Override
	public void save(AddressBook addressBook) throws StorageOperationException {
		// TODO Auto-generated method stub
	}

	@Override
	public AddressBook load() throws StorageOperationException {
		// TODO Auto-generated method stub
		return new AddressBook();
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return "";
	}

}
