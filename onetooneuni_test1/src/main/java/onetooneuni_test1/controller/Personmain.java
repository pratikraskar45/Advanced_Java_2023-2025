package onetooneuni_test1.controller;

import java.util.Scanner;

import onetooneuni_test1.dao.Persondao;
import onetooneuni_test1.dto.Aadhar;
import onetooneuni_test1.dto.Person;



public class Personmain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Person person=new Person();
		Aadhar aadhar=new Aadhar();
		Persondao persondao=new Persondao();		
		boolean check=true;
		
		do {
			System.out.println("1.save person \n 2.update person \n 3.delete person \n 4.get person by id"
					+ "\n 5.get all person");
			
			int choice=scanner.nextInt();
			
			switch (choice) {
			
			//case1-for insert the data
			case 1:{
		
				System.out.println("enter person name");
				String name=scanner.next();
				System.out.println("enter the person phone no");
				Long phone=scanner.nextLong();
			
				person.setName(name);
				person.setPhone(phone);
				
				
				
				System.out.println("enter the aadhar name");
				String aname=scanner.next();
				System.out.println("enter aadhar address");
				String aaddress=scanner.next();
				
				aadhar.setName(aname);
				aadhar.setAddress(aaddress);
				
			    person.setAadhar(aadhar);
				
				persondao.saveperson(person);
			}break;
			
			//case2-for update
			case 2:{
				System.out.println("enter the person id");
				int id=scanner.nextInt();
				System.out.println("enter the updating name");
				String name=scanner.next();
				System.out.println("enter the updating phone");
				Long phone=scanner.nextLong();
				
//				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				
				persondao.updateperson(id,person);
			}break;
			
			//case3-for delete
			case 3:{
				System.out.println("enter the id");
				int id=scanner.nextInt();
				
				persondao.deleteperson(id);
			}break;
			
			//case4-for get details by id
			case 4:{
				System.out.println("enter the id");
				int id=scanner.nextInt();
				
				persondao.getpersonbyid(id);
			}break;
			
			//case5-for get all the details 
			case 5:{
				persondao.getallperson();
			}break;


			default:
				break;
			}
		} while (check);
	
	}

}
