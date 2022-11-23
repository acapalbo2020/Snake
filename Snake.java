import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Snake {
   public static void main (final String[] args) {
      StdDraw.setXscale(-500, 500);
      StdDraw.setYscale(-500, 500);
      Serpent snake = new Serpent();
      drawBoard();
      while (true) {
         mainMenu();
         game();
         endMessage();
      }
   }

   public static void game() {
      ArrayList<Serpent> snake = new ArrayList<Serpent>();
      StdDraw.enableDoubleBuffering();
      while (snake.notDed()) {
      checkKeys();
      
      StdDraw.show();
      StdDraw.pause(20);
   }

   public static void drawBoard() {
      
   }
   
   public static void checkKeys(Serpent snake) {
      JFrame keyCommand = new JFrame();
      keyCommand.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent e) {
         int keyCode = e.getKeyCode();
         if (keyCode == KeyEvent.VK_UP) {
            snake.moveUp();
         }
         else if (keyCode == KeyEvent.VK_DOWN) {
            snake.moveDown();
         }
         else if (keyCode == KeyEvent.VK_LEFT) {
            snake.moveLeft();
         }
         else if (keyCode == KeyEvent.VK_RIGHT) {
            snake.moveRight();
        }
      }
    });
   /*   KeyEvent event = ;
      int c = event.getKeyCode();
      if (c == KeyEvent.VK_UP) {
         snake.moveUp();
      }else if (c == KeyEvent.VK_DOWN) {
         snake.moveDown();
      }else if (c == KeyEvent.VK_DOWN) {
         snake.moveRight();
      }else if (c == KeyEvent.VK_DOWN) {
         snake.moveLeft();
      }*/
   }
}
