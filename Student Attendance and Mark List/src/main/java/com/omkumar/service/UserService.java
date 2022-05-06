package com.omkumar.service;

import com.omkumar.model.Student;

import java.util.List;

public interface UserService {

  int register(Student student);

  int addmark(Student student);

  List<Student> view();

  List<Student> viewgrade();

  Student validate(Student student);

  int present (Student student);

  int absent(Student student);



}
