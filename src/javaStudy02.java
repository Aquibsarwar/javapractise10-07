public class javaStudy02 {
	private String name;
	private int age;
	private double height;
	private String eyecolor;
	
	public javaStudy02(String name) {
		this.name = name;
	}
	
	public void sayName() {
		System.out.printf("My brother name is %s ", name+ ".\n"); 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}

	public double getHeight() {
		return height;
		
	}

	public void setEyeColor(String eyecolor) {
		this.eyecolor=eyecolor;
	}
	
	public String getEyeColor() {
		return eyecolor;
	}
}