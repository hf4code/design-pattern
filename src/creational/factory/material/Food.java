package creational.factory.material;

public abstract class Food {
	
	private String name;
	private String salt;
	private String spicy;
	private String condiment;
	private String chicken;
	private String noodle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpicy() {
		return spicy;
	}

	public String getCondiment() {
		return condiment;
	}

	public void addSpicy(String string) {
		this.spicy = string;
	}

	public void addCondiment(String string) {
		this.condiment = string;
	}

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", salt='" + salt + '\'' +
                ", spicy='" + spicy + '\'' +
                ", condiment='" + condiment + '\'' +
                ", chicken='" + chicken + '\'' +
                ", noodle='" + noodle + '\'' +
                '}';
    }
}
