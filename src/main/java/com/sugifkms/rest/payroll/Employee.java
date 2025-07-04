package com.sugifkms.rest.payroll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Employee {

  private @Id
  @GeneratedValue Long id;
  private String name;
  private String role;
  private String deposit;
  private String solanceFrom;
  private String SolanceTo;
  private String amountSell;
  private String timePlaced;
  private String befeficiary;
  private String country;
  private String paymentRef;
  private String purposeRef;


  Employee(String name, String role, String deposit) {
    this.name = name;
    this.role = role;
    this.deposit = deposit;
    this.solanceFrom = "EUR";
    this.SolanceTo = "GBP";
    this.amountSell = "1000";
    this.timePlaced = "747.10";
    this.befeficiary = "NEOBANK1451232332232";
    this.country = "IRL";
    this.paymentRef = "Invoice #12345";
    this.purposeRef = "Invoice payment";  
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getRole() {
    return this.role;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  public String getDeposit() {
    return this.deposit;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
        && Objects.equals(this.role, employee.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.role);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
  }
}
