package com.bank.node;

    public class HappyNumber {

        public boolean isHappy(int n) {
            // 1. checks If the number is less than or equal to 0, it's not a happy number
            if (n <= 0) {
                return false;
            }
            // 1. checks If the number is 1, it's a happy number
            else if (n == 1) {
                return true;
            }
            // 2. checks If the number has been visited before, it's not a happy number (to avoid infinite loop)
            else if (visited(n)) {
                return false;
            }
            // 3. Move!!! Otherwise, check the next number in the sequence
            else {
                // 1. Mark the current number as visited? done
                visit(n);
                // 2.  Calculate the next number in the sequence
                int next = getNext(n);
                // 3. Check if the next number is a happy number?
                return isHappy(next);
            }
        }

        // Help to calculate the sum of the squares of digits
        private int getNext(int n) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
        }

        // Help to keep track of visited numbers
        private boolean[] visited = new boolean[1000];

        private void visit(int n) {
            visited[n] = true;
        }

        private boolean visited(int n) {
            return visited[n];
        }

        public static void main(String[] args) {
            HappyNumber happyNumber = new HappyNumber();

            // Example 1
            int n1 = 19;
            System.out.println("Example 1:");
            System.out.println("Is " + n1 + " a happy number? " + happyNumber.isHappy(n1));

            // Example 2
            int n2 = 20;
            System.out.println("Example 2:");
            System.out.println("Is " + n2 + " a happy number? " + happyNumber.isHappy(n2));
        }
    }

    /*  Imagine you have two buckets, Bucket A and Bucket B. Each bucket can hold something like toys or candies. Now, let's say Bucket A has some candies in it, and you want to move all those candies to Bucket B.

Here's how it works:

You pick up one candy at a time from Bucket A.
You put that candy into Bucket B.
You keep doing this until there are no more candies left in Bucket A.
Now, when you look inside Bucket B, you see all the candies that were originally in Bucket A.
In Java, variables are like these buckets, and the candies are the information stored in them.
When we say one variable is assigned to another,
we're simply copying all the information from one variable to another.


We have a HappyNumber class with a isHappy method to check
if a number is happy or not.
The isHappy method uses recursion to repeatedly calculate the sum of the squares of digits until it reaches either 1 (a happy number) or a previously visited number (an unhappy number).
We use the getNext method to calculate the next number in the sequence.
We use an array visited to keep track of visited numbers to avoid an infinite loop.
In the main method, we test the isHappy method with the provided examples.

*/


