import javax.swing.*;

public class FindRent {
    public static void main(String args[]){
        int [] [] rents = {{400, 450, 510, 505},
                           {500, 560, 630, 640},
                           {645, 676, 740, 850},
                           {1000, 1250, 1600, 1620},
                           {1630, 1750, 1910, 2000},
                           {2130, 2360, 2500, 10000}};

        String entry;
        int floor;
        int bedrooms;

        entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms. ");
        bedrooms = Integer.parseInt(entry);

        if(floor >= 7) {
            System.out.println("THAT IS NOT A FLOOR DUMMY");
        }
        else {
            JOptionPane.showMessageDialog(null, "The rest for a "
                    + bedrooms + " bedroom apartment floor " + floor + " is $" + rents[floor][bedrooms]);
        }
    }
}
