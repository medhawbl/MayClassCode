package com.wbl.loopsandoperators;

public class LoopsExample {
	
	public static void whileAndDoWhileLoop(){
		
		int i=11;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		System.out.println("After While loop");
	}
	
	public static void doWhileLoop(){
		
		int i=11;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println("After Do While loop");
	}
		
	public static void forLoop(){
		
		for(int i=1 ; i<=10 ; i++){
			System.out.println(i);
		}

	}
	
	//Hello - (a, e, i,o,u) - 2
	public static void countVowels(String s){
		
		int count = 0;
		String lowerS = s.toLowerCase();
		
		for(int i=0; i<lowerS.length(); i++){
			char ch = lowerS.charAt(i);
			if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ){
				count++;
			}
		}
		System.out.println("Number of Vowels in the given String : " + count);
	}

	public static void main(String[] args) {
		
		//whileAndDoWhileLoop();
		//doWhileLoop();
		//forLoop();
		countVowels("Hello");
		
		/*switch("Apple") {
		
		case "Monday" : System.out.println("Its Monday");
		break;
		
		case "Tuesday" : System.out.println("Its Tuesday");
		break; 
		
		case "Wednesday" : System.out.println("Its Wednesday");
		break;
		
		case "Thurday" : System.out.println("Its Thurday");
		break;
		
		case "Friday" : System.out.println("Its Friday");
		break;
		
		case "Staurday" : System.out.println("Its Staurday");
		break;
		
		case "Sunday" : System.out.println("Its Sunday");
		break;
		
		default : System.out.println("Its Default");
		
		}*/
	}

}
