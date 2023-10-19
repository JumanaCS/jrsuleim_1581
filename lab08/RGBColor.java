public class RGBColor{
	private int red;
	private int green;
	private int blue;

	public RGBColor(int red, int green, int blue){
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed(){
		return this.red;
	}

	public int getGreen(){
		return this.green;
	}

	public int getBlue(){
		return this.blue;
	}

	public boolean equals(RGBColor other){
		if(this.red == other.getRed() && this.green == other.getGreen() && this.blue == other.getBlue()){
			return true;
		}
		else 
			return false;
	}

	public String toHex(){
		return String.format("#%02x%02x%02x", red, green, blue); 
	}

	public String toString(){
		return String.format("rgb(%d,%d,%d)", red, green, blue);
	}
}