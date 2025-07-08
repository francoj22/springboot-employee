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
  private String balanceFrom;
  private String balanceTo;
  private String amountSell;
  private String timePlaced;
  private String beneficiary;
  private String country;
  private String paymentRef;
  private String purposeRef;

  Employee() {} // JPA requires default constructor

  Employee(String name, String role, String deposit) {
    this.name = name;
    this.role = role;
    this.deposit = deposit;
    this.balanceFrom = "EUR";
    this.balanceTo = "GBP";
    this.amountSell = "1000";
    this.timePlaced = "747.10";
    this.beneficiary = "NEOBANK1451232332232";
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

  public String getDeposit() {
    return this.deposit;
  }

  public String getBalanceFrom() {
    return this.balanceFrom;
  }

  public String getBalanceTo() {
    return this.balanceTo;
  }

  public String getAmountSell() {
    return this.amountSell;
  }

  public String getTimePlaced() {
    return this.timePlaced;
  }

  public String getBeneficiary() {
    return this.beneficiary;
  }

  public String getCountry() {
    return this.country;
  }

  public String getPaymentRef() {
    return this.paymentRef;
  }

  public String getPurposeRef() {
    return this.purposeRef;
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

  public void setBalanceFrom(String balanceFrom) {
    this.balanceFrom = balanceFrom;
  }

  public void setBalanceTo(String balanceTo) {
    this.balanceTo = balanceTo;
  }

  public void setAmountSell(String amountSell) {
    this.amountSell = amountSell;
  }

  public void setTimePlaced(String timePlaced) {
    this.timePlaced = timePlaced;
  }

  public void setBeneficiary(String beneficiary) {
    this.beneficiary = beneficiary;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setPaymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
  }

  public void setPurposeRef(String purposeRef) {
    this.purposeRef = purposeRef;
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
