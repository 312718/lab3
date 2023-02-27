public class Main {
    public static void main(String[] args) {

        Person znayka = new Person("Знайка");
        Person korotyshka1 = new Person("первый коротышка");
        Person korotyshka2 = new Person("второй коротышка");
        Person korotyshka3 = new Person("третий коротышка");
        Person lunatic1 = new Person("первый лунатик");
        Person lunatic2 = new Person("второй лунатик");
        Person lunatic3 = new Person("третий лунатик");

        znayka.live();
        korotyshka1.live();
        korotyshka2.live();
        korotyshka3.live();

        korotyshka1.run();
        korotyshka2.run();
        korotyshka3.run();
        znayka.tell();

    }
}