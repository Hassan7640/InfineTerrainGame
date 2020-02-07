package terraingame;

import java.util.Scanner;

public class Player {
      String direction;
      boolean playing = true;
        
      

    public String playerGameScene() {
    	      	 
    do {	  Scanner scanner = new Scanner (System.in);
    	 // scanner.next();
    	  System.out.println("Hello and Welcome to infinite terrain");
       	  System.out.println("Please enter the direction would you like to go!");
    	  String position=scanner.nextLine();
    	   
    		  
    		  if(position.equalsIgnoreCase("north")) {
    			  double distance= Math.hypot(5.74, 7.75);
    			  System.out.println("this is the distance you're away from the next quest " + distance);
    		  }
    		  else if(position.equalsIgnoreCase("south")) {
    			  double distance = Math.hypot(7.20, 4.50);
    			  System.out.println("this is the distance you're away from the next quest " +distance);
    		  }
    		  else if(position.equalsIgnoreCase("east")) {
    			  double distance = Math.hypot(4.75, 3.60);
    			  System.out.println("this is the distance you're away from the next quest " + distance);
    		  }else if(position.equalsIgnoreCase("west")) {
    			  double distance = Math.hypot(3.60, 4.20);
    			  System.out.println("this is the distance you're away from the next quest " +distance);
    		  }else {
    			  return null;
    		  }
    	  
    	  return position;
    	}while (playing);
    	
      }
    	 
//     public int[][] playerTreasure () {
//        //  System.out.println("heheeheh");
//    		 int[][] playerArena= new int [10][10];
//    		 // System.out.println("heheeheh");
//    		 for(int i=0; i <playerArena.length; i++) {
//       		      for (int j=0; j < playerArena[i].length; j++) {
//       		    	  System.out.println(playerArena[i][j]=='X');
//       		      }
////    	       if(playerArena[i]==i) {
//    				// System.out.println(playerArena[i][j]=='X');
//
//    			// System.out.println(playerArena[i][j]=='X');
//		
//    	  }
//
//    	   
//   			return playerArena;

//}

}
