public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bartek ");
        Person person2 = new Person("Anna");
        Person person3 = new Person("Jola");

        person1.addMoney(666,Currency.EUR);
        person1.addMoney(2000);
        person2.addMoney(200,Currency.USD);
        person3.addMoney(9000);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println("==============================");
        person1.removeMoney(100,Currency.EUR);
        person2.addMoney(100,Currency.EUR);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
