package  shape;

class Shape {
	public void print() {
		//System.out.println("THIS IS shape");
	}
}
 class shape2d extends Shape {
	public void print() {
		System.out.println("SHAPE2D");
		super.print();
	}
}
class quadrilateral extends shape2d {
	
}
 
 class triangle extends shape2d {
		public void print() {
			System.out.println("triangle");
			super.print();
		}
 }
 
class rectangle extends quadrilateral {
	public void print() {
	System.out.println("rectangle");
		super.print();
	}
	
	public double area(double... T) {
		 double ar = 1;
		 for(double i: T) {
			 ar=ar*i;
		 }
		 return ar;
		}
	
	
}
 class square extends quadrilateral {
	 public void print() {
		 System.out.println("square");
			super.print();
		}
	 public double area(double...T) {
		 double ar=1;
		 for(double i:T) {
			 ar*=i;
		 }
		 return ar;
	 }
	
}
 class right_triangle extends triangle {
	 public void print() {
		 System.out.println("right_triangle");
			super.print();
		}
	 public double area(double...T) {
		 double ar=1;
		 for(double i:T) {
			 ar*=i;
		 }
		 return ar;
	 }
}
 class shape3d extends Shape {
	 public void print() {
		 System.out.println("SHAPE3D");
			super.print();
		}
}
 class sphere extends shape3d {
	 public void print() {
		 System.out.println("sphere");
			super.print();
		}
	 public double area(double...T) {
		 double ar=1;
		 for(double i:T) {
			 ar*=i;
		 }
		 return ar;
	 }
}
class cube extends shape3d {
	public void print() {
		System.out.println("cube");
		super.print();
	}
	public double area(double...T) {
		 double ar=1;
		 for(double i:T) {
			 ar*=i;
		 }
		 return ar;
	}
}
public  class shp {
	 
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string s=new string();
		rectangle s=new rectangle();
		s.print();
		System.out.println("area:"+s.area(12,23.5)+'\n');
		
		square v=new square();
		v.print();
		System.out.println("area:"+v.area(12,21)+'\n');
		
		right_triangle q=new right_triangle();
		q.print();
		System.out.println("area:"+q.area(12,15)+'\n');
		
		sphere m=new sphere();
		m.print();
		System.out.println("area:"+m.area(12,12)+'\n');
		
		
		
	}

}


