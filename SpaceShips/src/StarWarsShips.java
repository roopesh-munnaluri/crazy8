
public class StarWarsShips extends SpaceShip{

	private int tonnage;
	private String name;
	private String franchise;
	
	public StarWarsShips(int tonnage, String name,String franchise) {
		this.tonnage = tonnage;
		this.name = name;
		this.franchise = franchise;
	}
	
	public int getTonnage() {
		return tonnage;
	}
	public String getName() {
		return name;
	}
	public String getFranchise() {

		return franchise;
	}

}
