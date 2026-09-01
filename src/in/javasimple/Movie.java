package in.javasimple;

public class Movie {
	
	static String theatre = "Prabash hall";
	static String location ="Thadda";
	
	String movieName;
	int Budget;
	String ReleaseDate;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TheatreName :" + theatre);
		System.out.println("Location :" + location);
		System.out.println("________________________________________________");
		
		
		
		Movie m = new Movie();
		m.movieName ="Pushpa";
		m.Budget = 300000000;
		m.ReleaseDate ="19-08-2019";
		
		System.err.println("movieName-1 : "+ m.movieName);
		System.out.println("Budget :"+ m.Budget);
		System.out.println("ReleaseDate :"+ m.ReleaseDate);
		System.out.println("****************************");

		
		m.movieName ="Pushpa-2";
		m.Budget = 900000000;
		m.ReleaseDate ="25-12-2024";
		
		System.err.println("movieName-2 : "+ m.movieName);
		System.out.println("Budget :"+ m.Budget);
		System.out.println("ReleaseDate :"+ m.ReleaseDate);
		System.out.println("****************************");
		
		m.movieName ="RAKAA";
		m.Budget = 900000000;
		m.ReleaseDate ="12-05-2027";
		
		System.err.println("movieName-3 : "+ m.movieName);
		System.out.println("Budget :"+ m.Budget);
		System.out.println("ReleaseDate :"+ m.ReleaseDate);
		System.out.println("*****************************");
		
		
		m.movieName ="A AA";
		m.Budget = 40000000;
		m.ReleaseDate ="10-08-2013";
		
		System.err.println("movieName-4 : "+ m.movieName);
		System.out.println("Budget :"+ m.Budget);
		System.out.println("ReleaseDate :"+ m.ReleaseDate);
		System.out.println("****************************");
		
		m.movieName ="RAKHI";
		m.Budget = 4000000;
		m.ReleaseDate ="19-08-2019";
		
		System.err.println("movieName-5 : "+ m.movieName);
		System.out.println("Budget :"+ m.Budget);
		System.out.println("ReleaseDate :"+ m.ReleaseDate);
	}

}
