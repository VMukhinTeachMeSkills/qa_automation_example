package lesson9.hw1;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Map<Character, Character> bracketsMap = Map.of(
                '{', '}',
                '[', ']',
                '(', ')',
                '<', '>');
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] brackets = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets)
        {
            if (bracketsMap.containsKey(bracket))
            {
                stack.push(bracket);
            }
            else
            {
                try
                {
                    Character current = stack.pop();
                    if (bracketsMap.get(current) == bracket && current == bracket)
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("False");
                        return;
                    }
                }
                catch (EmptyStackException e)
                {
                    System.out.println("False");
                    return;
                }
            }
        }

        if (stack.isEmpty())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
