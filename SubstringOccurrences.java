import java.util.Scanner;
public class SubstringOccurrences{
    public static int countOccurrences(String str,String sub) {
        int count=0;
        int index=0;
        while((index=str.indexOf(sub,index))!=-1) 
		{
            count++;
            index+=sub.length();
        }
        return count;
	}
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
        String str=scanner.nextLine();
		System.out.print("Enter the substring:");
        String sub=scanner.nextLine();
		scanner.close();
        int result=countOccurrences(str,sub);
        System.out.println("Occurrences:"+result);
    }
}
