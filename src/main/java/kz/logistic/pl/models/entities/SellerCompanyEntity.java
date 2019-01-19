package kz.logistic.pl.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "seller_company")
public class SellerCompanyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seller_company_id;
	@Column(name = "company_name_kk")
	private String company_name_kk;
	@Column(name = "company_name_ru")
	private String company_name_ru;
	@Column(name = "company_name_en")
	private String company_name_en;
	@Column(name = "phone")
	private String phone;
	@Column(name = "mobile_phone")
	private String mobile_phone;
	@Column(name = "bin")
	private String bin;
	@Column(name = "email")
	private String email;
	@Column(name = "seller_category_id")
	private Integer seller_category_id;
}
