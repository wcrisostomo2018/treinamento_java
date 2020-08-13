package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.OrderStatus;

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido ped = new Pedido(1080,new Date(),OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(ped);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		
			
		}
	}


