package onetomanyuni_test2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import onetomanyuni_test2.dao.Buildingdao;
import onetomanyuni_test2.dto.Building;
import onetomanyuni_test2.dto.Floors;


public class Buildingmain {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		Floors floors=new Floors();
		Building building=new Building();
		Buildingdao buildingdao=new Buildingdao();
		
		
		boolean check=true;
		do {
			System.out.println("1.save Building and  \n 2.update Building \n 3.delete Building \n 4.get Building by id"
					+ "\n 5.get all Building");
			int choice=scanner.nextInt();
			
			switch (choice) {
			
			//case1-for insert the data
			case 1:{
				System.out.println("enter the building  name");
				String name=scanner.next();
				System.out.println("enter the building address");
				String address=scanner.next();
				building.setName(name);
				building.setAddress(address);
				
	
				
				
				
				System.out.println("enter the floors name");
				String fname=scanner.next();
				floors.setFname(fname);
				
	
				List<Floors> list=new ArrayList<Floors>();
				list.add(floors);
				
				building.setFloors(list);
				buildingdao.savebuilding(building);
				
			}break;
			
			
			
			//case2-for update
			case 2:{
				
				System.out.println("enter the  building id");
				int id=scanner.nextInt();
				
				System.out.println("enter the updating  building name");
				String name=scanner.next();
				System.out.println("enter the updating  building address");
				String address=scanner.next();
				building.setName(name);
				building.setAddress(address);
				
				
				buildingdao.updatebuilding(id, building);
			}break;
				
				
				//case3-for delete
			case 3:{
				System.out.println("enter the id");
				int id=scanner.nextInt();
				
				buildingdao.deletebuilding(id);
			}break;
		
			
			//case4-for get details by id
			case 4:{
				System.out.println("enter the id");
				int id=scanner.nextInt();
				
				buildingdao.getbuildingbyid(id);
			}break;
			
			
			//case5-for get all the details 
			case 5:{
				buildingdao.getallbuilding();

			}break;
			
			
			
		
			default:
				break;
			}
			
			
			
			
		} while (check);
	}

}
