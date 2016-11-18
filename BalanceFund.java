package Task2_4;

/**
 * Created by Дима on 19.11.2016.
 */
public class BalanceFund {
    public static void main(String[] args) {
        int[] balances = {1200,250,2000,500,3200};
        String[] Owners = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String Name = Owners [(int) (Math.random() * Owners.length)];
        int fund = (int) (Math.random() * 100);
        fund(balances, Owners, Name, fund);

    }
    public static void fund(int[] balances, String[] Owners, String Name, int fund){
        int BalanceOwner = 0;
        for (int i =0; i < Owners.length; i++){
            if (Owners[i] == Name){
                BalanceOwner = balances[i];

            }else{
                continue;

            }
            double BalanceAfter = BalanceOwner + fund;

            System.out.println(Name + " " + BalanceAfter);


        }

    }
}
