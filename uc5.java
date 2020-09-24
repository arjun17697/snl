public class uc5
{
        public static void main(String[] args)
        {

        int pos=0;
        int counter=0;
        while (pos<=100){
        int mov=(int)(Math.floor(Math.random()*10)%3);
        int die=(int)(Math.floor(Math.random()*10)%6);
        	switch(mov){
        		case 1:

                pos=pos+0;
		//System.out.println("No Movement");
                        break;
        case 2:

                pos=pos+die+1;
		//System.out.println("Move forward");
                break;
        default:

                pos=pos-die-1;
		//System.out.println("Move Backward");
                break;
               }
        //System.out.println("Number on die is " +(die+1));
        System.out.println(""+pos);
        if (pos>100){
        				pos=pos-die-1;
        				counter++;
					System.out.println("BOooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooOM");
        			}
        
		if (pos<0)
		{pos=0;
		counter++;}
	else {pos=pos;
			counter++ ;}
			;}
		System.out.println(" "+counter);
		}
}
