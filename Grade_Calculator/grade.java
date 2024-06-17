import java.util.Scanner;

class grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Math: ");
        double math=sc.nextDouble();
        System.out.print("Enter marks of Physics: ");
        double physics=sc.nextDouble();
        System.out.print("Enter marks of Chemistry: ");
        double chemistry=sc.nextDouble();
        System.out.print("Enter marks of English: ");
        double english=sc.nextDouble();
        System.out.print("Enter marks of Botany: ");
        double botany=sc.nextDouble();
        System.out.print("Enter marks of Zoology: ");
        double zoology=sc.nextDouble();

        double total= math+physics+chemistry+english+botany+zoology;
        double percentage=total/6;
        System.out.println("Total Marks= "+total);
        System.out.println("Percentage Obtained= "+percentage);

        if(percentage>=33)
        {
            if(percentage>=45)
            {
                if(percentage>=60){
                    System.out.println("First Division");
                }
                else{
                    System.out.println("Second Division");
                }
            }
            else
            {
                System.out.println("Third Division");
            }
        }
        else
        {
            System.out.println("Fail");
        }
        
    }
}