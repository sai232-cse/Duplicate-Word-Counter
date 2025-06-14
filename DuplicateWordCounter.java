import java.util.Scanner;
public class DuplicateWordCounter{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the string:");
        String s=snr.nextLine();
        String words[]=s.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
        }
        System.out.println("The number of duplicates are: " + count);
    }
}