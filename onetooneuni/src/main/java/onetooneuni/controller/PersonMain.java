package onetooneuni.controller;

import java.util.Scanner;


import onetooneuni.dao.Persondao;
import onetooneuni.dto.Passport;
import onetooneuni.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Person person=new Person();
		Passport passport=new Passport();
		Persondao persondao=new Persondao();
		
		while (true) {
			System.out.println("\n Person,Passport managment System:");
			System.out.println("1. Instert Person");
			System.out.println("2. Update Person");
			System.out.println("3. Delete Person");
			System.out.println("4. Find Person");
			System.out.println("5. get all Person");
			System.out.println("6. Exit");
			System.out.print("Enter you choice:");
			int choice=scanner.nextInt();
			switch (choice) {
			//insert 
			case 1:
				System.out.println("Enter the Person id:");
				int id=scanner.nextInt();
				System.out.println("Enter the Person name:");
				String name=scanner.next();
				System.out.println("Enter the Person address:");
				String address=scanner.next();
				person.setId(id);
				person.setName(name);
				person.setAddress(address);
				
				System.out.println("Enter the passport id:");
				int pid=scanner.nextInt();
				System.out.println("Enter the passport name:");
				String pname=scanner.next();
				System.out.println("Enter the passport address:");
				String paddress=scanner.next();
				passport.setId(pid);
				passport.setName(pname);
				passport.setAddress(paddress);
				
				person.setPassport(passport);
				persondao.saveperson(person);
				
				
				
				
		
				break;
				
				
				
				
				//case2-for update
			case 2:{
				System.out.println("enter the person id");
				int updateid=scanner.nextInt();
				System.out.println("enter the updating name");
				String updatename=scanner.next();
				System.out.println("enter the updating address");
				String updateaddress=scanner.next();
				
				person.setId(updateid);
				person.setName(updatename);
				person.setAddress(updateaddress);
				
				persondao.updateperson(updateid,person);
			}break;
			
			//case3-for delete
			case 3:{
				System.out.println("enter the id");
				int deleteid=scanner.nextInt();
				
				persondao.deleteperson(deleteid);
			}break;
			
			//case4-for get details by id
			case 4:{
				System.out.println("enter the id");
				int getid=scanner.nextInt();
				persondao.getpersonbyid(getid);
			}break;
			
			//case5-for get all the details 
			case 5:{
				persondao.getallperson();
			}break;
                
			case 6:
				System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
                break;

			default:
				System.out.println("Invalid choice! Please try again.");
			}
			
			
		}
	}
	

}
