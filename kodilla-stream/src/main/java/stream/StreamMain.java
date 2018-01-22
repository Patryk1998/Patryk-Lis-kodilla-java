package stream;


import stream.beautifier.PoemBeautifier;
import stream.book.Book;
import stream.book.BookDirectory;
import stream.forumuser.Forum;
import stream.forumuser.ForumUser;
import stream.lambda.ExpressionExecutor;
import stream.person.People;
import stream.reference.FunctionalCalculator;
import stream.iterate.NumberGenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("to jest EXAMPLE", text -> text.toUpperCase());
//        poemBeautifier.beautify("to jest EXAMPLE", text -> "ABC" + text + "ABC");
//        poemBeautifier.beautify("to jest EXAMPLE", text -> text.toUpperCase().substring(3, 7));
//        poemBeautifier.beautify("to jest EXAMPLE", text -> text.toLowerCase());
//
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumberGenerator.generateEven(20);
//
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ')+2) +".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(s -> System.out.println(s));
//
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();

        Map<Integer, Object> theResultMap = forum.getUsersList().stream()
                .filter(user -> user.getSex() =='M')
                .filter(user -> 2018 - user.getBirthYear() > 20)
                .filter(user -> user.getPostsQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getIdentifier, user -> user ));

        System.out.println("Quantity of forum users: " + theResultMap.size());
        theResultMap.entrySet().stream()
                .map(user-> user.getKey() + ": " + user.getValue())
                .forEach(System.out::println);
    }



}

