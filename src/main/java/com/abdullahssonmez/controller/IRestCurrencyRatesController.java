package com.abdullahssonmez.controller;

import com.abdullahssonmez.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {

	public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate , String endDate);
}
