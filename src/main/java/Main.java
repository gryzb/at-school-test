import somepackage.Other;
import somepackage.Some;

public class Main {
    public static void main(String[] args) {

        Other.saySomthing();
        Some some = new Some("String for constructor");
        some.setNoMoreSecrets("Hello");
        System.out.println(some.getNoMoreSecrets());
        some.setNoMoreSecrets(123);
        System.out.println("I'm already string: " + some.getNoMoreSecrets());
        System.out.println(some.getSecret());
        some.getSecret(Boolean.TRUE);
        System.out.println(some.getSecret());
        System.out.println(some.toString());
        System.out.println(some.count());
        System.out.println(some.getДаТакТожеМожно());
        some.soTellMeAboutInterfaces();
    }
}


