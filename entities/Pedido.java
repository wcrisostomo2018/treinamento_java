package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Pedido {
	private Integer id;
	private Date instante;
	private OrderStatus status;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date instante, OrderStatus status) {
		super();
		this.id = id;
		this.instante = instante;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", instante=" + instante + ", status=" + status + "]";
	}
	
	
	
	
}
