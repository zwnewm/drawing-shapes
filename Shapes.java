public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle turtle = new Turtle();
        int sum = 0;
        for(int i = 0; i < 4; i++){
           turtle.forward(150);
           turtle.right(90);
           sum++;
        }
        
        

        // Task 2: Draw a regular shape many times
        turtle.up();
        turtle.setPosition(100, 200, 1);
        turtle.down();
        
        for(int i = 0; i < 2; i++){
         turtle.backward(50);
            for(int x = 0; x < 4; x++){
              turtle.forward(150);
              turtle.right(90);
              sum++;
            }
        
        
        }

        // Task 3: How many times does Turtle turn!
        turtle.up();
        turtle.setPosition(-120, 50, 1);
        turtle.down();
        
        
        for(int i = 0; i < 2; i++){
         turtle.backward(50);
            for(int x = 0; x < 4; x++){
              turtle.forward(150);
              turtle.right(90);
              sum++;
              
            }
        
        }
        System.out.print("Turtle has turned " + sum + " times!");


        // Extension 1:


        // Extension 2:

    }
}