package com.aurionpro.jpacrud.dto;

import java.util.List;

import com.aurionpro.jpacrud.entities.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class PageResponse<T> {
public int totalPages;
public int totalelements;
public int size;
List<Employee> content;
private boolean isLastPage;
}