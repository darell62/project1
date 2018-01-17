package knnsearch;


public class main {
	public static void main(String args[]) {
		pointformat pt1 = new pointformat();
		pointformat pt2 = new pointformat();
		pointformat pt3 = new pointformat();
		
		pt1.setX(0);
		pt1.setY(3);
		pt2.setX(4);
		pt2.setY(0);
		pt3.setX(11);
		pt3.setY(20);
		
		tridisformat result = tridis(pt1, pt2, pt3);
		//double dis = distance(pt1,pt2);
		
	//	System.out.println("distance AB = " + result.getDisAB());
	//	System.out.println("distance AC = " + result.getDisAC());
	//	System.out.println("distance BC = " + result.getDisBC());
		System.out.println("hello");
	}

	public static tridisformat tridis(pointformat A, pointformat B, pointformat C){
		
		double disAB = distance(A, B);
		double disAC = distance(A, C);
		double disBC = distance(B, C);
		
		tridisformat result = new tridisformat() ;
		
		result.setDisAB(disAB);
		result.setDisAC(disAC);
		result.setDisBC(disBC);
			
		return result;
	}
	
	
	public static double distance(pointformat A, pointformat B){
		
	double dis = Math.sqrt( (A.getX() - B.getX()) * (A.getX() - B.getX())  + (A.getY() - B.getY()) * (A.getY() - B.getY()) );
	
	return dis;
	}
}

