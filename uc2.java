public class uc2{
	public static void main(String[] args){
	double die=Math.floor(Math.random()*10)%6;
	int pos=0;
	int no=(int)die+1;
	System.out.println("Number on die is " +no);
	pos=pos+no;
	System.out.println("New position is :" +pos);
	}
}
