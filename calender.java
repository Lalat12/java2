import java.util.Scanner;
class Source {
	
public static void main(String args[]) {
	
Scanner scan = new Scanner(System.in);

String month = scan.nextLine();

int date = scan.nextInt();
		
int day = 0;
	switch (month) {
		case "January":
		day = date;
		break;
			case "February": 
			day = 31 + date;
			break;
				case "March":
				day = 28+31+date;
				break;
					case "April":
					day=28+31+31+date;
					break;
						case "May":
						day=28+31+31+30+day;
						break;
							case "June":
			                    		day=28+31+31+30+31+day;
			                		break;
			                			case "July":
			                    			day=28+31+31+30+31+30+day;
			                			break;
			                				case "August":
			                    				day=28+31+31+30+31+30+31+day;
			                				break;
			                					case "September":
			                					day=28+31+31+30+31+30+31+31+day;
			                					break;
			                						case "October":
			                    						day=28+31+31+30+31+30+31+31+30+day;
			                						break;
			                							case "November":
			                    							day=28+31+31+30+31+30+31+31+30+31+day;
			                							break;
													case "December":
			                     								day=28+31+31+30+31+30+31+31+30+31+30+day;
			                								break;
		
		}
		int dayNumber = day % 7;
		if (dayNumber==1) {
			System.out.print("Monday");
		} else if(dayNumber==2){
			System.out.print("Tuesday");
		}else if(dayNumber==3){
			System.out.print("Tuesday");
		}else if(dayNumber==4){
			System.out.print("Wednesday");
		}else if(dayNumber==5){
			System.out.print("Thursday");
		}else if(dayNumber==6){
			System.out.print("Friday");
		}else if(dayNumber==7){
			System.out.print("Saturday");
		}else if(dayNumber==0){
			System.out.print("Sunday");
		}
		
		scan.close();
		
		
	}
}