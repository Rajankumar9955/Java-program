abstract class RGPV{
	public abstract void lab();
 	public abstract void cctv();
	//abstract
  
	public void examCopyCheck(){
		System.out.println("This is RGPV non abstract method");
}
	public RGPV(){
		System.out.println("THis is RGPV CONstractor");
	}
	}
class College extends RGPV{
	public void cctv(){
	System.out.println("This is cctv method rule by RGPV");
        }
	public void lab(){
               System.out.println("This is CCTV method Rule by RGPV ");
	}
public void staff(){
	System.out.println("This is lab Method Rule by RGPV");
	}
public College(){
	System.out.println("This is College Constrator");
	}
public static void main(String args[]){
//RGPV obj=new RGPV(); //c.e.
RGPV obj=new College();
obj.cctv();
obj.lab();
obj.examCopyCheck();
//obj.staff();
College c=new College();
c.cctv();
c.lab();
c.examCopyCheck();
c.staff();
}
}



