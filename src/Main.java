import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
       ////////////Задача1
       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       ///////////Задача 2
        cat = cat + 4;
        dog = dog + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //////////Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //////////Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend =  friend / 7;
        System.out.println(friend);
        /////////Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = (frog * 10) /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        ////////Задача 6
        var manOne = 78.2;
        var manTwo = 82.7;
        var result = manOne + manTwo;
        System.out.println("Общая масса двух бойцщв равна " + result + " кг");
        var resultTwo = manTwo - manOne;
        System.out.println("Разница между массами боцов равна " + resultTwo + " кг");
        //////////Задача 7
        var resulT = manTwo % manOne;
        System.out.println("Остаток от деления между двумя весами равен " + resulT + " кг");
        //////////////Задача 8
        var hour = 640;
        var timeWork = 8;
        var manWork = hour / timeWork;
        System.out.println("Всего работников в компании - " + manWork + " человек");
        manWork = manWork + 94;
         var resultW = hour / manWork;
        System.out.println("Если в компании работает " + manWork + " человека, то всего " + resultW + " часа работы может быть поделено между сотрудниками");


    }
}

