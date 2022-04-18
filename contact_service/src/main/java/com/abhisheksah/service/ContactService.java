package com.abhisheksah.service;

import java.util.List;

import com.abhisheksah.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsofUser(int userId);
}
