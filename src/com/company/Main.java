package com.company;

public class Main {

    public static void main(String[] args) {
	// Basics ops
        //Addition == +
        //Subtraction == -
        //Multiplication == *
        //Division == /
        //Remainder == %

    // Relational ops
        // == - Equals to or Comparison Operator.
        // != - Not Equal
        // > - Greater than
        // < - Less than
        // >= - Greater than or Equal to
        // <= - Less than or Equal to

        double firstNum = 36;
        double secondNum = 5;

        double result = 0;
        result = firstNum % secondNum;

    //  Logical ops
         // (&&) - And
         // (||) - Or
         // (!)  - Not

        boolean isOld = true;
        boolean isNew = false;

        //If Statements
        if((isOld || !isNew) && (firstNum < secondNum)) {
            System.out.println("Hello");
        }
        else {
            System.out.println("Not Right");
        }



    }
}
