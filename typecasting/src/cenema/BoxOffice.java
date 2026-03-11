package cenema;

import java.util.Scanner;

public class BoxOffice {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Theatre theatre=new Theatre("7 Star", 599);
		boolean flag=true;
		while (flag) {
			System.out.println("Enter"+"1.Show Seat Avalibility /n 2.Book Ticet"+"3.To Check ticket details /n 4.Cancle Ticket /n 5.Exit");
			
			
			int n=scanner.nextInt();
			switch (n) {
			case 1:{
				int number_of_seats=theatre.getNo_of_seats();
				System.out.println(number_of_seats+"Seats are available");
			}break;
			
			case 2:{
				System.out.println("Enter the moive name");
				String name=scanner.next();
				System.out.println("How many want to book ticket");
				int num=scanner.nextInt();
				theatre.setTicket(new Ticket(name, num));
				int res=theatre.bookTicket();
				System.out.println("Succesfully booked"+res+"Ticktes");
				
			}break;
			case 3:{
				System.out.println("Ticket Details");
				Ticket ticket=theatre.getTicket();
				System.out.println(ticket.getMovie_name());
				System.out.println(ticket.getNo_of_tickets());
				
				
			}break;
			case 4:{
				System.out.println("Enter the number of tickets to be cancled");
				int cancle=scanner.nextInt();
				theatre.cancleTicket(cancle);
				
				
			}break;
			case 5:{
				System.out.println("Case 5");
				flag=false;
			}break;

			default:{
				System.out.println("Wrong input");
			}
				break;
			}
		}
	}

}
