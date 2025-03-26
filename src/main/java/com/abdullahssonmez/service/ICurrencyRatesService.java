package com.abdullahssonmez.service;

import com.abdullahssonmez.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService {

	public CurrencyRatesResponse getCurrencyRates(String startDate , String endDate);
}
