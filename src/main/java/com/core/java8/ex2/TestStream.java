package com.core.java8.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TestStream {

    public static void main(String args[]) {
        Trader raul = new Trader("Raul", "Kumta");
        Trader mario = new Trader("Mario", "sirsi");
        Trader alan = new Trader("Alan", "Balugum");
        Trader maga = new Trader("Maga", "Kerala");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(maga, 2022, 2000),
                new Transaction(alan, 2021, 1100),
                new Transaction(raul, 2021, 3100),
                new Transaction(mario, 2021, 7800),
                new Transaction(mario, 2023, 7800));

        // find the all transcations 2021 and sort by value
        List<Transaction> transactions2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(Transaction::getValue)).collect(Collectors.toList());

        System.out.println(transactions2011.toString());

        // what are all the unique cities where traders work

        List<String> transcationCity = transactions.stream().map(t -> t.getTrader().getCity()).distinct()
                .collect(Collectors.toList());
        System.out.println(transcationCity);

        // return the string of all traders names sorted alphabetically
        String trader = transactions.stream().map(tr -> tr.getTrader().getName()).distinct().sorted().reduce("",
                (n1, n2) -> n1 + n2);
        System.out.println(trader);

        // all transcations values from the traders living in sirsi
        transactions.stream().filter(t -> "sirsi".equals(t.getTrader().getCity())).map(Transaction::getValue)
                .forEach(System.out::println);
        ;

        // find the trascation with smallest value
        Optional<Transaction> samlles = transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(samlles);
    }

}
