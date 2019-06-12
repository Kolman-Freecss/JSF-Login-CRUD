package com.ragnarok.jsfcrud.model;

import java.util.ArrayList;
import java.util.List;

import com.ragnarok.jsfcrud.model.common.Identifiable;

public class Hairdresser extends Identifiable
{

	private List<Client> clientList;

	public Hairdresser(String dni, String name, String surname1, String surname2, int phone, String email)
	{
		super(dni, name, surname1, surname2, phone, email);
		this.clientList = new ArrayList<Client>();
	}

	public List<Client> getClientList()
	{
		return clientList;
	}

	public void setClientList(List<Client> clientList)
	{
		this.clientList = clientList;
	}
	
}
