package _05_netflix;

public class Runner {
public static void main(String[] args) {
	Movie movie1 = new Movie("a",3);
	Movie movie2 = new Movie("b",2);
	Movie movie3 = new Movie("c",5);
	Movie movie4 = new Movie("d",3);
	Movie movie5 = new Movie("e",4);
	movie4.getTicketPrice();
	NetflixQueue netflixqueue = new NetflixQueue();
	netflixqueue.addMovie(movie1);
	netflixqueue.addMovie(movie2);
	netflixqueue.addMovie(movie3);
	netflixqueue.addMovie(movie4);
	netflixqueue.addMovie(movie5);
	netflixqueue.printMovies();
	System.out.println("The best movie is "+ netflixqueue.getBestMovie());
	System.out.println("The second best movie is " + netflixqueue.getMovie(1));
}
}
