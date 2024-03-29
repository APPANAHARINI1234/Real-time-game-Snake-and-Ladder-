import board.Board;
import player.Player;
import logic.Logic;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Board board=new Board();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of players:");
        int n=sc.nextInt();
        Player[]player=new Player[n];
        for(int i=0;i<n;i++){
            player[i]=new Player();
            System.out.println("Enter Player"+(i+1)+" details:");
            System.out.println("Enter your name :");
            player[i].setName(sc.next());
            System.out.println("Enter your age :");
            player[i].setAge(sc.nextInt());
            System.out.println("Enter your contact :");
            player[i].setContact(sc.nextDouble());
        }
        System.out.println("Players details: ");
        for(int i=0;i<n;i++){
            player[i].getPlayer();
        }
        System.out.println(" Board configuration:");
        board.getBoardConfig();
        int flag=0;
        while(true){
        for(int i=0;i<n;i++){
            System.out.println("Its your turn "+player[i].name);
            System.out.println("Select 1 to play");
            int s=sc.nextInt();
            if(s==1){
           Logic logic=new Logic(board,player[i]);
           logic.checkSnakeLadder();
           if(player[i].position==100){
            System.out.println(player[i].name +" is the winner ");
            player[i].getPlayer();
            flag=1;
            break;
           }
        }
        
           for(int j=0;j<n;j++)
            System.out.println(player[j].name+" is at "+player[j].position);
            System.out.println("If you want to see board configuration press 1");
        int b=sc.nextInt();
        if(b==1)
            board.getBoardConfig();
           
        }
        if(flag==1)
        break;
    }
    }
}
