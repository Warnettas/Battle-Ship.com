public class SubClassInSamePackage extends BaseClass  {

	public static void main(String[] args) {
		BaseClass rr =new BaseClass();
		rr.z = 0;
		SubClassInSamePackage subClassObj = new SubClassInSamePackage();
		//Access Modifiers - Public
		System.out.println("Value of x is : " +subClassObj.x);
		subClassObj.setX(20); 
		System.out.println("Value of x is : " +subClassObj.x);
		//Access Modifiers - Public
		//		 If we remove the comments it would result in a compilaton
		//		 error as the fields and methods being accessed are private
		/*		 System.out.println("Value of y is : "+subClassObj.y);
		 
		subClassObj.setY(20);
		 
		System.out.println("Value of y is : "+subClassObj.y);*/
		//Access Modifiers Protected 
		System.out.println("Value of z is : " + subClassObj.z);
		subClassObj.setZ(30);
		System.out.println("Value of z is : " + subClassObj.z);
		//Access Modifiers - Default
		System.out.println("Value of x is : " + subClassObj.a);
		subClassObj.setA(20);
		System.out.println("Value of x is : " + subClassObj.a);
	}

}
