package stream;


import stream.beautifier.PoemBeautifier;
import stream.lambda.ExpressionExecutor;
import stream.reference.FunctionalCalculator;
import stream.iterate.NumberGenerator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("to jest EXAMPLE", text -> text.toUpperCase());
        poemBeautifier.beautify("to jest EXAMPLE", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("to jest EXAMPLE", text -> text.toUpperCase().substring(3, 7));
        poemBeautifier.beautify("to jest EXAMPLE", text -> text.toLowerCase());


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumberGenerator.generateEven(20);

    }

}

