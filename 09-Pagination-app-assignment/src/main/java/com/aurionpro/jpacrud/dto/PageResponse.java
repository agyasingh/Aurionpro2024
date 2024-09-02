package com.aurionpro.jpacrud.dto;

import java.util.List;

import com.aurionpro.jpacrud.entities.Client;

public class PageResponse {
	public int totalPages;
	public int totalElements;
	public int size;
	List<Client> content;

}
