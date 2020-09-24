public class uc3{
        public static void main(String[] args){
        double die=Math.floor(Math.random()*10)%6;
        int pos=0;
        int no=(int)die+1;
        int mov=(int)(Math.floor(Math.random()*10)%3);
        System.out.println("Number on die is " +no);
        pos=pos+no;
        System.out.println("New position is :" +pos);
        switch(mov){
        case 1:
        {System.out.println("Player doesn't move");
	break;}
        case 2: 
        {System.out.println("Player moves forward");
	break;}
        default:
        {System.out.println("Player moves backward"); 
	break;}
               }
        }
}
