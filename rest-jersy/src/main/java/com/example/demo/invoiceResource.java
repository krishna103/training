package com.example.demo;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.services.InvoiceService;
import com.training.model.Invoice;

@Path("invoices")
public class invoiceResource {

	private static InvoiceService service=new InvoiceService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInvoice()
	{
		Map<Integer,Invoice> invList=service.findAll();
		return Response.status(200).entity(invList).build();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addInvoice(Invoice inv)
	{
		Invoice invAdded=service.add(inv);
		return Response.status(201).entity(invAdded).build();
	}
	
	@GET
	@Path("/byId/{Id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInvoiceById(@PathParam("Id") int key)
	{
		
		Invoice inv= service.findById(key);
		return Response.status(200).entity(inv).build();
	}
	
	@DELETE
	@Path("{Id}")
	public Response removeInvoiceById(@PathParam("Id") int key)
	{
		Invoice entity=service.removeById(key);
		return Response.status(204).entity(entity).build();
	}
	
	
	@PUT
	public Response updateInvoice()
	{
		return null;
	}
}
