package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookModel;

public interface IAddressBookService {
	public String getData();
	public AddressBookModel findById(String token);
	public List<AddressBookModel> getAll();
	public String addContact(AddressBookDTO dto);
    public String editContact(String token, AddressBookDTO dto);
	public String deleteContact(String token);
	public AddressBookModel getByEmail(String email);
}
