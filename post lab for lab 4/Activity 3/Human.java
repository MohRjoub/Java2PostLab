package tawjihi;

public abstract class Human implements HumanBeing {
	  private String name;
	  private char gender='F';

	  public Human(String name, char gender) {
		  setName(name);
		  setGender(gender);
	  }

	  public void setName(String name) {
			this.name = name;
		}
	  public void setGender(char gender) {
			if(gender=='F'||gender=='M')
			this.gender = gender;
			else
				System.out.println("Please Enter A Valid Gender");
		}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	  
	}