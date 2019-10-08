public class javastudy01 {
	
	public static void main(String[] args) {
		
		javaStudy02 person1 = new javaStudy02("Saquib");
		
		person1.sayName();
		
		person1.setName("Aquib");
		person1.setAge(24);
		person1.setHeight(5.8);
		person1.setEyeColor("sky color");
	
	System.out.print("My name is: " +person1.getName()+". I am " +person1.getAge()+" years old. my eyecolor is "+person1.getEyeColor());
	}
}