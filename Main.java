public class Main {
    public static void main(String[] args){
         // if, else if, else
        int numeroIf = 0;

        if(numeroIf < 0){
            System.out.println("The variable numeroIf" + numeroIf + "it is negative");
        } else if (numeroIf > 0) {
            System.out.println("The variable numeroIf" + numeroIf + "It is positive");
        } else {
            System.out.println("The variable numeroIf It is 0");
        }
    }
}

// while
    int numberWhile = 1;

 while(numberwhile < 3) {
     numberWhile++;
     System.out.println("The new value of variable numberWhile is: " + numberWhile);
        }

 //doWhile

int numberdoWhile = 3,

do {
     numberdoWhile++;
     System.out.println("The new value of variable numberdiWhile is: " + numberdoWhile );
        } while(numbedoWhile < 3);

//for

for(int numberFor =0; numberFor <= 3; numberFor){
    System.out.println("The new value of variable numberFor is: " + numberFor )
        }

//switch

String season = "spring";
     switch(season) {
         case "spring":
             System.out.println("It is spring");
             break;
         case "summer":
             System.out.println("It is summer");
             break;
         case "fall":
              System.out.println("It is fall");
              break;
         case "winter":
             System.out.println("It is winter");
             break;
             default:
                 System.out.println("It is not a season");
        }
      }

}
