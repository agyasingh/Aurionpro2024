package com.aurionpro.model;

import java.util.List;

import com.aurionpro.test.User;

public interface IBookNotifier {

public void notify(Library library, Book book, User user,String action);
}
