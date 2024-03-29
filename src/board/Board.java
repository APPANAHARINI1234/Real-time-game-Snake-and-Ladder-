
package board;
import java.util.*;
public class Board {
    String[][]board=new String[10][10];
   public HashMap<String,String>Snake=new HashMap<>();
   public HashMap<String,String>Ladder=new HashMap<>();
   public Board(){
      Snake.put("62","18");
      Snake.put("97","78");
      Snake.put("95","56");
      Snake.put("88","24");
      Snake.put("36","6");
      Snake.put("48","26");
      Snake.put("32","10");
      Ladder.put("1","38");
      Ladder.put("1","38");
      Ladder.put("21","42");
      Ladder.put("80","99");
      Ladder.put("4","14");
      Ladder.put("8","30");
      Ladder.put("28","76");
      Ladder.put("50","67");
      Ladder.put("71","92");
      for(int i=0;i<10;i++){
        if(i%2==0){ 
        for(int j=0;j<10;j++){
            int val=i*10+j+1;
           board[i][j]=val+"";
        }
      }
      else{
        for(int j=0;j<10;j++){
            int val=i*10+(10-j-1)+1;
           board[i][j]=val+"";
        }
      }
    }
    for(String x:Snake.keySet()){
        int a=Integer.parseInt(x);
        int row=(a-1)/10;
        if(row%2==0){
            int col=(a-1)%10;
            board[row][col]+="(SnakeStart)";
        }
        else{
            int col=9-(a-1)%10;
            board[row][col]+="(SnakeStart)";
        }
        int b=Integer.parseInt(Snake.get(x));
         row=(b-1)/10;
        if(row%2==0){
            int col=(b-1)%10;
            board[row][col]+="(SnakeEnd)";
        }
        else{
            int col=9-(b-1)%10;
            board[row][col]+="(SnakeEnd)";
        }
    }

   
   for(String x:Ladder.keySet()){
    int a=Integer.parseInt(x);
    int row=(a-1)/10;
    if(row%2==0){
        int col=(a-1)%10;
        board[row][col]+="(LadderStart)";
    }
    else{
        int col=9-(a-1)%10;
        board[row][col]+="(LadderStart)";
    }
    int b=Integer.parseInt(Ladder.get(x));
     row=(b-1)/10;
    if(row%2==0){
        int col=(b-1)%10;
        board[row][col]+="(LadderEnd)";
    }
    else{
        int col=9-(b-1)%10;
        board[row][col]+="(LadderEnd)";
    }
}
   }
   public void getBoardConfig(){
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
    for(int i=9;i>=0;i--){
        for(int j=0;j<10;j++){
            System.out.print(board[i][j]+"  ");
        }
        System.out.println();
        System.out.println("*******************************************************************************************************************************************");

    }
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
   
   }

}
