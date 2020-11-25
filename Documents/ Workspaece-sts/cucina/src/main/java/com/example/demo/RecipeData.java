package com.example.demo;

import javax.persistence.*;
import java.awt.*;
import java.awt.event.*;

@Entity
@Table
public class RecipeData {
@Id @GeneratedValue(strategy = GenerationType.AUTO)@Column
private long id;

@Column(length = 20,nullable = false)
private String name;

@Column(length = 200,nullable = false)
private String RecipeData;

public long getId() { return id; }
public void setId(long id) { this .id = id; }

public String getName() { return name; }
public void setName(String name) { this .name = name; }

public String getRecepiData() { return RecipeData; }
public void setRecipiData(String RecipeData) { this .RecipeData = RecipeData; }
}

