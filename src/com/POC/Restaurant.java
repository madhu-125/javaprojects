package com.POC;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		System.out.println("Welcome the Madhu Restuarant.");
		System.out.println("******************************");
		System.out.println("Veg Items List");

		System.out.println("1 .   Paneer Tikka       -->   ₹220");
		System.out.println("2 .   Shahi Paneer       -->	  ₹240");
		System.out.println("3 .   Aloo Gobi          -->	  ₹170");
		System.out.println("4 .   Veg Biryani        -->	  ₹250");
		System.out.println("5 .   Palak Paneer       -->	  ₹250");
		System.out.println("6 .  Hakka Noodles      -->	  ₹180");
		System.out.println("7 .  Masala Dosa        -->	  ₹140");
		System.out.println("8 .  onino Dosa         -->	  ₹100");
		System.out.println("9 . Veg Manchurian     -->	  ₹200");

		System.out.println("____________________________________________");

		System.out.println("Non-Veg Items List");

		System.out.println("1 .   Chicken Tikka        -->   ₹280");
		System.out.println("2 .   Chicken Curry        -->   ₹250");
		System.out.println("3 .   Butter Chicken       -->   ₹300");
		System.out.println("4 .   Chicken Biryani      -->   ₹380");
		System.out.println("5 .   Egg Biryani          -->   ₹220");
		System.out.println("6 .   Fish Curry           -->   ₹300");
		System.out.println("7 .  Fish Fry             -->   ₹280");
		System.out.println("8 .  Chicken Hakka Noodles -->  ₹220");
		System.out.println("9 .  Chicken Manchurian   -->   ₹250");
		System.out.println("10 .  Chicken Kebab        -->   ₹260");

		System.out.println("____________________________________________");

		System.out.println("Drink Items List");

		System.out.println("1 .  Filter Coffee          --> ₹40");
		System.out.println("2 .  Sweet Lassi            --> ₹70");
		System.out.println("3 .  Mango Lassi            --> ₹90");
		System.out.println("4 .  Fresh Lime Soda        --> ₹50");
		System.out.println("5 .  Buttermilk             --> ₹35");
		System.out.println("6 .  Cold Coffee            --> ₹100");
		System.out.println("7 .  Mango Juice            --> ₹80");

		System.out.println("____________________________________________");

		System.out.println("Veg Starters Items List");

		// Veg Starters
		System.out.println("1 .  Vegetable Samosa     -->  ₹50");
		System.out.println("2 .  Chill Paneer         -->  ₹320");
		System.out.println("3 .  Veg Spring Rolls     -->  ₹160");
		System.out.println("4 .  Paneer 65            -->  ₹320");
		System.out.println("5 .  Gobi Manchurian      -->  ₹190");

		System.out.println("Non_Veg Starters Items List");
		// Non-Veg Starters
		System.out.println("6 .  Chill Chicken         -->  ₹260");
		System.out.println("7.   Chicken 65            -->  ₹240");
		System.out.println("8.  Tandoori Chicken       -->  ₹320");
		System.out.println("9.  Chicken Seekh Kebab    -->  ₹280");
		System.out.println("10.  Apollo Fish           -->  ₹390");

		System.out.println("____________________________________________");

		double Veg_total_bill = 0;
		double non_Veg_total_bill = 0;
		double drink_total_bill = 0;
		double staters_total_bill = 0;
		double Total_bill = 0;
		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Catgory like Veg , Non_veg , Starter , and drink.");
			System.out.println("***************************************************************");
			String catg = sc.next();
			switch (catg) {
			case "veg" -> {
				String vyn = "";

				do {
					System.out.println(
							"Enter your veg Order like this 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9  that all only. ");
					String v_item = sc.next();

					switch (v_item) {

					case "1" -> {
						System.out.println(" Your Order is Paneer Tikka.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vp_bill = 220 * quantity;

//						calculate the total bill Panner Tikka with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Paneer Tikka bill : " + vp_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vp_bill;
					}
					case "2" -> {
						System.out.println(" Your Order is Shahi Paneer.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vsp_bill = 240 * quantity;
//						calculate the total bill Shahi Panner with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Shahi Paneer bill : " + vsp_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vsp_bill;
					}
					case "3" -> {
						System.out.println(" Your Order is Aloo Gobi.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double va_bill = 170 * quantity;

//						calculate the total bill Aloo Gobi with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Aloo Gobi bill : " + va_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += va_bill;
					}
					case "4" -> {
						System.out.println(" Your Order is Veg Biryani.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vvb_bill = 250 * quantity;

//						calculate the total bill Veg Biryani with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Veg Biryani bill : " + vvb_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vvb_bill;
					}
					case "5" -> {
						System.out.println(" Your Order is Palak Paneer.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vpp_bill = 250 * quantity;

//						calculate the total bill Palak Panner with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Palak Paneer bill : " + vpp_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vpp_bill;
					}
					case "6" -> {
						System.out.println(" Your Order is Hakka Noodles.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vh_bill = 180 * quantity;

//						calculate the total bill Hakka Noodles with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Hakka Noodles bill : " + vh_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vh_bill;
					}
					case "7" -> {
						System.out.println(" Your Order is Masala Dosa.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vmd_bill = 140 * quantity;

//						calculate the total bill Masala Dosa with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Masala Dosa bill : " + vmd_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vmd_bill;
					}
					case "8" -> {
						System.out.println(" Your Order is onion Dosa.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vod_bill = 100 * quantity;

//						calculate the total bill Onion Dosa with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total onion Dosa bill : " + vod_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vod_bill;
					}
					case "9" -> {
						System.out.println(" Your Order is Veg Manchurian.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vm_bill = 200 * quantity;

//						calculate the total bill Veg Manchurian with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Veg Manchurian bill : " + vm_bill);
						System.out.println("------------------------------------------");
						Veg_total_bill += vm_bill;
					}

//					item is not Available by using default
					default -> System.out.println(" This item is not Available.");
					}
					System.out.println("Do you want Some Items . ? click y for Yes / n for No");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));

//				calculate the total bill Veg Items
				System.out.println("*******************************************");
				System.out.println("Total Veg Items Bill : " + Veg_total_bill);
				System.out.println("*******************************************");
				Total_bill += Veg_total_bill;
			}

//			second catagory Non-veg items

			case "non-veg" -> {
				String nyn = "";

				do {
					System.out.println(
							"Enter your Non_veg Order like this 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 that all only. ");
					String nv_item = sc.next();

					switch (nv_item) {

					case "1" -> {
						System.out.println(" Your Order is Chicken Tikka.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvct_bill = 280 * quantity;

//						calculate the total bill Chicken Tikka with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken Tikka bill : " + nvct_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvct_bill;
					}
					case "2" -> {
						System.out.println(" Your Order is Chicken Curry.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvcc_bill = 250 * quantity;

//						calculate the total bill Chicken Curry with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken Curry bill : " + nvcc_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvcc_bill;
					}
					case "3" -> {
						System.out.println(" Your Order is Butter Chicken.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvbc_bill = 300 * quantity;

//						calculate the total bill Shahi Panner with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Shahi Paneer bill : " + nvbc_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvbc_bill;
					}
					case "4" -> {
						System.out.println(" Your Order is Chicken Biryani.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvcb_bill = 380 * quantity;

//						calculate the total bill Chicken Biryani with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken Biryani bill : " + nvcb_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvcb_bill;
					}
					case "5" -> {
						System.out.println(" Your Order is Egg Biryani.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nveb_bill = 220 * quantity;
//						calculate the total bill Egg Biryani with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Egg Biryani bill : " + nveb_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nveb_bill;
					}
					case "6" -> {
						System.out.println(" Your Order is Fish Curry.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvfc_bill = 300 * quantity;

//						calculate the total bill Fish Curry with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Fish Curry bill : " + nvfc_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvfc_bill;
					}
					case "7" -> {
						System.out.println(" Your Order is Fish Fry.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvff_bill = 280 * quantity;

//						calculate the total bill Fish Fry with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Fish Fry bill : " + nvff_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvff_bill;
					}
					case "8" -> {
						System.out.println(" Your Order is Chicken Hakka Noodles.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvchn_bill = 220 * quantity;

//						calculate the total bill Chicken Manchurian with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken Hakka Noodles : " + nvchn_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvchn_bill;
					}
					case "9" -> {
						System.out.println(" Your Order is Chicken Manchurian.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vod_bill = 250 * quantity;

//						calculate the total bill Chicken Manchurian with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken Manchurian bill : " + vod_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += vod_bill;
					}
					case "10" -> {
						System.out.println(" Your Order is Chicken Kebab.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double nvck_bill = 260 * quantity;

//						calculate the total bill Chicken Kebab with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken Kebab : " + nvck_bill);
						System.out.println("------------------------------------------");
						non_Veg_total_bill += nvck_bill;
					}

//					item is not Available by using default
					default -> System.out.println(" This item is not Available.");
					}
					System.out.println("Do you want Some Items . ? click y for Yes / n for No");
					nyn = sc.next();
				} while (nyn.equalsIgnoreCase("y"));
//				calculate the total bill for Non-veg 
				System.out.println("*******************************************");
				System.out.println("Total Non-Veg Items Bill : " + non_Veg_total_bill);
				System.out.println("*******************************************");
				Total_bill += non_Veg_total_bill;

			}

//			Thrid catagory drinks items

			case "drink" -> {
				String dyn = "";

				do {
					System.out.println("Enter your Drink Order like this 1 , 2 , 3 , 4 , 5 , 6 , 7  that all only.");
					String d_item = sc.next();

					switch (d_item) {

					case "1" -> {
						System.out.println(" Your Order is Filter Coffee.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double dfc_bill = 40 * quantity;

//						calculate the total bill Filter Coffee with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Filter Coffee bill : " + dfc_bill);
						System.out.println("------------------------------------------");
						drink_total_bill += dfc_bill;
					}
					case "2" -> {
						System.out.println(" Your Order is Sweet Lassi.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double dsl_bill = 70 * quantity;

//						calculate the total bill Sweet Lassi with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Sweet Lassi bill : " + dsl_bill);
						System.out.println("------------------------------------------");
						drink_total_bill += dsl_bill;
					}
					case "3" -> {
						System.out.println(" Your Order is Mango Lassi.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double dml_bill = 90 * quantity;

//						calculate the total bill Mango Lassi with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Mango Lassi bill : " + dml_bill);
						System.out.println("------------------------------------------");
						drink_total_bill += dml_bill;
					}
					case "4" -> {
						System.out.println(" Your Order is Fresh Lime Soda.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();

//						calculate the total bill Fresh Lime Soda with quantity 
						double dls_bill = 50 * quantity;
						System.out.println("------------------------------------------");
						System.out.println("Total Fresh Lime Soda bill : " + dls_bill);
						System.out.println("------------------------------------------");
						drink_total_bill += dls_bill;
					}
					case "5" -> {
						System.out.println(" Your Order is Butter Milk.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double dbl_bill = 35 * quantity;

//						calculate the total bill Butter Milk with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Butter Milk bill : " + dbl_bill);
						System.out.println("------------------------------------------");
						drink_total_bill += dbl_bill;
					}
					case "6" -> {
						System.out.println(" Your Order is Cold Coffee.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double dcc_bill = 100 * quantity;

//						calculate the total bill Cold Coffee with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Cold Coffee bill : " + dcc_bill);
						System.out.println("------------------------------------------");
						drink_total_bill += dcc_bill;
					}
					case "7" -> {
						System.out.println(" Your Order is Mango Juice.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double dmj_bill = 80 * quantity;

//						calculate the total bill Mango Juice with quantity 
						System.out.println("------------------------------------------");
						System.out.println("Total Mango Juice bill : " + dmj_bill);
						System.out.println("------------------------------------------");
						drink_total_bill += dmj_bill;
					}

//					item is not Available by using default
					default -> System.out.println(" This item is not Available.");
					}
					System.out.println("Do you want Some drink Items . ? click y for Yes / n for No");
					dyn = sc.next();
				} while (dyn.equalsIgnoreCase("y"));

//				calculate the total Drink Items Bill
				System.out.println("*******************************************");
				System.out.println("Total Drink Items Bill : " + drink_total_bill);
				System.out.println("*******************************************");
				Total_bill += drink_total_bill;

			}

//			Fourth catagory is Staters
			case "starter" -> {
				String syn = "";

				do {
					System.out.println(
							"Enter your veg Order like this 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 that all only. ");
					String s_item = sc.next();

					switch (s_item) {

					case "1" -> {
						System.out.println(" Your Order is Vegetable Samosa.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double svs_bill = 50 * quantity;

//						calculate the total bill Vegetable Samosa with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Vegetable Samosa bill : " + svs_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += svs_bill;
					}
					case "2" -> {
						System.out.println(" Your Order is Chill Paneer.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double scp_bill = 320 * quantity;

//						calculate the total bill Chill Paneer with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Chill Paneer bill : " + scp_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += scp_bill;
					}
					case "3" -> {
						System.out.println(" Your Order is Veg Spring Rolls.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ssr_bill = 160 * quantity;

//						calculate the total Paneer 65 bill with quantity				
						System.out.println("------------------------------------------");
						System.out.println("Total Veg Spring Rolls bill : " + ssr_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += ssr_bill;
					}
					case "4" -> {
						System.out.println(" Your Order is Panner 65.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sp6_bill = 320 * quantity;

//						calculate the total Paneer 65 bill with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Paneer 65 bill : " + sp6_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += sp6_bill;
					}
					case "5" -> {
						System.out.println(" Your Order is Gopi Manchurian.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sgm_bill = 190 * quantity;

//						calculate the total Gopi Manchurian bill with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Gopi Manchurian bill : " + sgm_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += sgm_bill;
					}
					case "6" -> {
						System.out.println(" Your Order is Chill Chicken.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double scc_bill = 260 * quantity;

//						calculate the total Chill Chicken bill with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Chill Chicken bill : " + scc_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += scc_bill;
					}
					case "7" -> {
						System.out.println(" Your Order is Chicken 65.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sc6_bill = 240 * quantity;

//						calculate the total Chicken 65 bill with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken 65 bill : " + sc6_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += sc6_bill;
					}
					case "8" -> {
						System.out.println(" Your Order is Thandoori Chicken.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double stc_bill = 320 * quantity;

//						calculate the total Thandoori Chicken bill with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Thandoori Chicken bill : " + stc_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += stc_bill;
					}
					case "9" -> {
						System.out.println(" Your Order is Chicken Seekh Kebab.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double vod_bill = 280 * quantity;

//						calculate the total onino Dosa  bill with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Chicken Seekh Kebab bill : " + vod_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += vod_bill;
					}
					case "10" -> {
						System.out.println(" Your Order is Apollo Fish.");
						System.out.println("Enter the quantity like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double saf_bill = 390 * quantity;

//						calculate the total Veg Manchurian bill with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Apollo Fish bill : " + saf_bill);
						System.out.println("------------------------------------------");
						staters_total_bill += saf_bill;
					}

//					item is not Available by using default
					default -> System.out.println(" This item is not Available.");
					}
					System.out.println("Do you want some Staters Items . ? click y for Yes / n for No");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("y"));

//				calculate the total Staters items
				System.out.println("*******************************************");
				System.out.println("Total Staters Items Bill : " + staters_total_bill);
				System.out.println("*******************************************");
				Total_bill += staters_total_bill;

			}
			}
			System.out.println("Do you want Some catagories Items . ? click y for Yes / n for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("_________________________________________");

//		calculate the total catagories 
		System.out.println(" Your over all Bill : " + Total_bill);

	}

}