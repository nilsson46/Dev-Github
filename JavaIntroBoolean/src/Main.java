public class Main {

        public static void main(String[] args){

            //int speedLimit = 80;
            //int vehicleSpeed = 75;

            //boolean isPastSpeedLimit = vehicleSpeed > speedLimit;

            //System.out.println(isPastSpeedLimit);

            //int accountBalance = 1000;
            //int shirtPrice = 800;
            //int sunglassPrice = 250;

            //boolean hasEnoughMoney = (sunglassPrice + shirtPrice) < accountBalance;

            //System.out.println(hasEnoughMoney);

            //int claimedAge = 37;
            //int actualAge = 40;

            // == logisk operator logisk är lika med

            //boolean isClaimedAgeCorrect = claimedAge == actualAge;

            //System.out.println(isClaimedAgeCorrect);

            //String firstName = "Simon";
            //String secondName = "Anna";

            //boolean isSameName = firstName.equals(secondName);

            //System.out.println(isSameName);

            //String username = "CowFarmer21";
            //int usernameMinLimit = 7;
            //int usernameMaxLimit = 15;

            //boolean isValidUsername = username.length() > usernameMinLimit && username.length() < usernameMaxLimit;

            //System.out.println(isValidUsername);

            //boolean isEngineOk = true;
            //boolean isBreakOperational = true;
            //boolean isLightWorking = true;
            //boolean isCommunicationOperational = true;

            //if (isEngineOk) {
                //System.out.println("Engine is working!");
            //} else {
              //  System.out.println("ERROR - Engine is NOT working");
            //}

            //if(isBreakOperational) {
                //System.out.println("Breaks is working just fine!");
            //} else {
              //  System.out.println("ERROR - Breaks are not functioning!");
            //}
            //boolean isAirplaneOK = isEngineOk && isBreakOperational;

            //if (isAirplaneOK) {
                //System.out.println("Airplane is working!");
            //} else {
              //  System.out.println("ERROR - Something is wrong");
            //}

            // Om listan är längre så vill man ha reda på om minst en inte fungerar.

            //if (!isEngineOk) {
               // System.out.println("Engine is not working");

            //} else if(!isBreakOperational) {
                //System.out.println("ERROR-Breaks are not operational");
            //} else if(!isLightWorking) {
                //System.out.println("ERROR - Lights are nog working");
            //} else if(!isCommunicationOperational) {
              //  System.out.println("ERROR - Communication is not operational");
            //} else {
              //  System.out.println("Airplane is working");
            //}

           int age = -10;

           if (age < 12) {
               System.out.println("Child");
           } else if (age < 18) {
               System.out.print("Teenager");
           } else if (age < 21) {
               System.out.println("Almost adult");
           } else if(age < 120) {
               System.out.println("Adult");
           }else if(age > 120) {
               System.out.println("I do not believe you");
           } else if(age < 0) {
               System.out.println("You are not born yet :D");
           }



        }
}


