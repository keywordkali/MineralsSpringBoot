package Business;

import javax.persistence.*;
@Entity
public class Minerals {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String Color;
	private String Found;
	private int NumberOwned;
	private boolean isJewelry;
	private boolean isSpecimen;

	public Minerals() {

	}

	public Minerals(int id, String Name, String Color, String Found, int NumberOwned, boolean isJewelry,
			 boolean isSpecimen) {
		this.id = id;
		this.Name = Name;
		this.Color = Color;
		this.Found = Found;
		this.NumberOwned = NumberOwned;
		this.isJewelry = isJewelry;
		this.isSpecimen = isSpecimen;

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		Color = color;
	}

	/**
	 * @return the found
	 */
	public String getFound() {
		return Found;
	}

	/**
	 * @param found the found to set
	 */
	public void setFound(String found) {
		Found = found;
	}

	/**
	 * @return the numberOwned
	 */
	public int getNumberOwned() {
		return NumberOwned;
	}

	/**
	 * @param numberOwned the numberOwned to set
	 */
	public void setNumberOwned(int numberOwned) {
		NumberOwned = numberOwned;
	}

	/**
	 * @return the isJewelry
	 */
	public boolean isJewelry() {
		return isJewelry;
	}

	/**
	 * @param isJewelry the isJewelry to set
	 */
	public void setJewelry(boolean isJewelry) {
		this.isJewelry = isJewelry;
	}

	/**
	 * @return the isSpecimen
	 */
	public boolean isSpecimen() {
		return isSpecimen;
	}

	/**
	 * @param isSpecimen the isSpecimen to set
	 */
	public void setSpecimen(boolean isSpecimen) {
		this.isSpecimen = isSpecimen;
	}

}

	
	

	
