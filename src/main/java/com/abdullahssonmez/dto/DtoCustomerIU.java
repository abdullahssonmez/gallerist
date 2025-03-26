package com.abdullahssonmez.dto;

import java.util.Date;

import com.abdullahssonmez.model.Account;
import com.abdullahssonmez.model.Address;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoCustomerIU {

	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String tckn;
	
	@NotNull
	private Date birthOfDate;
	
	@NotNull
	private Long addressId;
	
	@NotNull
	private Long  accountId;
}
