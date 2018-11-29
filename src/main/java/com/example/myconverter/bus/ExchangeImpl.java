package com.example.myconverter.bus;

import com.example.myconverter.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;
import com.example.myconverter.model.*;


public class ExchangeImpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Currency> list;
	
	public ExchangeImpl() {
		Currency ringgitMalaysia= new Currency( "LKR", 42.9546);
		Currency ringgitMalaysia1 = new Currency( "EUR", 0.209793);
		Currency ringgitMalaysia2 = new Currency( "GBP",0.186915);
		
		list = new ArrayList<>();
		list.add(ringgitMalaysia);
		list.add(ringgitMalaysia1);
		list.add(ringgitMalaysia2);
		currenciesMap.put("RM", list);
		
		Currency colombianPeso= new Currency( "CAD",0.000410042);
		Currency colombianPeso1 = new Currency( "BAM", 0.000530463);
		Currency colombianPeso2 = new Currency( "BRL", 0.00118913);
		
		list = new ArrayList<>();
		list.add(colombianPeso);
		list.add(colombianPeso1);
		list.add(colombianPeso2);
		currenciesMap.put("COP", list);
		
		Currency britishPound= new Currency( "EGP", 22.9117);
		Currency britishPound1 = new Currency( "BDT", 107.172);
		Currency britishPound2 = new Currency( "COP", 4141.76);
		
		list = new ArrayList<>();
		list.add(britishPound);
		list.add(britishPound1);
		list.add(britishPound2);
		currenciesMap.put("GBP", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}


}
