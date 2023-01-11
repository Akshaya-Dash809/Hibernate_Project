package com.OneToMany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="cart")

public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int cart_id;
private String name;

@OneToMany(cascade=CascadeType.ALL)

@JoinColumn(name="cid")
private List<Items>item;
}
