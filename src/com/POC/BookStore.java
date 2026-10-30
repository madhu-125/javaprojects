package com.POC;

import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		System.out.println("Welcome the Madhu Book's Store.");
		System.out.println("******************************");
		System.out.println("1st class to 7th class");

		System.out.println("1 .   Telugu        -->    ₹180");
		System.out.println("2 .   English       -->	  ₹240");
		System.out.println("3 .   Hindi         -->	  ₹190");
		System.out.println("4 .   Mathamatics   -->	  ₹350");
		System.out.println("5 .   Science        -->	  ₹350");
		System.out.println("6 .   Social        -->	  ₹380");

		System.out.println("____________________________________________");

		System.out.println("8th class to 10th class");

		System.out.println("1 .   Telugu                 -->   ₹280");
		System.out.println("2 .   English                -->	  ₹345");
		System.out.println("3 .   Hindi                  -->	  ₹293");
		System.out.println("4 .   Mathamatics            -->	  ₹457");
		System.out.println("5 .   Physics                -->	  ₹456");
		System.out.println("6 .   Biology Science     -->	  ₹372");
		System.out.println("7 .   Social                 -->	  ₹490");

		System.out.println("____________________________________________");

		System.out.println("Intermediate 1 st Year MPC and Bi.P.C");

		System.out.println("1 .   Telugu                 -->   ₹200");
		System.out.println("3 .   Hindi                  -->	  ₹200");
		System.out.println("3 .   Sanskrit               -->	  ₹200");
		System.out.println("2 .   English                -->	  ₹300");
		System.out.println("4 .   Mathamatics - 1A       -->	  ₹420");
		System.out.println("5 .   Mathamatics - 1B       -->	  ₹450");
		System.out.println("6 .   Botoany -1             -->	  ₹436");
		System.out.println("7 .   Zoology -1             -->	  ₹446");
		System.out.println("8 .   Physics -1             -->	  ₹499");
		System.out.println("9 .   Chemistry -1           -->	  ₹489");
		System.out.println("10 .  History -1            -->	  ₹400");
		System.out.println("11.   Economics -1           -->	  ₹280");
		System.out.println("12 .  Civics -1             -->	  ₹290");
		System.out.println("13 .  Commerece -1          -->	  ₹360");


		System.out.println("____________________________________________");

		System.out.println("Intermediate 2 st Year MPC and Bi.P.C");

		System.out.println("1 .   Telugu                 -->   ₹200");
		System.out.println("3 .   Hindi                  -->	  ₹200");
		System.out.println("3 .   Sanskrit               -->	  ₹200");
		System.out.println("2 .   English                -->	  ₹300");
		System.out.println("4 .   Mathamatics - 2A       -->	  ₹420");
		System.out.println("5 .   Mathamatics - 2B       -->	  ₹450");
		System.out.println("6 .   Botoany -2             -->	  ₹436");
		System.out.println("7 .   Zoology -2             -->	  ₹446");
		System.out.println("8 .   Physics -2             -->	  ₹499");
		System.out.println("9 .   Chemistry -2           -->	  ₹489");
		System.out.println("10 .  History -2            -->	  ₹410");
		System.out.println("11.   Economics -2           -->	  ₹280");
		System.out.println("12 .  Civics -2             -->	  ₹350");
		System.out.println("13 .  Commerece -2          -->	  ₹370");

		System.out.println("____________________________________________");

		double seven_total_bill = 0;
		double fristy_total_bill = 0;
		double eight_total_bill = 0;
		double second_total_bill = 0;
		double Total_bill = 0;
		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Education Catgory like 1st-7th class , 8th-10th Class, First-Year , and Second-Year.");
			System.out.println("**************************************************************************************************");
			String catg = sc.next();
			switch (catg) {
			case "1st-7th" -> {
				String f7yn = "";

				do {
					System.out.println("Which Subject book do you want.? ");
					String sbook = sc.next();

					switch (sbook) {

					case "telugu" -> {
						System.out.println("The 1st to 7th class Telugu book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double st_bill = 220 * quantity;

//						calculate the total bill 1st to 7th class Telugu books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total 1st to 7th class Telugu books bill : " + st_bill);
						System.out.println("------------------------------------------");
						seven_total_bill += st_bill;
					}
					case "english" -> {
						System.out.println("The 1st to 7th class English book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double se_bill = 240 * quantity;
//						calculate the total bill 1st to 7th class English books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total English books bill : " + se_bill);
						System.out.println("------------------------------------------");
						seven_total_bill += se_bill;
					}
					case "hindi" -> {
						System.out.println("The 1st to 7th class Hindi book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sh_bill = 170 * quantity;

//						calculate the total bill 1st to 7th class Hindi books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Aloo Gobi bill : " + sh_bill);
						System.out.println("------------------------------------------");
						seven_total_bill += sh_bill;
					}
					case "maths" -> {
						System.out.println("The 1st to 7th class Mathamatic book you mentioned.");
						System.out.println("How much books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sm_bill = 250 * quantity;

//						calculate the total bill 1st to 7th class Mathamatic books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total 1st to 7th class Mathamatic books bill : " + sm_bill);
						System.out.println("------------------------------------------");
						seven_total_bill += sm_bill;
					}
					case "science" -> {
						System.out.println("The 1st to 7th class Science book you mentioned.");
						System.out.println("How much books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ss_bill = 250 * quantity;

//						calculate the total bill 1st to 7th class Science book with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total 1st to 7th class Science books bill : " + ss_bill);
						System.out.println("------------------------------------------");
						seven_total_bill += ss_bill;
					}
					case "social" -> {
						System.out.println("The 1st to 7th class Social book you mentioned.");
						System.out.println("How much books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sso_bill = 180 * quantity;

//						calculate the total bill 1st to 7th class Social books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total 1st to 7th class Social books bill : " + sso_bill);
						System.out.println("------------------------------------------");
						seven_total_bill += sso_bill;
					}
					
//					 this book is not Available by using default
					default -> System.out.println("Sorry .!, This book is not Available.");
					}
					System.out.println("Do you want some other books . ? click y for Yes / n for No");
					f7yn = sc.next();
				} while (f7yn.equalsIgnoreCase("y"));

//				To calculate the Total 1st class - 7th class books bill 
				System.out.println("*******************************************");
				System.out.println("Total1st to 7th class books Bill : " + seven_total_bill);
				System.out.println("*******************************************");
				Total_bill += seven_total_bill;
			}

//			Intermediate First year books

			case "first-year" -> {
				String fyn = "";

				do {
					System.out.println("Which Subject book do you want.? ");
					String et_item = sc.next();

					switch (et_item) {

					case "telugu1" -> {
						System.out.println("The intermediate First year Telugu  book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifte_bill = 200 * quantity;

//						calculate the total bill intermediate First year Telugu books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate First year  Telugu books bill : " + ifte_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifte_bill;
					}
					case "sanskrit" -> {
						System.out.println("The intermediate First year Sanskrit book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifsa_bill = 200 * quantity;

//						calculate the total bill intermediate First year Sanskrit books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate First year Sanskrit books bill : " + ifsa_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifsa_bill;
					}
					case "english" -> {
						System.out.println("The intermediate First year English book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ife_bill = 300 * quantity;
//						calculate the total bill  intermediate First year English books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate First year English books bill : " + ife_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ife_bill;
					}
					case "hindi1" -> {
						System.out.println("The intermediate First year Hindi book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifh_bill = 200 * quantity;

//						calculate the total bill intermediate First year Hindi books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate First year  Hindi books bill : " + ifh_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifh_bill;
					}
					case "maths1a" -> {
						System.out.println("The intermediate  First year Mathamatic -1 book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifma_bill = 420 * quantity;

//						calculate the total bill intermediate  First year  Mathamatic-A books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  First year  Mathamatic -A books bill : " + ifma_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifma_bill;
					}
					case "maths1b" -> {
						System.out.println("The  intermediate First year Mathamatic - B book book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifmb_bill = 450 * quantity;
//						calculate the total bill  intermediate  First year Mathamatic-B  book books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total intermediate  First year Mathamatic - B book books bill : " + ifmb_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifmb_bill;
					}
					case "botoany1" -> {
						System.out.println("The intermediate First year Botoany book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifb_bill = 436 * quantity;

//						calculate the total bill intermediate  First year  Botoany books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total intermediate First year Botoany books bill : " + ifb_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifb_bill;
					}
					case "zoology1" -> {
						System.out.println("The intermediate First year Zoology book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifz_bill = 446 * quantity;

//						calculate the total bill intermediate First year Zoology  books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total intermediate First year Zoology  books bill : " + ifz_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifz_bill;
					}
					case "physics1" -> {
						System.out.println("The intermediate First year Physics book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifp_bill = 499 * quantity;
//						calculate the total bill  intermediate  First year Physics books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  First year Physics  books bill : " + ifp_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifp_bill;
					}
					case "chemistry1" -> {
						System.out.println("The intermediate  First year Chemistry book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifch_bill = 489 * quantity;

//						calculate the total bill intermediate  First year  Chemistry books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  First year Chemistry books bill : " + ifch_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifch_bill;
					}
					case "history1" -> {
						System.out.println("The intermediate First year History book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ifh_bill = 400 * quantity;

//						calculate the total bill intermediate  First year  History books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  First year History  books bill : " + ifh_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ifh_bill;
					}
					case "economics1" -> {
						System.out.println("The intermediate First year Economics book book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ife_bill = 280 * quantity;
//						calculate the total bill  intermediate  First year Economics  book books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total intermediate First year Economics book books bill : " + ife_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ife_bill;
					}case "commerce1" -> {
						System.out.println("The intermediate First year Commerce book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ico1_bill = 360 * quantity;

//						calculate the total bill intermediate First year Commerce-1 books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  First year Commerce  books bill : " + ico1_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ico1_bill;
					}
					case "civics1" -> {
						System.out.println("The intermediate First year Civics  book book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ic1_bill = 290 * quantity;
//						calculate the total bill  intermediate First year Civics  book books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total intermediate First year Civics  book books bill : " + ic1_bill);
						System.out.println("------------------------------------------");
						fristy_total_bill += ic1_bill;
					}

//					item is not Available by using default
					default -> System.out.println("Sorry.!, This book  is not Available.");
					}
					System.out.println("Do you want some Other books . ? click y for Yes / n for No");
					fyn = sc.next();
				} while (fyn.equalsIgnoreCase("y"));
//				calculate the total bill for Non-veg 
				System.out.println("*******************************************");
				System.out.println("Total  First year books Bill : " + fristy_total_bill);
				System.out.println("*******************************************");
				Total_bill += fristy_total_bill;

			}

//			8th class to 10th class books 

			case "8th-10th" -> {
				String eyn = "";

				do {
					System.out.println("Which Subject book do you want.?.");
					String e_item = sc.next();

					switch (e_item) {

					case "telugu" -> {
						System.out.println("The Telugu book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double et_bill = 280 * quantity;

//						calculate the total bill 8th class to 10th class Telugu books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Telugu books bill : " + et_bill);
						System.out.println("------------------------------------------");
						eight_total_bill += et_bill;
					}
					case "english" -> {
						System.out.println("The English book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ee_bill = 345 * quantity;
//						calculate the total bill 8th class to 10th class English books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total English books bill : " + ee_bill);
						System.out.println("------------------------------------------");
						eight_total_bill += ee_bill;
					}
					case "hindi" -> {
						System.out.println("The Hindi book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double eh_bill = 293 * quantity;

//						calculate the total bill 8th class to 10th class Hindi books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Aloo Gobi bill : " + eh_bill);
						System.out.println("------------------------------------------");
						eight_total_bill += eh_bill;
					}
					case "maths" -> {
						System.out.println("The Mathamatic book you mentioned.");
						System.out.println("How much books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double em_bill = 457 * quantity;

//						calculate the total bill 8th class to 10th class Mathamatic books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Mathamatic books bill : " + em_bill);
						System.out.println("------------------------------------------");
						eight_total_bill += em_bill;
					}
					case "Physics" -> {
						System.out.println("The Physics book you mentioned.");
						System.out.println("How much books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double es_bill = 456 * quantity;

//						calculate the total bill 8th class to 10th class Physics book with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Physics books bill : " + es_bill);
						System.out.println("------------------------------------------");
						eight_total_bill += es_bill;
					}
					case "biology" -> {
						System.out.println("The Biology Science book you mentioned.");
						System.out.println("How much books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double ebs_bill = 372 * quantity;

//						calculate the total bill 8th class to 10th class Science book with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Biology Science books bill : " + ebs_bill);
						System.out.println("------------------------------------------");
						eight_total_bill += ebs_bill;
					}
					case "social" -> {
						System.out.println("The Social book you mentioned.");
						System.out.println("How much books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double eso_bill = 490 * quantity;

//						calculate the total bill 8th class to 10th class Social books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Social books bill : " + eso_bill);
						System.out.println("------------------------------------------");
						eight_total_bill += eso_bill;
					}

//					this book is not Available by using default
					default -> System.out.println("Sorry.!, This bool is not Available.");
					}
					System.out.println("Do you want some other books . ? click y for Yes / n for No");
					eyn = sc.next();
				} while (eyn.equalsIgnoreCase("y"));

//				calculate the total Bill 8th class to 10th class books 
				System.out.println("*******************************************");
				System.out.println("Total Drink Items Bill : " + eight_total_bill);
				System.out.println("*******************************************");
				Total_bill += eight_total_bill;

			}

//			Intermediate Second year books

			case "second-year" -> {
				String syn = "";

				do {
					System.out.println("Which Subject book do you want.? ");
					String et_item = sc.next();

					switch (et_item) {

					case "telugu2" -> {
						System.out.println("The Second year Telugu  book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfte_bill = 200 * quantity;

//						calculate the total bill intermediate Second Telugu books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate Second year  Telugu books bill : " + sfte_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfte_bill;
					}
					case "sanskrit2" -> {
						System.out.println("The Second year Sanskrit book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfsa_bill = 200 * quantity;

//						calculate the total bill intermediate Second year Sanskrit books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate Second year Sanskrit books bill : " + sfsa_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfsa_bill;
					}
					case "english2" -> {
						System.out.println("The Second year English book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfe_bill = 300 * quantity;
//						calculate the total bill  intermediate Second year English books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate Second year English books bill : " + sfe_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfe_bill;
					}
					case "hindi2" -> {
						System.out.println("The First Second Hindi book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfh_bill = 200 * quantity;

//						calculate the total bill intermediate Second year  Hindi books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate Second year  Hindi books bill : " + sfh_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfh_bill;
					}
					case "maths2a" -> {
						System.out.println("The  Second year Mathamatic -1 book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfm1_bill = 420 * quantity;

//						calculate the total bill intermediate  Second year  Mathamatic-A books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  Second year  Mathamatic -A books bill : " + sfm1_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfm1_bill;
					}
					case "maths2b" -> {
						System.out.println("The  Second year Mathamatic - B book book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfm2_bill = 450 * quantity;
//						calculate the total bill  intermediate  Second year Mathamatic-B  book books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total  Second year Mathamatic - B book books bill : " + sfm2_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfm2_bill;
					}
					case "botoany2" -> {
						System.out.println("The  Second year Botoany book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfb_bill = 436 * quantity;

//						calculate the total bill intermediate  Second year  Botoany books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total  Second year Botoany books bill : " + sfb_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfb_bill;
					}
					case "zoology2" -> {
						System.out.println("The  Second year Zoology book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfz_bill = 446 * quantity;

//						calculate the total bill intermediate Second year  Zoology  books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total  Second year Zoology  books bill : " + sfz_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfz_bill;
					}
					case "physics2" -> {
						System.out.println("The  Second year Physics book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sfp_bill = 499 * quantity;
//						calculate the total bill  intermediate  Second year Physics books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  Second year Physics  books bill : " + sfp_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sfp_bill;
					}
					case "chemistry2" -> {
						System.out.println("The intermediate  Second year Chemistry book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double stc_bill = 489 * quantity;

//						calculate the total bill intermediate  Second year  Chemistry books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  Second year Chemistry books bill : " + stc_bill);
						System.out.println("------------------------------------------");
						second_total_bill += stc_bill;
					}
					case "history2" -> {
						System.out.println("The  Second year History book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sth_bill = 410 * quantity;

//						calculate the total bill intermediate  Second year  History books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  Second year History  books bill : " + sth_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sth_bill;
					}
					case "economics2" -> {
						System.out.println("The  Second year Economics book book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double sye_bill = 280 * quantity;
//						calculate the total bill  intermediate  Second year Economics  book books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total  Second year Economics book books bill : " + sye_bill);
						System.out.println("------------------------------------------");
						second_total_bill += sye_bill;
					}case "commerce2" -> {
						System.out.println("The  Second year Commerce book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double styc_bill = 370 * quantity;

//						calculate the total bill intermediate  Commerce-1 books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total Intermediate  Second year Commerce  books bill : " + styc_bill);
						System.out.println("------------------------------------------");
						second_total_bill += styc_bill;
					}
					case "civics2" -> {
						System.out.println("The  Second year Civics  book book you mentioned.");
						System.out.println("How many books do you want you.?, like 1 , 2, 3, ... ");
						int quantity = sc.nextInt();
						double syc2_bill = 350 * quantity;
//						calculate the total bill  intermediate Second year Civics  book books with quantity
						System.out.println("------------------------------------------");
						System.out.println("Total  Second year Civics  book books bill : " + syc2_bill);
						System.out.println("------------------------------------------");
						second_total_bill += syc2_bill;
					}

//					item is not Available by using default
					default -> System.out.println("Sorry.!, This book  is not Available.");
					}
					System.out.println("Do you want some Other books . ? click y for Yes / n for No");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("y"));
//				calculate the total bill for Non-veg 
				System.out.println("*******************************************");
				System.out.println("Total  First year books Bill : " + second_total_bill);
				System.out.println("*******************************************");
				Total_bill += second_total_bill;

			}
			}
		System.out.println("Do you want some other catagories books . ? click y for Yes / n for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("_________________________________________");

//		calculate the total catagories 
		System.out.println(" Your over all Bill : " + Total_bill);

	}

	
}
