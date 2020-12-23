package bg.softuni.fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> infectedByCity = new HashMap<>(); //String е ключа, Integer е стойността

        String command = scanner.next(); //next означава прочети следващия стринг Gabrovo 15 - в случая 15, чете всички неща които не са whitespace
        while (!command.equals("end")) {
            if (command.equals("report")) {
                String cityName = scanner.next();
                System.out.println(infectedByCity.get(cityName)); // колко заразени има в този град
            } else {
                int newlyInfected = scanner.nextInt();
                Integer currentInfected = infectedByCity.get(command); //imeto nagrada go vzemame ot komandata
                if (currentInfected == null) { // проверява се дали има стойност за този град
                    currentInfected = 0;
                }
                infectedByCity.put(command, currentInfected + newlyInfected);
            }

            command = scanner.next();
        }

        // infectedByCity.entrySet() за да се итерира мапа се записва това alt + enter -> iterate
        for (Map.Entry<String, Integer> entry : infectedByCity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

/*
Вход на задачата:
Gabrovo 15
Sofia 55
Plovdiv 19
Stara_Zagora 42
Sofia 40
Plovdiv 5
Gabrovo 30
report Gabrovo
report Sofia
Gabrovo 4
report Gabrovo
end
*/


        //Map<String, Integer> infectedByCity = new TreeMap <String, Integer>();
        // TreeMap дава подредба по азбучен ред на ключа само при извеждане на данните/в случая името на града е стринг -> лексикографска подредба
        // в скобите след TreeMap трябва да се поставят ключа и стойността: TreeMap <String, Integer>()
        //HashMap<>() не се интересува от подредбата, а просто складира асоциации и затова скобите са празни
        //HashMap<>()не гарантира в какъв ред ще бъдат изведени стойностите на конзолата
        //HashMap<>() е по-бърз от TreeMap и е по-добре да се ползва ако подредбата не ни интересува
        //LinkedHashMap гарантира реда на итерация според реда на подаването на данните
        //infectedByCity.put("Gabrovo", 15); за put - ако го има, презапиши го; ако го няма - добави го;
        // за set трябва да имаме тази стойност добавена, т.е. такъв индекс да съществува

       /* int firstDay = 15;
        int secondDay = 30;

        Integer current = infectedByCity.get("Gabrovo"); //Integer, a ne int защото само Integer връща стойност null, ако няма нищо в мапа
        if (current ==null){
            current = 0;
        }
        infectedByCity.put("Gabrovo", current + firstDay);

        current = infectedByCity.get("Gabrovo");
        if (current ==null){
            current = 0;
        }
        infectedByCity.put("Gabrovo", current + secondDay);


        System.out.println(infectedByCity.get("Gabrovo"));*/

