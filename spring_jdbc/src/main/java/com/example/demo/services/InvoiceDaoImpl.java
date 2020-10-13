package com.example.demo.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;


@Repository
public class InvoiceDaoImpl implements InvoiceDAO {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public Collection<Invoice> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Invoice> sortByInvoiceNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Invoice> sortBy(String propName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Invoice entity) {
		// TODO Auto-generated method stub
		
		String sql="insert into invoice values(?,?,?)";
		
		int rowAdded=this.template.update(sql,entity.getInvoiceNumber()
				,entity.getCustomerName()
				,entity.getAmount());
		
		return rowAdded==1?true:false;
	}

	@Override
	public boolean add(Invoice... invoices) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Invoice findById(int id) {
		// TODO Auto-generated method stub
		
		String sql="select * from invoice where invoiceNumber=?";
		
		return this.template.queryForObject
				(sql, new BeanPropertyRowMapper<Invoice>(Invoice.class),id);
		
	}

	@Override
	public boolean remove(Invoice entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Invoice oldEntity, Invoice newEntity) {
		// TODO Auto-generated method stub
		return false;
	}

}
