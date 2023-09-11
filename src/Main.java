public class Main {
    public static void main(String[] args)
    {System.out.println("Hello world!");

    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);


    dog = dog + 4;
    System.out.println(dog);
    cat = cat + 4;
    System.out.println(cat);
    paper = paper + 4;
    System.out.println(paper);


    dog = dog - 3.5;
    System.out.println(dog);
    cat = cat - 1.6;
    System.out.println(cat);
    paper = paper - 7639;
    System.out.println(paper);

    var friend = 19;
    System.out.println(friend);
    friend = friend + 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);

    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);


    var weightOfTheFirstBoxer = 78.2;
    var weightOfTheSecondBoxer = 82.7;
    var weight = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
    System.out.println("масса двух боксёров " + weight + " кг");
    var weightDifference = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
    System.out.println("разница в весе у боксёров " + weightDifference + " кг");
    var weightDifferenceTwo = weightOfTheSecondBoxer % weightOfTheFirstBoxer;
    System.out.println("разница в весе по методу остаток деления " + weightDifferenceTwo + " кг");


    var allWorkTime = 640;
    var workingDay = 8;
    var employees = allWorkTime / workingDay;
    System.out.println("всего работников в компании " + employees + " человек");

    employees = employees + 94;
    System.out.println(employees);
    var time = allWorkTime / employees;
    System.out.println("Если в компании работает " + employees + " человек, то всего " + time + " часов работы");
    }
}