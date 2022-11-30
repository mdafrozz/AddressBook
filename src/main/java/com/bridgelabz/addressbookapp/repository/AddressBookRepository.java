package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.AddressBookModel;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookModel, Integer>{
	@Query(value = "select * from addressbook where email = :email",nativeQuery = true)
	AddressBookModel findByEmail(String email);

}
