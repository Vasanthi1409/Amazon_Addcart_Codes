package miniproject_RunnerClass.com;

import java.io.IOException;

import org.openqa.selenium.By;

import miniproject.com.Amazon_Baseclass;
import miniproject.com.Amazon_Pomclass_AddtoCart;
import miniproject.com.Amazon_Pomclass_Login;
import miniproject.com.Amazon_Pomclass_Product_1;
import miniproject.com.Amazon_Pomclass_Product_2;
import miniproject.com.Amazon_Pomclass_Search;
import miniproject.com.Cart_Page;
import miniproject.com.Close_Addcart;

public class Runner_Class extends Amazon_Baseclass{

	public static void main(String[] args) throws IOException {

		browser_Launch("Chrome");
		geturl("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		Amazon_Pomclass_Login login = new Amazon_Pomclass_Login(driver);
		sendkeys(login.getUsername(), "harishvasanthi1409@gmail.com");
		sendkeys(login.getPassword(), "vasanthiharish");
		click(login.getSubmit());
		
//		wait(driver, 80);
		
		Amazon_Pomclass_Search search = new Amazon_Pomclass_Search(driver);
		sendkeys(search.getSearchbox(), "OnePlus 12");
		click(search.getSearchbutton());
		
		wait(driver, 50);
		
		Amazon_Pomclass_Product_1 pro1 = new Amazon_Pomclass_Product_1(driver);
		click(pro1.getProduct_1());
		
		window_Handling();
		
		wait(driver, 40);
		
		Amazon_Pomclass_AddtoCart AC = new Amazon_Pomclass_AddtoCart(driver);
		click(AC.getAddtocart());
		
		Close_Addcart Close = new Close_Addcart(driver);
		click(Close.getCloseaddcart());
		
		clear(search.getSearchbox());
		
		wait(driver, 40);
		
		sendkeys(search.getSearchbox(), "IQOO Z7");
		click(search.getSearchbutton());
		
		wait(driver, 60);
		
		Amazon_Pomclass_Product_2 pro2 = new Amazon_Pomclass_Product_2(driver);
//		actions(driver, pro2.getProduct_2());
		click(pro2.getProduct_2());
		
//		click(AC.getAddtocart());
//		click(Close.getCloseaddcart()); nav-cart-count 
		
		Cart_Page cart = new Cart_Page(driver);
		click(cart.getCart());
		
		scrnshot(driver);
		
	}
}
