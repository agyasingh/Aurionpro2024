package com.aurionpro.jpacrud.dto;

import java.util.List;

import com.aurionpro.jpacrud.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PageResponse<T> {
public int totalPages;
public int totalelements;
public int size;
List<Student> content;
private boolean isLastPage;
}
