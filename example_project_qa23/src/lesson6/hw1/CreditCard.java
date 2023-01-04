package lesson6.hw1;

public class CreditCard
{
    int balance;
    String number;

    void deposit(int amount)
    {
        balance += amount;
    }

    void withdraw(int amount)
    {
        balance -= amount;
    }

    @Override
    public String toString()
    {
        return "CreditCard{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                '}';
    }

    void print()
    {
        System.out.println("Card: " + number + ", balance: " + balance);
    }
}
