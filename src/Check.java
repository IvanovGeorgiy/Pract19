import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Check {
    public boolean notRegCheck(String Inn){
        Pattern pattern = Pattern.compile("[0-9]{12}");
        Matcher matcher = pattern.matcher(Inn);
        return !matcher.matches();
    }
    public String checkInn(String Inn) throws Exception {
        if (notRegCheck(Inn)){
            throw new Exception("Инн введен не правильно");
        }
        return "Ваш инн " + Inn + " принят";
    }
    public void printCheckInn(String Inn) throws Exception {
        System.out.println(checkInn(Inn));
    }
    public void getInn() throws Exception {
        Scanner sc = new Scanner(System.in);
        String Inn = sc.nextLine();
        while (notRegCheck(Inn)){
            try {
                printCheckInn(Inn);
            } catch (Exception e){
                System.out.println("Введите Инн из 12 цифр от 0 до 9");
                Inn = sc.nextLine();
            }
        }
        printCheckInn(Inn);
    }
}
