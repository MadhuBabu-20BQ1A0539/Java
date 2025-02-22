package Aug_12;
import java.util.Scanner;
public class Batsman {
	String 	name;
	 int runs;
	int matches;
	float batting_avg;
	public void setBatsmanValues(String n,int run,int match) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name : ");
	this.name=sc.next();
	System.out.println("Enter runs : ");
	this.runs=sc.nextInt();
	System.out.println("Enter matches : ");
	this.matches=sc.nextInt();
	computeBattingAverage();
	sc.close();

	}
	public void computeBattingAverage() {
		float average=runs/matches;
		if(average<=0) {
			System.out.println("Error");
		}
		else {
			System.out.println("Average : "+average);
		}
	
	}
	public void getStatistics() {
		setBatsmanValues(name,runs,matches);
		System.out.println("Name of Batsman : "+name);
		
		System.out.println("Runs : "+runs);
		if(runs<=0) {
			System.out.println("Error");return;
		}
		System.out.println("Matches : "+matches);
		
		
	
	}
}
