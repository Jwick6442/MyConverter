package com.example.myconverter.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.myconverter.bus.ExchangeImpl;
import com.example.myconverter.model.Currency;

@WebService
public class MyconverterServices {
	ExchangeImpl cc = new ExchangeImpl();
	
	@WebMethod
	public ArrayList<Currency> getCurrencyResult (String denomination) {
		return cc.getCurrencyResult(denomination);
	}
}
