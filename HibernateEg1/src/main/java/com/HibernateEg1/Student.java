package com.HibernateEg1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Entity - This annotation specifies that the class is an entity.
//@Table - This annotation specifies the table in the database with which this entity
//@Id - This annotation specifies the primary key of the entity
@Getter
@Setter
@Entity //marking this class as entity
//specifies the table name where data of this entity is to be persisted.
@Table(name="Student_info")
public class Student 
{
	@Id //Marks identifier of class
	private int StuId;
	private String stuFirstName,stuLastName,stuEmail,stuAddr;
	private double stuFee;
	private long stuPhone;
}