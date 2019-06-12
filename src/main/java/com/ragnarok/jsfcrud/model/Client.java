package com.ragnarok.jsfcrud.model;

import com.ragnarok.jsfcrud.model.common.Identifiable;

public class Client extends Identifiable
{

	private Hairdresser hairdresser;
	
	public Client(String dni, String name, String surname1, String surname2, int phone, String email)
	{
		super(dni, name, surname1, surname2, phone, email);
	}

	public Hairdresser getHairdresser()
	{
		return hairdresser;
	}

	public void setHairdresser(Hairdresser hairdresser)
	{
		this.hairdresser = hairdresser;
	}
	
}
