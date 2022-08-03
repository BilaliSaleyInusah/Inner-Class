import java.util.Scanner;

import javax.swing.ButtonModel;

// import GearBox.Gear;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");

    public static void main(String[] args) {
        // GearBox myCar = new GearBox(6);
        // GearBox.Gear myGear = myCar.new Gear(1, 12.5);
        // GearBox.Gear myGear2 = myCar.new Gear(1, 12.5);
        // System.out.println(myGear.drivingSpeed(4));

        // myCar.operateClutch(true);
        // myCar.addGear(1, 6.6);
        // myCar.addGear(3, 12.3);
        // myCar.addGear(5, 18.0);
        
        // myCar.changeGear(1);
        // myCar.changeGear(2);
        // myCar.wheelSpeed(5);
        // myCar.operateClutch(false);
        // System.out.println(myCar.wheelSpeed(5));


        // local class
        // class ClickListener implements Button.OnclickListener{

        //     public ClickListener(){
        //         System.out.println("I've been attached");
        //     }

        //     @Override
        //     public void onClick(String title) {
        //         System.out.println(title + " was clicked");
                
        //     }
            
        // }
        // buttonPrint.setOnclickListener(new ClickListener());


        buttonPrint.setOnclickListener(new Button.OnclickListener() {
                    
                    @Override
                    public void onClick(String title) {
                        System.out.println(title + " was clicked");
                        
                    }
        });
        listen();

    }

    private static void listen(){
        boolean quite = false;
        while (!quite) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quite = true;
                    break;
                case 1:
                    buttonPrint.onClick();
                    break;
            }
        }
    }


}