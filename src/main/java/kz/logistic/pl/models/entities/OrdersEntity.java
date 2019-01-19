package kz.logistic.pl.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "orders")
public class OrdersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_id;
	@Column(name = "order_number")
	private Integer order_number;
	@Column(name = "product_id")
	private Integer product_id;
	@Column(name = "seller_company_id")
	private Integer seller_company_id;
	@Column(name = "order_date")
	private Date order_date;
	@Column(name = "product_count")
	private Integer product_count;
	@Column(name = "unit_price")
	private Integer unit_price;
	@Column(name = "total_price")
	private Integer total_price;
	@Column(name = "customer_id")
	private Integer customer_id;
	@Column(name = "delivering_status")
	private String delivering_status;

 }
