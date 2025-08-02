public class Day2 {
    public static void main(String[] args) {
        int salary = 24000;
        if(salary > 1000){
            salary = salary + 2000;
        }  else if(salary > 20000) {
            salary += 3000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}

