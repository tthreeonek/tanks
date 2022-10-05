package ru.mirea.task1;

public class args{
    static int main(int n){
        System.out.println("Задание номер 5");
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(main(5));
    }
}