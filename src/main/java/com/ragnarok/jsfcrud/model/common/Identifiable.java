package com.ragnarok.jsfcrud.model.common;

public abstract class Identifiable
{
	private String dni;
	private String name;
	private String surname1;
	private String surname2;
	private int phone;
	private String email;
	
	public Identifiable(String dni, String name, String surname1, String surname2, int phone, String email)
	{
		super();
		this.dni = dni;
		this.name = name;
		this.surname1 = surname1;
		this.surname2 = surname2;
		this.phone = phone;
		this.email = email;
	}

	public String getDni()
	{
		return dni;
	}

	public int getPhone()
	{
		return phone;
	}

	public void setPhone(int phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname1()
	{
		return surname1;
	}

	public void setSurname1(String surname1)
	{
		this.surname1 = surname1;
	}

	public String getSurname2()
	{
		return surname2;
	}

	public void setSurname2(String surname2)
	{
		this.surname2 = surname2;
	}

}
