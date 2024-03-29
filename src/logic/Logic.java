package logic;
import board.Board;
import player.Player;
import java.util.*;
public class Logic {
    Board board;
    Player player;
   public Logic(Board board,Player player){
        this.board=board;
        this.player=player;
    
    
    Random rand=new Random();
    int random=rand.nextInt(1,7);
    int i=0;
  
    while(random==6){
       System.out.println("Hooray you got 6 ");
       player.position=player.position+6;
        if(player.position>100)
         player.position-=random;
         random=rand.nextInt(1,7);
    
    }
    System.out.println("You got "+random);
    player.position=player.position+random;
    if(player.position>100){
        System.out.println("Its more than 100");
    player.position-=random;
    }

}
public void checkSnakeLadder(){
   
    if(board.Snake.containsKey(player.position+"")){
        System.out.println("OOPS its a snake at  "+player.position);
        player.position=Integer.parseInt(board.Snake.get(player.position+""));
       System.out.println("Now you are at position :"+player.position);
    }
    if(board.Ladder.containsKey(player.position+"")){
        System.out.println("Hooray its a ladder at  "+player.position);
        player.position=Integer.parseInt(board.Ladder.get(player.position+""));
        System.out.println("Now you are at position :"+player.position);
    }
}

}
