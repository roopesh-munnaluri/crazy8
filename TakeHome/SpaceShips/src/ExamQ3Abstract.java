import java.util.ArrayList;

public class ExamQ3Abstract {
	public static void main(String[] args) {
		ArrayList<SpaceShip> spaceships= new ArrayList<SpaceShip>();
		StarWarsShips starwarship1 = new StarWarsShips(1,"Starwarship - ship1","Starwarship - frachise1");
		StarWarsShips starwarship2 = new StarWarsShips(2,"Starwarship - ship2","Starwarship - frachise2");
		StarWarsShips starwarship3 = new StarWarsShips(3,"Starwarship - ship3","Starwarship - frachise3");
		StarTrekShips startrekship1 = new StarTrekShips(1,"StarTrek - ship1","StarTrek - franchise1");
		StarTrekShips startrekship2 = new StarTrekShips(2,"StarTrek - ship2","StarTrek - franchise2");
		StarTrekShips startrekship3 = new StarTrekShips(3,"StarTrek - ship3","StarTrek - franchise3");
		OtherSciFiSpaceShips otherscifiship1 = new OtherSciFiSpaceShips(1,"SciFi - ship1","Scifi - franchise1");		
		OtherSciFiSpaceShips otherscifiship2 = new OtherSciFiSpaceShips(2,"SciFi - ship2","Scifi - franchise2");
		OtherSciFiSpaceShips otherscifiship3 = new OtherSciFiSpaceShips(3,"SciFi - ship3","Scifi - franchise3");
		spaceships.add(starwarship1);
		spaceships.add(starwarship2);
		spaceships.add(starwarship3);
		spaceships.add(startrekship1);
		spaceships.add(startrekship2);
		spaceships.add(startrekship3);
		spaceships.add(otherscifiship1);
		spaceships.add(otherscifiship2);
		spaceships.add(otherscifiship3);
		for(SpaceShip ships:spaceships) 
		{
			System.out.println("Tonnage: " + ships.getTonnage());
			System.out.println("Name:  " + ships.getName());
			System.out.println("Franchise:  " + ships.getFranchise());	
		}
	}
}
