package in.javasimple;

public class Actor {
	String Actorname;
	String language;
	int NO_of_movies;
	double Avarge_bugget;
	
	public static void main(String[] args) {
		Actor a1 = new Actor();
		
		a1.Actorname = "AA";
		a1.language = "Telugu";
		a1.NO_of_movies = 14;
		a1.Avarge_bugget = 400;
		
		System.out.println("Actorname : "+ a1.Actorname);
		System.out.println("language : "+ a1.language);
		System.out.println("NO_of_movies : "+ a1.NO_of_movies);
		System.out.println("Avarge_bugget : "+ a1.Avarge_bugget +"cr");
	}

}
