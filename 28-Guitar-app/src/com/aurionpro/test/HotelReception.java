package com.aurionpro.test;

import com.aurionpro.model.IHotel;
import com.aurionpro.model.IMenu;
import com.aurionpro.model.IndianHotel;

public class HotelReception {

	

public void getIndianMenu() {
	IHotel indianHotel=new IndianHotel();
	IMenu menu=indianHotel.getMenu();
	menu.displayMenu();
}


}
